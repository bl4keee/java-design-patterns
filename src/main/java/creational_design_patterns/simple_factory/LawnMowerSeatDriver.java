package creational_design_patterns.simple_factory;

/**
 * @author bl4kee
 * @since 10.04.2023
 */
public class LawnMowerSeatDriver {

  public static void main(String[] args) {
    System.out.println("\n\n");

    LawnMowerSeat residentialSeat = LawnMowerSeatFactory.create(LawnMowerSeatFactory.LawnMowerType.RESIDENTIAL);
    LawnMowerSeat commercialSeat = LawnMowerSeatFactory.create(LawnMowerSeatFactory.LawnMowerType.COMMERCIAL);
  }
}
