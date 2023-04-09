package behavioral_design_patterns.state;

/**
 * @author bl4kee
 * @since 05.04.2023
 */
public class Printer {

  private PrinterController printerState;

  public Printer(PrinterController printerState) {
    this.printerState = printerState;
  }

  public PrinterController getPrinterState() {
    return printerState;
  }

  public void setPrinterState(PrinterController printerState) {
    this.printerState = printerState;
  }

  public void pushPrint() {
    printerState.pushPrint(this);
  }

}
