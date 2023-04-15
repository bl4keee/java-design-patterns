package creational_design_patterns.singleton;

/**
 * @author bl4kee
 * @since 15.04.2023
 */
public class AccountDriver {

  public static void main(String[] args) {

    System.out.println("\n\nBank Account Number Generation System");

    CreateBankAccount firstAccount = CreateBankAccount.getNewAccount();

    CreateBankAccount secondAccount = CreateBankAccount.getNewAccount();
  }
}
