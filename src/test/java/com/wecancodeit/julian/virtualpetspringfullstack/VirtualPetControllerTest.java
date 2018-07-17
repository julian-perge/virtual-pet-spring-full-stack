package com.wecancodeit.julian.virtualpetspringfullstack;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(VirtualPetController.class)
public class VirtualPetControllerTest {

  @Autowired private MockMvc mvc;
  @MockBean private OrganicDog orgDogRepo;

  @Mock private Optional<VirtualPet> testDog;
  
//  @Before
//  public void setUp() {
//	  given(vPetRepo.findById(1L));	  
//  }

  @Test
  public void requestToVirtualPetsShouldBe2xxSuccessfulAndReturnMVC() throws Exception {
	  mvc.perform(get("/virtualPets"))
	  .andExpect(status().is2xxSuccessful())
	  .andExpect(view().name(is("virtualPets")))
	  .andExpect(model().attribute("virtualPets", is(orgDogRepo.findAll())));
  }
  
  @Test
  public void requestToSpecficPetShouldBe2xxSuccessfulAndReturnMVC() throws Exception {
	  
	  given(orgDogRepo.findById(1L));
	  
	  mvc.perform(get("/virtualPets/{id}"))
	  .andExpect(status().is2xxSuccessful())
	  .andExpect(view().name(is("virtualPet")))
	  .andExpect(model().attribute("virtualPet", is(orgDogRepo.findById(1L))));
  }
}
