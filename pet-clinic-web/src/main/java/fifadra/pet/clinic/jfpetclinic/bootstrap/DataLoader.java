package fifadra.pet.clinic.jfpetclinic.bootstrap;

import fifadra.pet.clinic.jfpetclinic.model.Owner;
import fifadra.pet.clinic.jfpetclinic.model.Vet;
import fifadra.pet.clinic.jfpetclinic.service.OwnerService;
import fifadra.pet.clinic.jfpetclinic.service.VetService;
import fifadra.pet.clinic.jfpetclinic.service.map.OwnerServiceMap;
import fifadra.pet.clinic.jfpetclinic.service.map.VetServiceMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.boot.CommandLineRunner;

@Controller
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Bansri");
        owner1.setLastName("Fifadra");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Jaydeep");
        owner2.setLastName("Fifadra");

        ownerService.save(owner2);

        System.out.println("Owner loaded");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("John");
        vet1.setLastName("Scott");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Sam");
        vet2.setLastName("Willi");

        vetService.save(vet2);

        System.out.println("Vet Loaded");
    }
}
