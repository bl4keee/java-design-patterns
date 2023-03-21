package structural_design_patterns.adapter;

/**
 * @author bl4kee
 * @since 21.03.2023
 */
public class AcreageDeterminatorAdapter {

  Estate estate;
  AcreageDeterminator determinator;

  public double determineAcreage(Estate providedEstate) {
    determinator = new AcreageDeterminator();
    estate = providedEstate;
    Lot lot = new Lot();

    lot.length = estate.length;
    lot.width = estate.width;

    return (determinator.determineAcreage(lot) / 43560);
  }
}
