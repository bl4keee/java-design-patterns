package creational_design_patterns.factory;

/**
 * @author bl4kee
 * @since 10.04.2023
 */
public class Riding implements Mower {

  @Override
  public void mow() {
    System.out.println("Riding mowers provide safety and comfort.");
  }
}
