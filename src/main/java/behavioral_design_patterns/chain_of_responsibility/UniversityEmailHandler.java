package behavioral_design_patterns.chain_of_responsibility;

/**
 * @author bl4kee
 * @since 29.03.2023
 */
public interface UniversityEmailHandler {

  public void setNextEmailHandler(UniversityEmailHandler emailHandler);

  public void processEmailHandler(String emailText);
}
