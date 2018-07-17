package com.wecancodeit.julian.virtualpetspringfullstack;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
  @Autowired private VirtualPetRepository vPetRepo;
  
  @RequestMapping(value = "/virtual-pets")
  public Collection<VirtualPet> getVirtualPets() {
	  return (Collection<VirtualPet>) vPetRepo.findAll();
  }
}
