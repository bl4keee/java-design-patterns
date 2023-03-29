package behavioral_design_patterns.chain_of_responsibility;

/**
 * @author bl4kee
 * @since 29.03.2023
 */
public class AdminEmailHandler extends MainEmailHandler {

  @Override
  protected String[] keyWords() {
    return new String[0];
  }

  protected void processEmailFinal(String emailText) {
    System.out.println("The Admin Team processed the email.");
  }
}
