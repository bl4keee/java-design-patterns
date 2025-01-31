package behavioral_design_patterns.mediator;

/**
 * @author bl4kee
 * @since 03.04.2023
 */
public class EmergencyBreak {

  private WidgetProductionSystem mediator;
  private boolean enabled;
  private boolean applied;

  public EmergencyBreak(WidgetProductionSystem mediator) {
    this.mediator = mediator;
    enabled = false;
    applied = false;
    mediator.mediateEmergencyBreak(this);
  }

  public void enable() {
    enabled = true;
    mediator.setEmergencyBreakEnabled();
    System.out.println("Mediated Event: System Decelerator Enabled.");
  }

  public void disable() {
    enabled = false;
    mediator.setEmergencyBreakDisabled();
    System.out.println("Mediated Event: System Decelerator Disabled.");
  }

  public boolean isEnabled() {
    return enabled;
  }

  public void apply() {
    if (isEnabled()) {
      applied = true;
      mediator.setEmergencyBreakEngaged();
      System.out.println("Mediated Event: Emergency Break Engaged.");
    }
  }

  public void release() {
    if (isEnabled()) {
      applied = false;
      mediator.setEmergencyBreakDisengaged();
      System.out.println("Mediated Event: Emergency Break Disengaged.");
    }
  }
}
