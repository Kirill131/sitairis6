package hello.controller;

<<<<<<< HEAD
import hello.domain.Master;
import hello.domain.User;
import hello.repos.MasterRepo;
import hello.repos.UserRepo;
import hello.service.MasterService;
=======
import hello.domain.Client;
import hello.domain.User;
import hello.repos.ClientRepo;
import hello.repos.UserRepo;
>>>>>>> 25a7d076a7d96fafb8c66b94842a1626bfa91689
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
<<<<<<< HEAD
=======

>>>>>>> 25a7d076a7d96fafb8c66b94842a1626bfa91689
public class MainController {
    @Autowired
    private UserRepo userRepo;

<<<<<<< HEAD
    @Autowired
    private MasterRepo masterRepo;

=======
>>>>>>> 25a7d076a7d96fafb8c66b94842a1626bfa91689
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

<<<<<<< HEAD
    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/master")
    public String masterList(Map<String, Object> model){
        Iterable<Master> masters = masterRepo.findAll();
        model.put("masters", masters);

        return "master";
    }
=======
>>>>>>> 25a7d076a7d96fafb8c66b94842a1626bfa91689
}