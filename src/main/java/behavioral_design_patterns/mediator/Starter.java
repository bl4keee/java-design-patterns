package behavioral_design_patterns.mediator;

/**
 * @author bl4kee
 * @since 03.04.2023
 */
public class Starter {

  private WidgetProductionSystem mediator;
  private boolean poweredOn;

  public Starter(WidgetProductionSystem mediator) {
    this.mediator = mediator;
    poweredOn = false;
    mediator.mediateStarter(this);
  }

  public boolean isSystemOn() {
    return poweredOn;
  }

  public void turnOn() {
    poweredOn = true;
    mediator.starterPoweredOn();
    System.out.println("Mediated Event: Started Powered On");
  }

  public void turnOff() {
    poweredOn = false;
    mediator.starterPoweredOff();
    System.out.println("Mediated Event: Starter Powered Off");
  }
}
