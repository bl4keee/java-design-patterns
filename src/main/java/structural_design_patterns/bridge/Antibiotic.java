package structural_design_patterns.bridge;

/**
 * @author bl4kee
 * @since 21.03.2023
 */
public class Antibiotic implements Medicine {

  @Override
  public void administerMedication(int amount) {
    System.out.print(amount + " antibiotic pills administered.");
  }
}
