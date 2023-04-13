package creational_design_patterns.prototype;

/**
 * @author bl4kee
 * @since 10.04.2023
 */
public class LevelDriver {

  public static void main(String[] args) {
    System.out.println("\n\nGAME LEVEL CREATION\n");

    BaseLevel dungeon = new Dungeon("Dungeon Level 1");
    dungeon.numberOfNPCs = 500;
    dungeon.numberOfTokens = 80;

    BaseLevel forest = new Forest("Forest Level 1");
    forest.numberOfNPCs = 250;
    forest.numberOfTokens = 120;

    BaseLevel city = new City("City Level 1");
    city.numberOfNPCs = 319;
    city.numberOfTokens = 600;

    BaseLevel dungeonLevelClone;
    dungeonLevelClone = dungeon.clone();
    dungeonLevelClone.setLevelName("Dungeon Level 2");
    dungeonLevelClone.setNumberOfNPCs(1000);
    dungeonLevelClone.setNumberOfTokens(40);

    System.out.println("Dungeon Level information");
    System.out.println("Level Name: " + dungeon.getLevelName());
    System.out.println("Number of NPCs: " + dungeon.getNumberOfNPCs());
    System.out.println("Number of Tokens: " + dungeon.getNumberOfTokens());

    System.out.println("\nCloned Level information");
    System.out.println("Level Name: " + dungeonLevelClone.getLevelName());
    System.out.println("Number of NPCs: " + dungeonLevelClone.getNumberOfNPCs());
    System.out.println("Number of Tokens: " + dungeonLevelClone.getNumberOfTokens());

  }
}
