package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class MainController {

    @GetMapping("/roboform")
    public String loadRobo(Model model){

        model.addAttribute("resume", new Resume());
        return "roboform";

    }

    @PostMapping("/roboform")
    public String displayRobo(@Valid @ModelAttribute Resume resume,  BindingResult result){

        if(result.hasErrors())
            return "roboform";

        return "confirmRobo";
    }
}
