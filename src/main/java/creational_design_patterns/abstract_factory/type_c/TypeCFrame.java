package creational_design_patterns.abstract_factory.type_c;

import creational_design_patterns.abstract_factory.interfaces.Frame;

/**
 * @author bl4kee
 * @since 06.04.2023
 */
public class TypeCFrame implements Frame {

  @Override
  public String getFrame() {
    return "[Type C] Frame:\t\tTruck";
  }
}
