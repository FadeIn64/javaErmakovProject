package su.fantasy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import su.fantasy.services.RaceService;

@Controller
@RequestMapping("/races")
public class RaceController {
    @Autowired
    RaceService raceService;
    @GetMapping("/actual")
    String getActual(Model model){
        model.addAttribute("races", raceService.findActual());
        return "races/actual";
    }

    @GetMapping("/mypredicts/{id}")
    String getUserPredicts(@PathVariable("id") int id, Model model){
        model.addAttribute("races", raceService.findPredictedByUser(id));
        return "races/mypredicts";
    }
}
