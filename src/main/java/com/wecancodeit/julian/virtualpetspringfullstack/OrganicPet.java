package com.wecancodeit.julian.virtualpetspringfullstack;

public abstract class OrganicPet extends VirtualPet {

  protected int happiness;
  protected int hunger;
  protected int energy;

  protected OrganicPet(String name, String description) {
    super(name, description);
  }

  /**
   * @param name
   * @param description
   * @param happiness
   * @param hunger
   * @param energy
   */
  public OrganicPet(String name, String description, int happiness, int hunger, int energy) {
    super(name, description);
    this.happiness = happiness;
    this.hunger = hunger;
    this.energy = energy;
  }

  public int getHappiness() {
    return happiness;
  }

  public int getHunger() {
    return hunger;
  }

  public int getEnergy() {
    return energy;
  }

  @Override
  public String toString() {
    return String.format("%s - Happiness: %s | Hunger: %s | Energy: %s", super.toString(), happiness, hunger, energy);
  }
}
