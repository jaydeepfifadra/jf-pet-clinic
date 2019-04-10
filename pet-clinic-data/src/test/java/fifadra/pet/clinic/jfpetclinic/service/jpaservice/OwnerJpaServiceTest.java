package fifadra.pet.clinic.jfpetclinic.service.jpaservice;

import fifadra.pet.clinic.jfpetclinic.model.Owner;
import fifadra.pet.clinic.jfpetclinic.repositories.OwnerRepository;
import fifadra.pet.clinic.jfpetclinic.repositories.PetRepository;
import fifadra.pet.clinic.jfpetclinic.repositories.PetTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
class OwnerJpaServiceTest {

    @Mock
    OwnerRepository ownerRepository;

    @Mock
    PetRepository petRepository;

    @Mock
    PetTypeRepository petTypeRepository;

    @InjectMocks
    OwnerJpaService service;

    @BeforeEach
    void setUp() {
    }



    @Test
    void findByLastName() {
        Owner owner = new Owner();
        owner.setLastName("Fifadra");

        Mockito.when(service.findByLastName(any())).thenReturn(owner);

        Owner owner2 = service.findByLastName("Fifadra");
        assertNotNull(owner2);
    }

    @Test
    void findAll() {
        /*Owner owner = new Owner();
        owner.setLastName("Fifadra");
        service.save(owner);
        Set<Owner> owners =  service.findAll();

        assertEquals(2,owners.size());
   */ }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }
    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }


}