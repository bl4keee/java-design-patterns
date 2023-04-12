package creational_design_patterns.factory;

/**
 * @author bl4kee
 * @since 10.04.2023
 */
public class Push implements Mower {

  @Override
  public void mow() {
    System.out.println("Push mowers are good for small yards.");
  }
}
