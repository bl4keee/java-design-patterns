package creational_design_patterns.abstract_factory.type_b;

import creational_design_patterns.abstract_factory.interfaces.Engine;

/**
 * @author bl4kee
 * @since 06.04.2023
 */
public class TypeBEngine implements Engine {

  @Override
  public String getEngine() {
    return "[Type B] Engine:\tFord Transit 350 HD";
  }
}
