package creational_design_patterns.factory;

/**
 * @author bl4kee
 * @since 10.04.2023
 */
abstract class MowerFactory {

  public abstract Mower getMowerType(String mowerType);
}
