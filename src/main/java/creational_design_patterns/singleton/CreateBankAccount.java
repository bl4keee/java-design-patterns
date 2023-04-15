package creational_design_patterns.singleton;

/**
 * @author bl4kee
 * @since 15.04.2023
 */
public class CreateBankAccount {

  private static CreateBankAccount newAccount;

  private CreateBankAccount() {}

  public static CreateBankAccount getNewAccount() {
    if (newAccount == null) {
      newAccount =  new CreateBankAccount();
      System.out.println("New Account created.");
    } else {
      System.out.println("Account already opened.");
    }
    return newAccount;
  }
}
