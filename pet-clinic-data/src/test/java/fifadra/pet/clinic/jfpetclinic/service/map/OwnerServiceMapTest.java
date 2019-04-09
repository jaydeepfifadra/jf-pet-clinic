package fifadra.pet.clinic.jfpetclinic.service.map;

import fifadra.pet.clinic.jfpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerServiceMapTest {

    OwnerServiceMap ownerServiceMap;
    Long ownerId = 1L;
    String lastName = "Fifadra";
    @BeforeEach
    void setUp() {
        ownerServiceMap = new OwnerServiceMap(new PetTypeServiceMap(),new PetServiceMap());
        Owner owner = new Owner();
        owner.setId(ownerId);
        owner.setLastName(lastName);
        ownerServiceMap.save(owner);
       }

    @Test
    void findAll() {
        Set<Owner>  owners = ownerServiceMap.findAll();
            assertEquals(1,owners.size());
    }

    @Test
    void findById() {
        Owner owner = ownerServiceMap.findById(ownerId);
        assertEquals(ownerId,owner.getId());
    }

    @Test
    void saveExistingId() {
        Owner owner2 = new Owner();
        owner2.setId(2L);
        Owner savedOwner = ownerServiceMap.save(owner2);
        assertEquals((Long)2L,savedOwner.getId());

    }

    @Test
    void saveNoId() {
        Owner owner2 = new Owner();
        Owner savedOwner = ownerServiceMap.save(owner2);
        assertNotNull(savedOwner);
        assertNotNull(savedOwner.getId());
    }

    @Test
    void delete() {
        ownerServiceMap.delete(ownerServiceMap.findById(ownerId));
        Set<Owner>  owners = ownerServiceMap.findAll();
        assertEquals(0,owners.size());
    }

    @Test
    void deleteById() {
        ownerServiceMap.deleteById(ownerId);
        Set<Owner>  owners = ownerServiceMap.findAll();
        assertEquals(0,owners.size());
    }

    @Test
    void findByLastName() {

    assertNotNull(ownerServiceMap.findByLastName(lastName));

    }

    @Test
    void findByLastNameNotFound() {
        assertNull(ownerServiceMap.findByLastName("Shah"));
    }

}