package hello.controller;

import hello.domain.Client;
import hello.domain.User;
import hello.repos.ClientRepo;
import hello.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Map;

@Controller
public class RegisterController {
    private int tmpclientId;
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ClientRepo clientRepo;

    @GetMapping("/registrationClientInfo")
    public String registrationClientInfo(){
        System.out.println("TEST IN GET");
        return "registrationClientInfo";
    }

    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }

    @PostMapping("/registrationClientInfo")
    public String addInfoAboutClient(Client client, Map<String, Object> model){

        Client clientFromDB = clientRepo.findByPhoneAndEmail(client.getPhone(),
                                                             client.getEmail());

        if (clientFromDB != null){
            model.put("message", "Client with number or email already exist!" + client.getFIO());
            return "registrationClientInfo";
        }
        System.out.println("Client : " + client.getFIO() + client.getId());
        clientRepo.save(client);
        tmpclientId = client.getId();
        System.out.println("///" + tmpclientId);
        return "redirect:/registration";
    }

    @PostMapping("/registration")
    public String addNewUser(User user, Map<String, Object> model){
        User userFromDb = userRepo.findByLogin(user.getLogin());
        System.out.println("Login " + user.getLogin());
        if (userFromDb != null){
            model.put("message", "User already exist!");
            return "registration";
        }
        user.setId_client(tmpclientId);
        user.setRole(1);
        userRepo.save(user);
        return "redirect:/login";
    }

}
