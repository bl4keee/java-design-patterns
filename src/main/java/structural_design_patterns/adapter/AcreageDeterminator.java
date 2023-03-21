package structural_design_patterns.adapter;

/**
 * @author bl4kee
 * @since 21.03.2023
 */
public class AcreageDeterminator {

  Lot lot;

  public double determineAcreage(Lot providedLot) {
    lot = providedLot;
    return lot.length * lot.width;
  }
}
