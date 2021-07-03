package org.rktechie.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/pet")
public class PetController {

    @RequestMapping({"", "/","/pet-index", "/pet-index.html"})
    public String petList(Model model){
        model.addAttribute("petListLabel", "Welcome to Pet-Clinic pets list");
        return "pet/pet-index";
    }
}
