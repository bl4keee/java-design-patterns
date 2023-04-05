package behavioral_design_patterns.memento;

/**
 * @author bl4kee
 * @since 03.04.2023
 */
public class GameMissionMemento {

  private GameMission gameMission;
  private int copyOfCurrentCompletionProgress;
  private int copyOfPreviousCompletionProgress;

  public GameMissionMemento(GameMission gameMission) {
    this.gameMission = gameMission;
    copyOfCurrentCompletionProgress = gameMission.getPercentageCompleted();
    copyOfPreviousCompletionProgress = gameMission.previousPercentageCompleted;
  }

  public void resetMissionStatus() {
    gameMission.setPercentageCompleted(copyOfCurrentCompletionProgress);
    gameMission.previousPercentageCompleted = copyOfPreviousCompletionProgress;
  }
}
