package behavioral_design_patterns.observer;

/**
 * @author bl4kee
 * @since 05.04.2023
 */
public class StudentDashboard extends Observable {

  private int unreadMessages;

  public StudentDashboard() {
    unreadMessages = 0;
  }

  public void setUnreadMessages(int messages) {
    unreadMessages = messages;
  }

  public int getUnreadMessages() {
    return unreadMessages;
  }
}
