package fifadra.pet.clinic.jfpetclinic.service.map;

import fifadra.pet.clinic.jfpetclinic.model.Vet;
import fifadra.pet.clinic.jfpetclinic.service.CrudService;
import fifadra.pet.clinic.jfpetclinic.service.VetService;
import fifadra.pet.clinic.jfpetclinic.service.map.AbstractMapService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
