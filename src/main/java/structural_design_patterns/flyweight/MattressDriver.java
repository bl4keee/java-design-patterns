package structural_design_patterns.flyweight;

/**
 * @author bl4kee
 * @since 27.03.2023
 */
public class MattressDriver {

  public static void main(String[] args) throws Exception {

    Mattress newMattress;
    MattressFactory factory = new MattressFactory();

    System.out.println("\n\n============================================================");
    System.out.println("\t\t\tMattress Manufacturing Factory Demo");
    System.out.println("============================================================");

    for (int i = 0; i < 5; i++) {
      newMattress = (Mattress) factory.getFactoryMattress("Crib");
      newMattress.setMattressFirmness("Firm");
      newMattress.print();
    }

    for (int i = 0; i < 5; i++) {
      newMattress = (Mattress) factory.getFactoryMattress("Crib");
      newMattress.setMattressFirmness("Firm");
      newMattress.print();
    }

    for (int i = 0; i < 5; i++) {
      newMattress = (Mattress) factory.getFactoryMattress("Twin");
      newMattress.setMattressFirmness("Soft");
      newMattress.print();
    }

    for (int i = 0; i < 5; i++) {
      newMattress = (Mattress) factory.getFactoryMattress("Full");
      newMattress.setMattressFirmness("Extra Firm");
      newMattress.print();
    }
  }
}
