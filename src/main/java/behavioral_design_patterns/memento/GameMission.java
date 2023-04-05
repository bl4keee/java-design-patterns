package behavioral_design_patterns.memento;

/**
 * @author bl4kee
 * @since 03.04.2023
 */
public class GameMission {

  private int percentageCompleted;
  int previousPercentageCompleted;

  public GameMission() {
    percentageCompleted = 0;
    previousPercentageCompleted = 0;
  }

  public void setPercentageCompleted(int percentage) {
    previousPercentageCompleted = percentageCompleted;
    percentageCompleted = percentage;
  }

  public int getPercentageCompleted() {
    return percentageCompleted;
  }
}
