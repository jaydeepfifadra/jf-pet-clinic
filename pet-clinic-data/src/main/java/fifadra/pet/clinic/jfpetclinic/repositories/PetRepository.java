package fifadra.pet.clinic.jfpetclinic.repositories;

import fifadra.pet.clinic.jfpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
