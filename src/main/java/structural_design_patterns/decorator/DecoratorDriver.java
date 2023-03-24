package structural_design_patterns.decorator;

/**
 * @author bl4kee
 * @since 22.03.2023
 */
public class DecoratorDriver {

  public static void main(String[] args) {
    System.out.println("\n\n=================================================");
    System.out.println("\t\t\tPrinter Buffer Flusher Demo");
    System.out.println("=================================================");

    ConcretePrinter concretePrinter = new ConcretePrinter();

    ConcreteDecorator1 concreteDecorator1 = new ConcreteDecorator1();
    concreteDecorator1.selectPrinterToFlush(concretePrinter);
    concreteDecorator1.flushBuffer();

    ConcreteDecorator2 concreteDecorator2 = new ConcreteDecorator2();
    concreteDecorator2.selectPrinterToFlush(concreteDecorator1);
    concreteDecorator2.flushBuffer();
  }
}
