package behavioral_design_patterns.state;

/**
 * @author bl4kee
 * @since 05.04.2023
 */
public class PrinterOffline extends PrinterController {

  @Override
  public void pushPrint(Printer printJob) {
    System.out.println("\nPowering printer on, please wait...");
    printJob.setPrinterState(new PrinterOnline());
  }
}
