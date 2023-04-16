package functional_design_patterns.lambda_single_parameter;

/**
 * @author bl4kee
 * @since 15.04.2023
 */
public class Driver {

  public static void main(String[] args) {
    System.out.println();

    FunctionalGift myObject = (int number) -> System.out.println(number + " squared is " + (number * number));

    myObject.abstractMethod(1);
    myObject.abstractMethod(2);
    myObject.abstractMethod(3);
    myObject.abstractMethod(4);
    myObject.abstractMethod(5);
  }
}
