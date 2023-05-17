package su.fantasy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import su.fantasy.models.Race;
import su.fantasy.services.ChampionshipService;
import su.fantasy.services.RaceResultService;

@Controller
@RequestMapping("/RaceResults")
public class RaceResultController {
    @Autowired
    RaceResultService raceResultService;

    @GetMapping("/protocol/{id}")
    String getRaceProtocol(@PathVariable("id") int raceId, Model model){
        model.addAttribute("protocols", raceResultService.findRaceProtocolByRaceId(1));
        Race race = raceResultService.findRaceById(raceId);
        model.addAttribute("race", race);
        model.addAttribute("championship", ChampionshipService.championships.get(race.getChampionship()));
        return "RaceResults/protocol";
    }
}
