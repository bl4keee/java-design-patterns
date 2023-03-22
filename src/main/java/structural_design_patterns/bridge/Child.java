package structural_design_patterns.bridge;

/**
 * @author bl4kee
 * @since 21.03.2023
 */
public class Child extends Patient {

  protected Child(Medicine medicine) {
    super(medicine);
  }

  @Override
  void selectPatient(int dose) {
    System.out.print("\tDoctor\'s Order: ");
    medicine.administerMedication(dose);
  }

  @Override
  void modifyMedication(int dose, int increment) {
    String message = "";

    if (increment < 0) {
      dose = dose - Math.abs(increment);
      message = "minus ";
    } else {
      dose = dose + increment;
      message = "plus ";
    }

    System.out.println("\n\tDoctor-ordered dosage change: " + message + Math.abs(increment) + " pills.");
    selectPatient(dose);
  }
}
