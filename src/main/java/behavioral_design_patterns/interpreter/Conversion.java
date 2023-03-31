package behavioral_design_patterns.interpreter;

/**
 * @author bl4kee
 * @since 29.03.2023
 */
public class Conversion {

  public String userInput;

  public Conversion(String userInput) {
    this.userInput = userInput;
  }

  public void convertToCharacters(String userInput) {
    this.userInput = userInput;
    System.out.println("Decrypted Message: ");
    char[] answer = userInput.toCharArray();

    for (char c : answer) {
      switch (c) {
        case '0' -> System.out.print("A");
        case '1' -> System.out.print("E");
        case '2' -> System.out.print("I");
        case '3' -> System.out.print("Y");
        case '4' -> System.out.print("O");
        case '5' -> System.out.print("L");
        case '6' -> System.out.print("R");
        case '7' -> System.out.print("T");
        case '8' -> System.out.print("C");
        case '9' -> System.out.print("S");
      }
    }
  }
}
