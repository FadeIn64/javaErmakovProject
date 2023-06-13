package su.fantasy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import su.fantasy.models.Race;

import java.util.ArrayList;

@Controller
public class SecurityController {
    @GetMapping("/login")
    String login(Model model){
        model.addAttribute("races", new ArrayList<Race>());
        return "security/login";
    }
}
