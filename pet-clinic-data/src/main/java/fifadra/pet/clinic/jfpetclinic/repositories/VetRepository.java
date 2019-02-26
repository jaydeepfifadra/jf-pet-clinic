package fifadra.pet.clinic.jfpetclinic.repositories;

import fifadra.pet.clinic.jfpetclinic.model.Pet;
import fifadra.pet.clinic.jfpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
