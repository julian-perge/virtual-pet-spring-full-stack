package com.wecancodeit.julian.virtualpetspringfullstack;

import javax.persistence.Entity;

@Entity
public class OrganicDog extends OrganicPet {

    protected OrganicDog() {
    }

    public OrganicDog(String name, String description) {
        super(name, description);
    }
}
