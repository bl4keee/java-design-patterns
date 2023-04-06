package behavioral_design_patterns.null_object;

/**
 * @author bl4kee
 * @since 05.04.2023
 */
public class NullObjectTrain implements TrainStatus {

  @Override
  public void activate() {

  }

  @Override
  public void deactivate() {

  }

  @Override
  public boolean isActivated() {
    return false;
  }
}
