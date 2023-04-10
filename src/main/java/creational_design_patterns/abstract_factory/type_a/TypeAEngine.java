package creational_design_patterns.abstract_factory.type_a;

import creational_design_patterns.abstract_factory.interfaces.Engine;

/**
 * @author bl4kee
 * @since 06.04.2023
 */
public class TypeAEngine implements Engine {

  @Override
  public String getEngine() {
    return "[Type A] Engine:\tFord V10";
  }
}
