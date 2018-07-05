package com.wecancodeit.julian.virtualpetspringfullstack;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.EntityManager;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class OrganicDogTest {

    @Autowired
    VirtualPetRepository vRepo;
    private EntityManager em;

    @Test
    public void shouldGenerateIdValueFromPet() {
        VirtualPet pet1 = vRepo.save(new OrganicDog());
        assertThat(pet1.getId(), is(equalTo(1L)));
    }

    @Test
    public void shouldSaveOrganicDogToRepo() {
        VirtualPet pet1 = vRepo.save(new OrganicDog());

        assertTrue(vRepo.existsById(pet1.getId()));
    }
}
