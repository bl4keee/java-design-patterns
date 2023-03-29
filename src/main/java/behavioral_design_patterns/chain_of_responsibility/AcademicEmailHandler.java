package behavioral_design_patterns.chain_of_responsibility;

/**
 * @author bl4kee
 * @since 29.03.2023
 */
public class AcademicEmailHandler extends MainEmailHandler {

  protected String[] keyWords() {
      return new String[] {"academic"};
  }

  protected void processEmailFinal(String emailText) {
    System.out.println("The Academic Team processed the email.");
  }
}
