package behavioral_design_patterns.null_object;

/**
 * @author bl4kee
 * @since 05.04.2023
 */
public class WesternTrain implements TrainStatus {

  private boolean activated;

  @Override
  public void activate() {
    activated = true;
    System.out.println("Train Status Update: Western Train Activated.");
  }

  @Override
  public void deactivate() {
    activated = false;
    System.out.println("Train Status Update: Western Train Deactivated.");
  }

  @Override
  public boolean isActivated() {
    return activated;
  }
}
