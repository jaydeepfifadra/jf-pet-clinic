package fifadra.pet.clinic.jfpetclinic.repositories;

import fifadra.pet.clinic.jfpetclinic.model.Vet;
import fifadra.pet.clinic.jfpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
