package fifadra.pet.clinic.jfpetclinic.repositories;

import fifadra.pet.clinic.jfpetclinic.model.Pet;
import fifadra.pet.clinic.jfpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
