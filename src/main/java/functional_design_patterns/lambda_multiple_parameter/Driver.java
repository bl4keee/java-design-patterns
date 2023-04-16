package functional_design_patterns.lambda_multiple_parameter;

import java.util.Random;
import java.util.Scanner;

/**
 * @author bl4kee
 * @since 15.04.2023
 */
public class Driver {

  interface FirstFunctionalInterface {
    int calculation(int a, int b);
  }

  interface SecondFunctionalInterface {
    void displayResults(String message);
  }

  private int calculate(int a, int b, FirstFunctionalInterface firstObject) {
    return firstObject.calculation(a, b);
  }

  public static void main(String[] args) {
    System.out.println();
    Scanner in = new Scanner(System.in);
    System.out.println("How many blue tokens do you have to exchange: ");
    int blueTokens = in.nextInt();
    System.out.println("How many red tokens do you have to exchange: ");
    int redTokens = in.nextInt();

    System.out.println("\n=======================");
    System.out.println("TOKEN-TO-GIFT EXCHANGE");
    System.out.println("========================");

    FirstFunctionalInterface sum = Integer::sum;

    FirstFunctionalInterface superSquare = (int num1, int num2) -> ((num1 * num2) + (num2 * num2));

    Driver firstObject = new Driver();

    System.out.println(blueTokens + " blue tokens submitted");
    System.out.println(redTokens + " red tokens submitted");
    System.out.println(firstObject.calculate(blueTokens, redTokens, sum) + " total tokens submitted");
    System.out.println(firstObject.calculate(blueTokens, redTokens, superSquare) + " superSquare number result");

    System.out.println("===");
    SecondFunctionalInterface secondObject = message -> System.out.println("Your gift is a pound of " + message);

    secondObject.displayResults(selectGift());
  }

  public static String selectGift() {
    String[] giftArray = new String[] {"Gold", "Silver", "Platinum", "Titanium", "Copper"};
    Random giftNumber = new Random();
    int giftToGive = giftNumber.nextInt(4);
    return giftArray[giftToGive];
  }
}
