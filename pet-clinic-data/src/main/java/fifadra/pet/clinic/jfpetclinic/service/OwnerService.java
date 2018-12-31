package fifadra.pet.clinic.jfpetclinic.service;

import fifadra.pet.clinic.jfpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);
    Owner findById(Long Id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
