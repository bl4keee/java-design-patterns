package creational_design_patterns.abstract_factory;

import creational_design_patterns.abstract_factory.interfaces.*;
import creational_design_patterns.abstract_factory.type_a.TypeAFactory;
import creational_design_patterns.abstract_factory.type_b.TypeBFactory;
import creational_design_patterns.abstract_factory.type_c.TypeCFactory;

/**
 * @author bl4kee
 * @since 06.04.2023
 */
public class MotorHomeDriver {

  public static void main(String[] args) {
    MotorHomeAbstractFactory motorHomeFactory = null;

    String nextMotorHome = "TypeA"; // user input, let's say...

    if (nextMotorHome.equals("TypeA")) {
      System.out.println("\nType A motor home selected!");
      motorHomeFactory = new TypeAFactory();
    } else if (nextMotorHome.equals("TypeB")) {
      System.out.println("\nType B motor home selected!");
      motorHomeFactory = new TypeBFactory();
    } else if (nextMotorHome.equals("TypeC")) {
      System.out.println("\nType C motor home selected!");
      motorHomeFactory = new TypeCFactory();
    } else {
      System.out.println("Invalid motor home type entered.");
    }

    Type motorHomeType = motorHomeFactory.createType();
    Style motorHomeStyle = motorHomeFactory.createStyle();
    Frame motorHomeFrame = motorHomeFactory.createFrame();
    Engine motorHomeEngine = motorHomeFactory.createEngine();
    Kitchen motorHomeKitchen = motorHomeFactory.createKitchen();

    System.out.println("\nComponent list for " + nextMotorHome + " motor home");
    System.out.println(motorHomeType.getType());
    System.out.println(motorHomeStyle.getStyle());
    System.out.println(motorHomeFrame.getFrame());
    System.out.println(motorHomeEngine.getEngine());
    System.out.println(motorHomeKitchen.getKitchen());
  }
}
