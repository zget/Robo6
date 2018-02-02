package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/roboform")
    public String loadRobo(Model model){

        model.addAttribute("resume", new Resume());
        return "roboform";

    }

    @PostMapping("/roboform")
    public String displayRobo(@ModelAttribute Resume resume, Model model){

        model.addAttribute("resume", resume);
        return "confirmRobo";
    }
}
