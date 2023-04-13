package creational_design_patterns.prototype;

/**
 * @author bl4kee
 * @since 10.04.2023
 */
public class Forest extends BaseLevel {

  public Forest(String name) {
    levelName = name;
  }

  @Override
  public BaseLevel clone() {
    return (Forest) super.clone();
  }
}
