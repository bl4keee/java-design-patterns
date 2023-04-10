package creational_design_patterns.abstract_factory.type_b;

import creational_design_patterns.abstract_factory.interfaces.Style;

/**
 * @author bl4kee
 * @since 06.04.2023
 */
public class TypeBStyle implements Style {

  @Override
  public String getStyle() {
    return "[Type B] Style:\t\tWeekender";
  }
}
