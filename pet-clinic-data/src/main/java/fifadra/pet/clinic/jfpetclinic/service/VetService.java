package fifadra.pet.clinic.jfpetclinic.service;

import fifadra.pet.clinic.jfpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long Id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
