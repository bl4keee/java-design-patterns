package creational_design_patterns.abstract_factory.type_b;

import creational_design_patterns.abstract_factory.interfaces.Type;

/**
 * @author bl4kee
 * @since 06.04.2023
 */
public class TypeBType implements Type {

  @Override
  public String getType() {
    return "[Type B] Type:\t\tB";
  }
}
