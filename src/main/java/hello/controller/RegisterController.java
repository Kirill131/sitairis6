package hello.controller;

import hello.domain.*;
import hello.repos.UserRepo;
import hello.service.CarService;
import hello.service.ServService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

@Controller
public class RegisterController {

    int id_user;
    boolean flag;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private CarService carService;

    @Autowired
    private ServService servService;

    @GetMapping("/registrationUserInfo")
    public String registrationUserInfo(){
        return "registrationUserInfo";
    }

    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }

    @PostMapping("/registration")
    public String addInfoAboutUser(User User, Map<String, Object> model){

        User UserFromDB = userRepo.findByUsername(User.getUsername());

        if (UserFromDB != null){
            model.put("message", "User with number or email already exist!" + User.getFio());
            return "registrationUserInfo";
        }
        User.setActive(true);
        User.setRoles(Collections.singleton(Role.USER));
        userRepo.save(User);
        return "redirect:/login";
    }

    @GetMapping("/registerOnService")
    public String registrationOnService(User user, Map<String, Object> model){
//        id_user = id;
        System.out.println("USER = " + user.getId());
        Iterable<Car> cars =  carService.loadAllUserCars(user.getId());
        model.put("cars", cars);
        Iterable<Service> services = servService.loadAllServices();
        flag = false;
        model.put("services", services);
        model.put("flag", flag);

        return "services";
    }

    @PostMapping("/registerOnService")
    public String addServiceInOrder(@RequestParam("choiceCar") String carName,
                                    @RequestParam("choiceService") String serviceName,
                                    @RequestParam("datatimestart") String datetimestart,
                                    Map<String, Object> model){
        Car car = carService.loadCarBycarnameAndIduser(id_user, carName);
        Service service = servService.loadServiceByname(serviceName);
        flag = true;
//
//        Order order = new Order(id_user, car, datetimestart, "new" );
        if (carName != null ) {
            ArrayList<String[]> viewInfo = new ArrayList<>();

            String[] tmp = null;
            tmp[0] = carName;
            tmp[1] = serviceName;
            tmp[2] = datetimestart;
            tmp[3] = service.getCost();
            viewInfo.add(tmp);

//        ArrayList<Order> orderLine = new ArrayList<>();
//        orderLine.add(order);
            model.put("OrderLines", viewInfo);
            model.put("flag" , flag);
        }

        return "services";
    }
}
