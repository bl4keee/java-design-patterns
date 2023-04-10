package creational_design_patterns.abstract_factory;

import creational_design_patterns.abstract_factory.interfaces.*;

/**
 * @author bl4kee
 * @since 06.04.2023
 */
public abstract class MotorHomeAbstractFactory {
  public abstract Type createType();
  public abstract Frame createFrame();
  public abstract Style createStyle();
  public abstract Engine createEngine();
  public abstract Kitchen createKitchen();
}
