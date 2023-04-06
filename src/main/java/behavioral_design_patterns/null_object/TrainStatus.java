package behavioral_design_patterns.null_object;

/**
 * @author bl4kee
 * @since 05.04.2023
 */
public interface TrainStatus {

  public void activate();
  public void deactivate();
  public boolean isActivated();
}
