package behavioral_design_patterns.mediator;

/**
 * @author bl4kee
 * @since 03.04.2023
 */
public class AssemblySystem {

  public enum SystemSpeed {
    ZERO, ONE, TWO, THREE, FOUR, FIVE,
    SIX, SEVEN, EIGHT, NINE, TEN
  }

  private WidgetProductionSystem mediator;
  private boolean enabled;
  private SystemSpeed currentSpeed;

  public AssemblySystem(WidgetProductionSystem mediator) {
    this.mediator = mediator;
    enabled = false;
    currentSpeed = SystemSpeed.ZERO;
    mediator.mediateAssemblySystem(this);
  }

  public SystemSpeed getSystemSpeed() {
    return currentSpeed;
  }

  public void setSystemSpeed(SystemSpeed speed) {
    if ((isEnabled()) && (getSystemSpeed() != speed)) {
      currentSpeed = speed;
      mediator.assemblySystemSpeedChanged();
      System.out.println("Mediated Event: System Speed Changed to " + currentSpeed + ".");
    }
  }

  public void enable() {
    enabled = true;
    mediator.assemblySystemEnabled();
    System.out.println("Mediated Event: System initialized.");
  }

  public void disable() {
    enabled = false;
    mediator.assemblySystemDisabled();
    System.out.println("Mediated Event: System Deinitialized.");
  }

  public boolean isEnabled() {
    return enabled;
  }
}
