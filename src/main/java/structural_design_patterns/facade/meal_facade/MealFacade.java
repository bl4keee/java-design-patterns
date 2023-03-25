package structural_design_patterns.facade.meal_facade;

import structural_design_patterns.facade.meal_components.MealProtein;
import structural_design_patterns.facade.meal_components.MealStarch;
import structural_design_patterns.facade.meal_components.MealVegetable;

/**
 * @author bl4kee
 * @since 22.03.2023
 */
public class MealFacade {

  MealProtein newProtein;
  MealVegetable newVegetable;
  MealStarch newStarch;

  public MealFacade() {
    newProtein = new MealProtein();
    newVegetable = new MealVegetable();
    newStarch = new MealStarch();
  }

  public void assembleMeal(String protein, String vegetable, String starch) {
    System.out.println("\n\tMeal assembly process initiated. . .");
    newProtein.setProtein(protein);
    newVegetable.setVegetable(vegetable);
    newStarch.setStarch(starch);
    System.out.println("\tMeal assembly process completed. . . \n");
  }
}
