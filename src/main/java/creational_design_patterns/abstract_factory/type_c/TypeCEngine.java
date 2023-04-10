package creational_design_patterns.abstract_factory.type_c;

import creational_design_patterns.abstract_factory.interfaces.Engine;

/**
 * @author bl4kee
 * @since 06.04.2023
 */
public class TypeCEngine implements Engine {

  @Override
  public String getEngine() {
    return "[Type C] Engine:\tFord E-450";
  }
}
