package structural_design_patterns.adapter;

import java.text.DecimalFormat;

/**
 * @author ${USER}
 * @since ${DATE}
 */
public class AdapterDriver {

  private static DecimalFormat acreageFormat = new DecimalFormat(".##");

  public static void main(String[] args) {

    System.out.println("\n\nReal Estate Land Area Calculation");
    AcreageDeterminatorAdapter adapter = new AcreageDeterminatorAdapter();
    Estate estate = new Estate(2300, 6325);
    System.out.print("Estate Acreage: ");
    System.out.print(acreageFormat.format(adapter.determineAcreage(estate)));
  }
}