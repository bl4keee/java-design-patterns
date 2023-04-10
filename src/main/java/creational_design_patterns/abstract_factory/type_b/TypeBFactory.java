package creational_design_patterns.abstract_factory.type_b;

import creational_design_patterns.abstract_factory.MotorHomeAbstractFactory;
import creational_design_patterns.abstract_factory.interfaces.*;

/**
 * @author bl4kee
 * @since 06.04.2023
 */
public class TypeBFactory extends MotorHomeAbstractFactory {

  @Override
  public Type createType() {
    return new TypeBType();
  }

  @Override
  public Frame createFrame() {
    return new TypeBFrame();
  }

  @Override
  public Style createStyle() {
    return new TypeBStyle();
  }

  @Override
  public Engine createEngine() {
    return new TypeBEngine();
  }

  @Override
  public Kitchen createKitchen() {
    return new TypeBKitchen();
  }
}
