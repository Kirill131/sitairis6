package hello.controller;

import hello.domain.Client;
import hello.domain.User;
import hello.repos.ClientRepo;
import hello.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller

public class MainController {
    @Autowired
    private UserRepo userRepo;

    @GetMapping("/")
    public String hello() {
//        model.addAttribute("name", name);
        return "main";
    }

    @GetMapping("/main")
    public String me(Map<String, Object> model){

        return "main";
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/user")
    public String userList(Map<String, Object> model){
        Iterable<User> users = userRepo.findAll();
        model.put("users", users);
        return "user";
    }

}