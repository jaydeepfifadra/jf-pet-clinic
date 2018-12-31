package fifadra.pet.clinic.jfpetclinic.service;

import fifadra.pet.clinic.jfpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long Id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
