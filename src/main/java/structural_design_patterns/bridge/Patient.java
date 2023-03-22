package structural_design_patterns.bridge;

/**
 * @author bl4kee
 * @since 21.03.2023
 */
abstract class Patient {

  protected Medicine medicine;

  protected Patient(Medicine medicine) {
    this.medicine = medicine;
  }

  abstract void selectPatient(int dose);

  abstract void modifyMedication(int dose, int increment);
}
