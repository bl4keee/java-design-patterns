package behavioral_design_patterns.chain_of_responsibility;

/**
 * @author bl4kee
 * @since 29.03.2023
 */
public class AlumniEmailHandler extends MainEmailHandler {

  protected String[] keyWords() {
    return new String[] {"alumni", "transcript"};
  }

  protected void processEmailFinal(String emailText) {
    System.out.println("The Alumni Team processed the email.");
  }

}
