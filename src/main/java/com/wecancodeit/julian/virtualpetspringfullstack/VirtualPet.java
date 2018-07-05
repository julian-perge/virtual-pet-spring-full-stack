package com.wecancodeit.julian.virtualpetspringfullstack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public abstract class VirtualPet {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;

    protected VirtualPet() {
    }

    public VirtualPet(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "VirtualPet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof VirtualPet)) return false;
//        VirtualPet that = (VirtualPet) o;
//        return Objects.equals(getId(), that.getId());
//    }
//
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(getId());
//    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
