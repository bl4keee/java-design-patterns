package behavioral_design_patterns.chain_of_responsibility;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author bl4kee
 * @since 29.03.2023
 */
public abstract class MainEmailHandler implements UniversityEmailHandler {

  protected abstract String[] keyWords();
  protected abstract void processEmailFinal(String emailText);

  private UniversityEmailHandler theNextHandlerInTheChain;

  public void setNextEmailHandler(UniversityEmailHandler emailHandler) {
    theNextHandlerInTheChain = emailHandler;
  }

  public void processEmailHandler(String emailText) {
    boolean keyWordFound = false;

    if (keyWords().length == 0) {
      keyWordFound = true;
    } else {
      for (String oneKeyWord : keyWords()) {
        if (emailText.contains(oneKeyWord)) {
          keyWordFound = true;
          break;
        }
      }
    }
    if (keyWordFound) {
      processEmailFinal(emailText);
    } else {
      // pass along the chain if the email is not processed
      // by the current email handler
      theNextHandlerInTheChain.processEmailHandler(emailText);
    }
  }

  public static void handleEmail(String emailText) {
    UniversityEmailHandler academic = new AcademicEmailHandler();
    UniversityEmailHandler alumni = new AlumniEmailHandler();
    UniversityEmailHandler advising = new AdvisingEmailHandler();
    UniversityEmailHandler finance = new FinanceEmailHandler();
    UniversityEmailHandler hr = new HREmailHandler();
    UniversityEmailHandler admin = new AdminEmailHandler();

    academic.setNextEmailHandler(alumni);
    alumni.setNextEmailHandler(advising);
    advising.setNextEmailHandler(finance);
    finance.setNextEmailHandler(hr);
    hr.setNextEmailHandler(admin);

    academic.processEmailHandler(emailText);
  }
}
