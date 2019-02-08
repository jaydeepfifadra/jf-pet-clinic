package fifadra.pet.clinic.jfpetclinic.service.map;

import fifadra.pet.clinic.jfpetclinic.model.Speciality;
import fifadra.pet.clinic.jfpetclinic.model.Vet;
import fifadra.pet.clinic.jfpetclinic.service.CrudService;
import fifadra.pet.clinic.jfpetclinic.service.SpecialityService;
import fifadra.pet.clinic.jfpetclinic.service.VetService;
import fifadra.pet.clinic.jfpetclinic.service.map.AbstractMapService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {

    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

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

        if(object.getSpecialities().size() > 0){
            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId() == null){
                    Speciality savedSpeciality = specialityService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }
        return super.save(object);
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
