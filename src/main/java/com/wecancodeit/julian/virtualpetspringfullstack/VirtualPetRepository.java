package com.wecancodeit.julian.virtualpetspringfullstack;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface VirtualPetRepository extends CrudRepository<VirtualPet, Long> {

}
