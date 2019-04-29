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

import java.util.Collections;
import java.util.Map;

@Controller
public class RegisterController {

    int id_user;

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
    public String registrationOnService(@RequestParam("id_user") int id, Map<String, Object> model){
        id_user = id;
        Iterable<Car> cars = carService.loadAllUserCars(id);
        model.put("cars", cars);
        Iterable<Service> services = servService.loadAllServices();
        model.put("services", services);

        return "services";
    }

    @PostMapping("/registerOnService")
    public String addServiceInOrder(@RequestParam("choiceCar") String carName,
                                    @RequestParam("choiceService") String serviceName,
                                    @RequestParam("datatimestart") String datetimestart,
                                    Map<String, Object> model){
        Car car = carService.loadCarBycarnameAndIduser(id_user, carName);


        Order order = new Order(id_user, car.getIdcar(), datetimestart, "new" );

        return "services";
    }
}
