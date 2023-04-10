package creational_design_patterns.abstract_factory.type_c;

import creational_design_patterns.abstract_factory.interfaces.Style;

/**
 * @author bl4kee
 * @since 06.04.2023
 */
public class TypeCStyle implements Style {

  @Override
  public String getStyle() {
    return "[Type C] Style:\t\tExtended Trip";
  }
}
