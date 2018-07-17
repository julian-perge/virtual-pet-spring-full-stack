package com.wecancodeit.julian.virtualpetspringfullstack;

import java.lang.reflect.Array;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VirtualPetController {
	
	@Autowired private OrganicDogRepository orgDogRepo;
	@Autowired private RoboticDogRepository botDogRepo;
	
	@RequestMapping("/virtualPets")
	public String getVirtualPets(Model model) {
		Array allPets[];
		model.addAllAttributes(Collections.addAll(allPets, orgDogRepo.findAll(), botDogRepo.findAll()));
		model.addAttribute("virtualPets", orgDogRepo.findAll());
		return "virtualPets";
	}
	
	@RequestMapping("/virtualPets/{id}")
	public String getVirtualPet(@PathVariable(name="id") Long id, Model model) {
		model.addAttribute("virtualPet", orgDogRepo.findById(id));
		return "virtualPet";
	}
}
