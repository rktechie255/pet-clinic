package org.rktechie.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vet")
public class VetController {
    @RequestMapping({"", "/", "/vet-index", "/vet-index.html"})
    public String vetList(Model model) {
        model.addAttribute("vetListLabel", "Welcome to Pet-Clinic vet list");
        return "vet/vet-index";
    }
}
