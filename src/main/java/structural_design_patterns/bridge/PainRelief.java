package structural_design_patterns.bridge;

/**
 * @author bl4kee
 * @since 21.03.2023
 */
public class PainRelief implements Medicine {

  @Override
  public void administerMedication(int amount) {
    System.out.print(amount + " pain relief pills administered.");
  }
}
