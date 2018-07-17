package com.wecancodeit.julian.virtualpetspringfullstack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class RoboticDog extends RoboticPet {

  @Id @GeneratedValue private Long id;

  /**
   * @param name
   * @param description
   * @param oilLevel
   */
  public RoboticDog(String name, String description, int oilLevel) {
    super(name, description, oilLevel);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param name
   * @param description
   */
  protected RoboticDog(String name, String description) {
    super(name, description);
    // TODO Auto-generated constructor stub
  }
}
