package structural_design_patterns.decorator;

/**
 * @author bl4kee
 * @since 22.03.2023
 */
public class ConcretePrinter extends Printer {

  @Override
  public void flushBuffer() {
    System.out.println("Message from Concrete Printer: Printer Buffer Flushed");
  }
}
