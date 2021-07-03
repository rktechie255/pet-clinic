package org.rktechie.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String homePage(Model model){
        model.addAttribute("homeTitle", "Welcome to Pet-Clinic app!!");
        return "index";
    }
}
