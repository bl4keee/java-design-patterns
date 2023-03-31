package behavioral_design_patterns.interpreter;

/**
 * @author bl4kee
 * @since 29.03.2023
 */
public interface Expression {

  void interpret(Conversion originalContent);
}
