package structural_design_patterns.decorator;

/**
 * @author bl4kee
 * @since 22.03.2023
 */
abstract class AbstractDecorator extends Printer {

  protected Printer printer;

  public void selectPrinterToFlush(Printer printerToFlush) {
    printer = printerToFlush;
  }

  public void flushBuffer() {
    if (printer != null) {
      printer.flushBuffer();
    }
  }
}
