package behavioral_design_patterns.mediator;

/**
 * @author bl4kee
 * @since 03.04.2023
 */
public class Hopper {

  private WidgetProductionSystem mediator;
  private boolean enabled;

  public Hopper(WidgetProductionSystem mediator) {
    this.mediator = mediator;
    enabled = false;
    mediator.mediateHopper(this);
  }

  public boolean getHopperEnabled() {
    return enabled;
  }

  public void enable() {
    enabled = true;
    mediator.hopperEnabled();
    System.out.println("Mediated Event: Hopper initialized.");
  }

  public void disable() {
    enabled = false;
    mediator.hopperDisabled();
    System.out.println("Mediated Event: Hopper Deinitialized.");
  }
}
