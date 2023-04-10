package creational_design_patterns.abstract_factory.type_a;

import creational_design_patterns.abstract_factory.MotorHomeAbstractFactory;
import creational_design_patterns.abstract_factory.interfaces.*;

/**
 * @author bl4kee
 * @since 06.04.2023
 */
public class TypeAFactory extends MotorHomeAbstractFactory {

  @Override
  public Type createType() {
    return new TypeAType();
  }

  @Override
  public Frame createFrame() {
    return new TypeAFrame();
  }

  @Override
  public Style createStyle() {
    return new TypeAStyle();
  }

  @Override
  public Engine createEngine() {
    return new TypeAEngine();
  }

  @Override
  public Kitchen createKitchen() {
    return new TypeAKitchen();
  }
}
