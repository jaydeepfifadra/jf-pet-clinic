package fifadra.pet.clinic.jfpetclinic.controllers;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets","/vets/index","vets/index.html"})
    public String listVets(){
        return "vets/index";
    }
}
