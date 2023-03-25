package structural_design_patterns.facade.meal_components;

/**
 * @author bl4kee
 * @since 22.03.2023
 */
public class MealVegetable {

  private String vegetable;

  public void setVegetable(String vegetable) {
    this.vegetable = vegetable;
    System.out.println("\t\tVegetable (" + this.vegetable + ") added to meal.");
  }
}
