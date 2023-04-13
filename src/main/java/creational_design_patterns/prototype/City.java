package creational_design_patterns.prototype;

/**
 * @author bl4kee
 * @since 10.04.2023
 */
public class City extends BaseLevel {

  public City(String name) {
    levelName = name;
  }

  @Override
  public BaseLevel clone() {
    return (City) super.clone();
  }
}
