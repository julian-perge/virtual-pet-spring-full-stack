package com.wecancodeit.julian.virtualpetspringfullstack;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface OrganicDogRepository extends CrudRepository<OrganicDog, Long> {

}
