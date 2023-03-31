package behavioral_design_patterns.interpreter;

import java.util.Scanner;

/**
 * @author bl4kee
 * @since 29.03.2023
 */
public class InterpreterDriver {

  public Conversion originatingContent = null;
  public Expression theExpression = null;

  public InterpreterDriver(Conversion content) {
    originatingContent = content;
  }

  public void interpret(String tString) {
    theExpression = new MapIntToCharacters(tString);
    theExpression.interpret(originatingContent);
  }

  public static void main(String[] args) {
    System.out.println("\n\nCODE INTERPRETER\n");
    System.out.print("Enter your code: ");
    Scanner in = new Scanner(System.in);
    String userInput = in.nextLine();
    System.out.println("Your code: " + userInput);
    Conversion conversion = new Conversion(userInput);
    InterpreterDriver userCode = new InterpreterDriver(conversion);
    userCode.interpret(userInput);
    System.out.println("\n\n");
  }
}
