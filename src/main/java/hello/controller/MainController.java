package hello.controller;

import hello.domain.Master;
import hello.domain.User;
import hello.repos.MasterRepo;
import hello.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping("/login")
    public String getLogin(@RequestParam(value = "error", required = false) String error,
                           @RequestParam(value = "logout", required = false) String logout,
                           Model model) {
        model.addAttribute("error", error != null);
        model.addAttribute("logout", logout != null);
        return "login";
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