package behavioral_design_patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author bl4kee
 * @since 03.04.2023
 */
public class IteratorExample {

  public static void main(String[] args) {
    ArrayList<String> colonies = new ArrayList<>();
    colonies.add("Aerlion");
    colonies.add("Aquaria");
    colonies.add("Canceron");
    colonies.add("Caprica");
    colonies.add("Gamenon");
    colonies.add("Leonis");
    colonies.add("Libran");
    colonies.add("Picon");
    colonies.add("Sagittaron");
    colonies.add("Scorpia");
    colonies.add("Tauron");
    colonies.add("Virgon");

    Iterator myIterator = colonies.iterator();

    System.out.println("\n\nOriginal Colonies of Kobol:");

    while (myIterator.hasNext()) {
      System.out.println("\t\t" + myIterator.next());
    }
  }
}
