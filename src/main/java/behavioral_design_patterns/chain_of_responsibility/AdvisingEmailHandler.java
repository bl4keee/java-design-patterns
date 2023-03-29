package behavioral_design_patterns.chain_of_responsibility;

/**
 * @author bl4kee
 * @since 29.03.2023
 */
public class AdvisingEmailHandler extends MainEmailHandler {

  protected String[] keyWords() {
    return new String[] {"advising", "schedule", "course"};
  }

  protected void processEmailFinal(String emailText) {
    System.out.println("The Advising Team processed the email.");
  }
}
