package hello.controller;

import hello.domain.User;
import hello.domain.User;
import hello.repos.UserRepo;
import hello.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Map;

@Controller
public class RegisterController {
    private int tmpUserId;
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private UserRepo UserRepo;

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

        User UserFromDB = UserRepo.findByUsername(User.getUsername());

        if (UserFromDB != null){
            model.put("message", "User with number or email already exist!" + User.getFIO());
            return "registrationUserInfo";
        }
        System.out.println("User : " + User.getFIO() + User.getId());
        UserRepo.save(User);
        return "redirect:/login";
    }

//    @PostMapping("/registration")
//    public String addNewUser(User user, Map<String, Object> model){
//        User userFromDb = userRepo.findByUsername(user.getUsername());
//        System.out.println("Login " + user.getUsername());
//        if (userFromDb != null){
//            model.put("message", "User already exist!");
//            return "registration";
//        }
////        user.setId_User(tmpUserId);
////        user.setRole(1);
//        userRepo.save(user);
//        return "redirect:/login";
//    }

}
