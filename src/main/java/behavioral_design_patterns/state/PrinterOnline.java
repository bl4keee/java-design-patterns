package behavioral_design_patterns.state;

/**
 * @author bl4kee
 * @since 05.04.2023
 */
public class PrinterOnline extends PrinterController {

  @Override
  public void pushPrint(Printer printJob) {
    System.out.println("\nClearing buffer and shutting down...");
    printJob.setPrinterState(new PrinterOffline());
  }
}
