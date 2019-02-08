package fifadra.pet.clinic.jfpetclinic.bootstrap;

import fifadra.pet.clinic.jfpetclinic.model.Owner;
import fifadra.pet.clinic.jfpetclinic.model.Pet;
import fifadra.pet.clinic.jfpetclinic.model.PetType;
import fifadra.pet.clinic.jfpetclinic.model.Vet;
import fifadra.pet.clinic.jfpetclinic.service.OwnerService;
import fifadra.pet.clinic.jfpetclinic.service.PetTypeService;
import fifadra.pet.clinic.jfpetclinic.service.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.boot.CommandLineRunner;

import java.time.LocalDate;

@Controller
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);


        Owner owner1 = new Owner();
        owner1.setFirstName("Bansri");
        owner1.setLastName("Fifadra");
        owner1.setAddress("Ghogha Circle");
        owner1.setCity("Bhavnagar");
        owner1.setTelephone("9426599499");

        Pet bansisCat = new Pet();
        bansisCat.setPetType(savedCatPetType);
        bansisCat.setBirthDate(LocalDate.now());
        bansisCat.setOwner(owner1);
        bansisCat.setName("Sweety");
        owner1.getPets().add(bansisCat);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Jaydeep");
        owner2.setLastName("Fifadra");
        owner2.setAddress("Makarba Road");
        owner2.setCity("Ahmedabad");
        owner2.setTelephone("9428257666");

        Pet jaydeepsDog = new Pet();
        jaydeepsDog.setPetType(savedDogPetType);
        jaydeepsDog.setBirthDate(LocalDate.now());
        jaydeepsDog.setOwner(owner2);
        jaydeepsDog.setName("Bhanu");

        owner2.getPets().add(jaydeepsDog);

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
