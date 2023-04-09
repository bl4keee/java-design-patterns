package behavioral_design_patterns.state;

/**
 * @author bl4kee
 * @since 05.04.2023
 */
public class PrinterDriver {

  public static void main(String[] args) {
    PrinterOffline initialPrinterState = new PrinterOffline();
    Printer printer = new Printer(initialPrinterState);

    System.out.println("\n");

    printer.pushPrint();
    printer.pushPrint();
    printer.pushPrint();

    System.out.println("\n\n");
  }
}
