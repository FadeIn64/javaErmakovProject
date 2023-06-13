package su.fantasy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import su.fantasy.services.RaceService;

@Controller
@RequestMapping("/races")
public class RaceController {
    @Autowired
    RaceService raceService;

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/actual")
    String getActual(Model model){
        model.addAttribute("races", raceService.findActual());
        return "races/actual";
    }


    @GetMapping("/mypredicts/{login}")
    @PreAuthorize("hasRole('USER') and #l.equals(authentication.name)")
    String getUserPredicts(@PathVariable("login") @Param("l") String login, Model model){
        model.addAttribute("races", raceService.findPredictedByUser(login));
        return "races/mypredicts";
    }

    @GetMapping("/end/{id}")
    String endPredict(@PathVariable("id") int id, Model model){
        System.out.println(id);
        raceService.endPredict(id);
        return "redirect:/races/actual";
    }

    //dcdf
}
