package structural_design_patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bl4kee
 * @since 27.03.2023
 */
public class MattressFactory {

  Map<String, MattressInterface> sizes = new HashMap<>();

  public int numberOfMattresses() {
    return sizes.size();
  }

  public MattressInterface getFactoryMattress(String mattressSize) throws Exception {
    MattressInterface mattress = null;
    if (sizes.containsKey(mattressSize)) {
      mattress = sizes.get(mattressSize);
    } else {
      switch (mattressSize) {
        case "Crib" -> {
          System.out.println("\tA Crib Mattress did not exist, but does now");
          mattress = new Mattress("Crib");
          sizes.put("Crib", mattress);
        }
        case "Twin" -> {
          System.out.println("\tA Twin Mattress did not exist, but does now");
          mattress = new Mattress("Twin");
          sizes.put("Twin", mattress);
        }
        case "Full" -> {
          System.out.println("\tA Full Mattress did not exist, but does now");
          mattress = new Mattress("Full");
          sizes.put("Full", mattress);
        }
        default -> throw new Exception("\tMattress Creation Request Error: Invalid mattress size defined.");
      }
    }
    return mattress;
  }
}
