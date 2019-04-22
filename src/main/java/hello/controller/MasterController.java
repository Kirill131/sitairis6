package hello.controller;

import hello.domain.Master;
import hello.service.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("/master")
@PreAuthorize("hasAuthority('ADMIN')")
public class MasterController {
    @Autowired
    private MasterService masterService;

    @GetMapping
    public String masterList(Map<String, Object> model) {
        Iterable<Master> masters = masterService.loadAllMasters();
        model.put("masters", masters);

        return "master";
    }

    @PostMapping
    public String addMaster(@RequestParam String fIO, @RequestParam String date_of_birth, @RequestParam int category,
                            @RequestParam int profile, @RequestParam String year_start_working, Map<String, Object> model) {
        Master master = new Master(fIO, date_of_birth, category, profile, year_start_working);

        masterService.saveMasters(master);

        Iterable<Master> masters = masterService.loadAllMasters();
        model.put("masters", masters);

        return "master";
    }

    @PostMapping("/filter")
    public String filterMaster(@RequestParam("filter") String filter, Map<String, Object> model) {
        Iterable<Master> masters;
        if (filter != null && !filter.isEmpty()) {
            masters = masterService.loadMasterByFIO(Integer.parseInt(filter));
        } else {
            masters = masterService.loadAllMasters();
        }

        model.put("masters", masters);

        return "master";
    }

    @PostMapping("deleteMaster")
    public String deleteEvent(@RequestParam("masterId") Master master, Map<String, Object> model){
        masterService.deleteMaster(master);

        Iterable<Master> masters = masterService.loadAllMasters();
        model.put("masters", masters);

        return "master";
    }

    @GetMapping("{master}")
    public String editMaster(@PathVariable Master master, Model model){
        model.addAttribute("thisMaster", master);

        return "master";
    }
}
