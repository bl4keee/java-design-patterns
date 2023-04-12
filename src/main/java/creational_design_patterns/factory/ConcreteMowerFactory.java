package creational_design_patterns.factory;

/**
 * @author bl4kee
 * @since 10.04.2023
 */
public class ConcreteMowerFactory extends MowerFactory {

  @Override
  public Mower getMowerType(String mowerType) {
    if (mowerType.equals("Riding")) {
      return new Riding();
    } else if (mowerType.equals("Push")) {
      return new Push();
    } else {
      System.out.println("Invalid mower type selected.");
      return null;
    }
  }
}
