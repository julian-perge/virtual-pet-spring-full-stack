package com.wecancodeit.julian.virtualpetspringfullstack;

public abstract class VirtualPet {

    protected String name;
    protected String description;

    public VirtualPet(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "VirtualPet{" +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
