package org.rktechie.petclinic.controller;

import org.rktechie.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String ownersList(Model model) {
        model.addAttribute("ownersLabel", "Welcome to Pet-Clinic app- Owners list!!");
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}
