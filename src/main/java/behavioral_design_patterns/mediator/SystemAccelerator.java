package behavioral_design_patterns.mediator;

/**
 * @author bl4kee
 * @since 03.04.2023
 */
public class SystemAccelerator {

  private WidgetProductionSystem mediator;
  private boolean enabled;
  private int speed;

  public SystemAccelerator(WidgetProductionSystem mediator) {
    this.mediator = mediator;
    enabled = false;
    speed = 0;
    mediator.mediateSystemAcceleration(this);
  }

  public int getAcceleratorSpeed() {
    return speed;
  }

  public boolean isEnabled() {
    return enabled;
  }

  public void enable() {
    enabled = true;
    mediator.systemAcceleratorEnabled();
    System.out.println("Mediated Event: System Accelerator Enabled.");
  }

  public void disable() {
    enabled = false;
    mediator.systemAcceleratorDisabled();
    System.out.println("Mediated Event: System Accelerator Disabled.");
  }

  public void accelerateToSpeed(int speed) {
    if (isEnabled()) {
      this.speed = speed;
      mediator.systemAcceleratorUsed();
      System.out.println("Mediated Event: System Accelerator Set to " + speed + ".");
    }
  }
}
