package structural_design_patterns.facade.meal_components;

/**
 * @author bl4kee
 * @since 22.03.2023
 */
public class MealStarch {

  private String starch;

  public void setStarch(String starch) {
    this.starch = starch;
    System.out.println("\t\tStarch (" + this.starch + ") added to meal.");
  }
}
