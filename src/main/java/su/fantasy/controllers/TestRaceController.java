package su.fantasy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import su.fantasy.Atest.MyController;
import su.fantasy.models.Race;
import su.fantasy.parameterhandlers.EnableControllerParameterHandler;
import su.fantasy.repositories.RaceRepo;

import java.util.List;

@Controller
@EnableControllerParameterHandler
public class TestRaceController {

    @Autowired
    RaceRepo raceRepo;

    @GetMapping("/")
    public String viewAll(Model model){
        List<Race> races = raceRepo.findAll();
        model.addAttribute("races", races);
        return "test/race";
    }

    @GetMapping("/{hello}")
    public String viewAll(Model model,@PathVariable String hello){
        List<Race> races = raceRepo.findActual();
        model.addAttribute("races", races);
        return "test/race";
    }

}
