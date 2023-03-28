package structural_design_patterns.proxy;

/**
 * @author bl4kee
 * @since 27.03.2023
 */
public class ConcreteWeather extends Weather {

  @Override
  public void whoAmI() {
    System.out.println("\tMethod Call from " + this.getClass().getSimpleName() + " class");
    System.out.println("\t\tWeather forecast is sunny\n");
  }
}
