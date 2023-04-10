package creational_design_patterns.abstract_factory.type_a;

import creational_design_patterns.abstract_factory.interfaces.Kitchen;

/**
 * @author bl4kee
 * @since 06.04.2023
 */
public class TypeAKitchen implements Kitchen {

  @Override
  public String getKitchen() {
    return "[Type A] Kitchen:\tFull";
  }
}
