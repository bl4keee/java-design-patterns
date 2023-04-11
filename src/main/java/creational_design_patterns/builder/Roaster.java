package creational_design_patterns.builder;

import java.util.LinkedList;

/**
 * @author bl4kee
 * @since 06.04.2023
 */
public class Roaster {

  private LinkedList<String> components;

  public Roaster() {
    components = new LinkedList<>();
  }

  public void add(String component) {
    components.add(component);
  }

  public void display() {
    System.out.println("\n\nROASTER BUILD:");
    components.forEach(System.out::println);
  }
}
