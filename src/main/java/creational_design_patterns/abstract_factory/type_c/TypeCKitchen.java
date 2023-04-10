package creational_design_patterns.abstract_factory.type_c;

import creational_design_patterns.abstract_factory.interfaces.Kitchen;

/**
 * @author bl4kee
 * @since 06.04.2023
 */
public class TypeCKitchen implements Kitchen {

  @Override
  public String getKitchen() {
    return "[Type C] Kitchen:\tFull";
  }
}
