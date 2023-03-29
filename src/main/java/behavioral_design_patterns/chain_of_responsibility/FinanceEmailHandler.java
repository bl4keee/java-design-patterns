package behavioral_design_patterns.chain_of_responsibility;

/**
 * @author bl4kee
 * @since 29.03.2023
 */
public class FinanceEmailHandler extends MainEmailHandler {

  protected String[] keyWords() {
    return new String[] {"financial", "student aid", "tuition"};
  }

  protected void processEmailFinal(String emailText) {
    System.out.println("The Finance Team processed the email.");
  }

}
