package hello.controller;

import hello.domain.User;
import hello.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class RegisterController {
    //private int tmpUserId;

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }

    @PostMapping("/registration")
    public String addInfoAboutUser(User User, Map<String, Object> model){

        User UserFromDB = userRepo.findByUsername(User.getUsername());

        if (UserFromDB != null){
            model.put("message", "User with number or email already exists!" + User.getFIO());
            return "registrationUserInfo";
        }
        System.out.println("User : " + User.getFIO() + User.getId());
        userRepo.save(User);
        return "redirect:/login";
    }
}
