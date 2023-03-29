package behavioral_design_patterns.chain_of_responsibility;

/**
 * @author bl4kee
 * @since 29.03.2023
 */
public class HREmailHandler extends MainEmailHandler {

  protected String[] keyWords() {
    return new String[] {"career", "job", "faculty"};
  }

  protected void processEmailFinal(String emailText) {
    System.out.println("The HR Team processed the email.");
  }
}
