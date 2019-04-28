package hello.controller;

import hello.domain.Car;
import hello.domain.Master;
import hello.domain.User;
import hello.service.CarService;
import hello.service.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("/carlist")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public String carList(@RequestParam("id") int id, Map<String, Object> model) {
        Iterable<Car> cars = carService.loadAllUserCars(id);
        model.put("cars", cars);

        return "carList";
    }

    @PostMapping
    public String addCar(Car car, @RequestParam("id") int id,  Map<String, Object> model) {
        car.setIduser(id);

        carService.saveCar(car);

        Iterable<Car> cars = carService.loadAllUserCars(id);
        model.put("cars", cars);

        return "carList";
    }

    @PostMapping("/filter")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String filterCar(@RequestParam("filter") String filter, Car car, Map<String, Object> model) {
        Iterable<Car> cars;
        if (filter != null && !filter.isEmpty()) {
            cars = carService.loadCarByVincode(filter);
        } else {
            cars = carService.loadAllUserCars(car.getIduser());
        }

        model.put("cars", cars);

        return "carList";
    }

    @PostMapping("deleteCar")
    public String deleteEvent(Car car,  Map<String, Object> model){
        carService.deleteCar(car);

//        carList(id, model);

        Iterable<Car> cars = carService.loadAllUserCars(car.getIduser());
        model.put("cars", cars);

        return "carList";
    }

//    @GetMapping("/{car}")
//    public String editCar(@PathVariable Car car, Model model) {
//        model.addAttribute("car", car);
//        return "editCar";
//    }

//    @PostMapping("/show")
//    public String edit(@RequestParam String fIO, @RequestParam String date_of_birth, @RequestParam int category, @RequestParam String profile,
//                       @RequestParam String year_start_working, @RequestParam("idmaster") Master master){
//
//        master.setfIO(fIO);
//        master.setDate_of_birth(date_of_birth);
//        master.setCategory(category);
//        master.setProfile(profile);
//        master.setYear_start_working(year_start_working);
//        masterService.saveMasters(master);
//
//        return "redirect:/master";
//    }
}

