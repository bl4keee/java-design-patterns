package creational_design_patterns.abstract_factory.type_a;

import creational_design_patterns.abstract_factory.interfaces.Frame;

/**
 * @author bl4kee
 * @since 06.04.2023
 */
public class TypeAFrame implements Frame {

  @Override
  public String getFrame() {
    return "[Type A] Frame:\t\tBus";
  }
}
