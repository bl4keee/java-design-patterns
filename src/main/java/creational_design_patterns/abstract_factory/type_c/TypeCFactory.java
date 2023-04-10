package creational_design_patterns.abstract_factory.type_c;

import creational_design_patterns.abstract_factory.MotorHomeAbstractFactory;
import creational_design_patterns.abstract_factory.interfaces.*;

/**
 * @author bl4kee
 * @since 06.04.2023
 */
public class TypeCFactory extends MotorHomeAbstractFactory {

  @Override
  public Type createType() {
    return new TypeCType();
  }

  @Override
  public Frame createFrame() {
    return new TypeCFrame();
  }

  @Override
  public Style createStyle() {
    return new TypeCStyle();
  }

  @Override
  public Engine createEngine() {
    return new TypeCEngine();
  }

  @Override
  public Kitchen createKitchen() {
    return new TypeCKitchen();
  }
}
