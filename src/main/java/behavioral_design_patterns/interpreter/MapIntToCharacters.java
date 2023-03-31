package behavioral_design_patterns.interpreter;

/**
 * @author bl4kee
 * @since 29.03.2023
 */
public class MapIntToCharacters implements Expression {

  private String providedText;

  public MapIntToCharacters(String providedText) {
    this.providedText = providedText;
  }

  @Override
  public void interpret(Conversion originalContent) {
    originalContent.convertToCharacters(providedText);
  }
}
