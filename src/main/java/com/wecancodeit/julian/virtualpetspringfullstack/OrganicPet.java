package com.wecancodeit.julian.virtualpetspringfullstack;

import javax.persistence.Entity;

@Entity
public abstract class OrganicPet extends VirtualPet {

    private int happiness;

    protected OrganicPet() {
    }

    public OrganicPet(String name, String description) {
        super(name, description);
    }

    public OrganicPet(String name, String description, int happiness) {
        super(name, description);
        this.happiness = happiness;
    }

    @Override
    public String toString() {
        return "OrganicPet{} " + super.toString();
    }
}
