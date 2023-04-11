package creational_design_patterns.builder;

/**
 * @author bl4kee
 * @since 06.04.2023
 */
public class RoasterDirector {

  Builder currentBuilder;

  public void buildRoaster(Builder builder) {
    currentBuilder = builder;
    currentBuilder.buildCoolingTray();
    currentBuilder.buildExhaustSystem();
    currentBuilder.buildGasBurner();
    currentBuilder.buildInnerDrum();
    currentBuilder.buildMainBody();
    currentBuilder.buildMotor();
    currentBuilder.buildPlatform();
    currentBuilder.buildThermocouples();
  }
}
