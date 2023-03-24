package structural_design_patterns.decorator;

/**
 * @author bl4kee
 * @since 22.03.2023
 */
public class ConcreteDecorator1 extends AbstractDecorator {

  public void flushBuffer() {
    super.flushBuffer();
    System.out.println("Message from Concrete Decorator 1: Printer Buffer Flushed");
  }
}
