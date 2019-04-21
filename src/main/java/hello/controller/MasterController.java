package hello.controller;

import hello.domain.Master;
import hello.repos.MasterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/master")
@PreAuthorize("hasAuthority('ADMIN')")
public class MasterController {
    @Autowired
    private MasterRepo masterRepo;

    @GetMapping
    public String masterList(Map<String, Object> model) {
        Iterable<Master> masters = masterRepo.findAll();
        model.put("masters", masters);

        return "master";
    }

    @PostMapping
    public String addMaster(@RequestParam String fIO, @RequestParam String date_of_birth, @RequestParam int category,
                            @RequestParam int profile, @RequestParam String year_start_working, Map<String, Object> model) {
        Master master = new Master(fIO, date_of_birth, category, profile, year_start_working);

        masterRepo.save(master);

        Iterable<Master> masters = masterRepo.findAll();
        model.put("masters", masters);

        return "master";
    }

    @PostMapping("/filter")
    public String filterMaster(@RequestParam("filter") String filter, Map<String, Object> model) {
        Iterable<Master> masters;
        if (filter != null && !filter.isEmpty()) {
            masters = masterRepo.findByFIO(filter);
        } else {
            masters = masterRepo.findAll();
        }

        model.put("masters", masters);

        return "master";
    }
}
