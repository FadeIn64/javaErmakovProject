package su.fantasy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import su.fantasy.Atest.MyController;
import su.fantasy.models.Race;
import su.fantasy.repositories.RaceRepo;

import java.util.List;

@Controller
@MyController
public class TestRaceController {

    @Autowired
    RaceRepo raceRepo;

    @GetMapping("/")
    public String viewAll(Model model){
        List<Race> races = raceRepo.findAll();
        model.addAttribute("races", races);
        return "test/race";
    }

}
