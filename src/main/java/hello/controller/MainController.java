package hello.controller;

import hello.domain.Client;
import hello.repos.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller

public class MainController {
    @Autowired
    private ClientRepo clientRepo;

    @GetMapping("/")
    public String hello() {
//        model.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("/main")
    public String me(Map<String, Object> model){
        Iterable<Client> users = clientRepo.findAll();
        model.put("users", users);
        return "main";
    }
}