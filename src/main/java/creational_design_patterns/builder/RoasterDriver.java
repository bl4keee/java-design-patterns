package creational_design_patterns.builder;



/**
 * @author bl4kee
 * @since 06.04.2023
 */
public class RoasterDriver {

  public static void main(String[] args) {
    RoasterDirector roasterDirector = new RoasterDirector();
    Builder personalRoasterBuilder = new PersonalRoaster();
    Builder commercialRoasterBuilder = new CommercialRoaster();

    roasterDirector.buildRoaster(personalRoasterBuilder);
    Roaster personalUnit = personalRoasterBuilder.getRoaster();
    personalUnit.display();

    roasterDirector.buildRoaster(commercialRoasterBuilder);
    Roaster commercialUnit = commercialRoasterBuilder.getRoaster();
    commercialUnit.display();
  }
}
