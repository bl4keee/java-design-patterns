package creational_design_patterns.builder;

/**
 * @author bl4kee
 * @since 06.04.2023
 */
public interface Builder {

  Roaster getRoaster();
  void buildMotor();
  void buildMainBody();
  void buildPlatform();
  void buildGasBurner();
  void buildInnerDrum();
  void buildCoolingTray();
  void buildThermocouples();
  void buildExhaustSystem();
}
