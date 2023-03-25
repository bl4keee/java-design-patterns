package structural_design_patterns.facade.meal_components;

/**
 * @author bl4kee
 * @since 22.03.2023
 */
public class MealProtein {

  private String protein;

  public void setProtein(String protein) {
    this.protein = protein;
    System.out.println("\t\tProtein (" + this.protein + ") added to meal.");
  }
}
