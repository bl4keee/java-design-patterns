package creational_design_patterns.prototype;

/**
 * @author bl4kee
 * @since 10.04.2023
 */
public class Dungeon extends BaseLevel {

  public Dungeon(String name) {
    levelName = name;
  }

  @Override
  public BaseLevel clone() {
    return (Dungeon) super.clone();
  }
}
