package com.wecancodeit.julian.virtualpetspringfullstack;

public abstract class RoboticPet extends VirtualPet {

  protected int oilLevel;

  protected RoboticPet(String name, String description) {
    super(name, description);
  }

  /**
   * @param name
   * @param description
   * @param oilLevel
   */
  protected RoboticPet(String name, String description, int oilLevel) {
    super(name, description);
    this.oilLevel = oilLevel;
  }

  public int getOilLevel() {
    return oilLevel;
  }
}
