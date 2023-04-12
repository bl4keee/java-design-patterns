package creational_design_patterns.factory;

/**
 * @author bl4kee
 * @since 10.04.2023
 */
public class MowerDriver {

  public static void main(String[] args) {
    System.out.println("\n\nMOWER SELECTION HELPER");

    MowerFactory mowerFactory = new ConcreteMowerFactory();
    Mower ridingMower = mowerFactory.getMowerType("Riding");
    ridingMower.mow();

    Mower pushMower = mowerFactory.getMowerType("Push");
    pushMower.mow();
  }
}
