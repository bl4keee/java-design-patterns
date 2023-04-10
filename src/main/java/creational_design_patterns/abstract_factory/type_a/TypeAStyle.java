package creational_design_patterns.abstract_factory.type_a;

import creational_design_patterns.abstract_factory.interfaces.Style;

/**
 * @author bl4kee
 * @since 06.04.2023
 */
public class TypeAStyle implements Style {

  @Override
  public String getStyle() {
    return "[Type A] Style:\t\tOff the Grid";
  }
}
