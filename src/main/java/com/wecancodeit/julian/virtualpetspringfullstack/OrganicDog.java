package com.wecancodeit.julian.virtualpetspringfullstack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrganicDog extends OrganicPet {

  @Id @GeneratedValue private Long id;

  protected OrganicDog(String name, String description) {
    super(name, description);
  }

  /**
   * @param name
   * @param description
   * @param happiness
   * @param hunger
   * @param energy
   */
  public OrganicDog(String name, String description, int happiness, int hunger, int energy) {
    super(name, description, happiness, hunger, energy);
  }
}
