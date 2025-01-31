package creational_design_patterns.builder;

/**
 * @author bl4kee
 * @since 06.04.2023
 */
public class CommercialRoaster implements Builder {

  private Roaster roaster = new Roaster();

  @Override
  public Roaster getRoaster() {
    return roaster;
  }

  @Override
  public void buildMotor() {
    roaster.add("Standard Motor added");
  }

  @Override
  public void buildMainBody() {
    roaster.add("Commercial Roaster Main body added");
  }

  @Override
  public void buildPlatform() {
    roaster.add("Standard Platform added");
  }

  @Override
  public void buildGasBurner() {
    roaster.add("Commercial Roaster Gas Burner added");
  }

  @Override
  public void buildInnerDrum() {
    roaster.add("Commercial Roaster Inner Drum added");
  }

  @Override
  public void buildCoolingTray() {
    roaster.add("Commercial Roaster Cooling Tray added");
  }

  @Override
  public void buildThermocouples() {
    roaster.add("Standard Thermocouples added");
  }

  @Override
  public void buildExhaustSystem() {
    roaster.add("Commercial Roaster Exhaust System added");
  }
}
