package structural_design_patterns.facade.driver;

import structural_design_patterns.facade.meal_facade.MealFacade;

/**
 * @author bl4kee
 * @since 22.03.2023
 */
public class FacadeDriver {

  public static void main(String[] args) {
    System.out.println("\n\n=================================================");
    System.out.println("\t\t\tMeal Assembly Service Demo");
    System.out.println("=================================================");

    MealFacade firstMeal = new MealFacade();
    firstMeal.assembleMeal("Steak", "Asparagus", "Wild Rice");

    MealFacade secondMeal = new MealFacade();
    secondMeal.assembleMeal("Chicken", "Green Beans", "Potato Wedges");

    MealFacade thirdMeal = new MealFacade();
    thirdMeal.assembleMeal("Meatloaf", "Brussel Sprouts", "Mashed Potatoes");
  }
}
