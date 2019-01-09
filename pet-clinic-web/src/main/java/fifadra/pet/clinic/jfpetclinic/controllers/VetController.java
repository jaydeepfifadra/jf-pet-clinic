package fifadra.pet.clinic.jfpetclinic.controllers;

import fifadra.pet.clinic.jfpetclinic.service.VetService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService vetService;

    @Autowired
    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets","/vets/index","vets/index.html"})
    public String listVets(Model model){
        System.out.println("Loading vets " + vetService.findAll().size());
        model.addAttribute("vets",vetService.findAll());
        model.addAttribute("name","Jaydeep");
        return "vets/index";
    }
}
