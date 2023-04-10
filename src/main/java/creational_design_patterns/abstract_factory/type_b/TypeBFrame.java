package creational_design_patterns.abstract_factory.type_b;

import creational_design_patterns.abstract_factory.interfaces.Frame;

/**
 * @author bl4kee
 * @since 06.04.2023
 */
public class TypeBFrame implements Frame {

  @Override
  public String getFrame() {
    return "[Type B] Frame:\t\tCamper Van";
  }
}
