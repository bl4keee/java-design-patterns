package structural_design_patterns.composite;

import java.util.List;

/**
 * @author bl4kee
 * @since 22.03.2023
 */
public class KitchenStaffDriver {

  public static void main(String[] args) {
    Chef execChef = new Chef("Tomasz Tomaszewski", "Executive Chef");
    Chef headChef = new Chef("Adam Adamowski", "Head Chef");
    Chef sousChef1 = new Chef("Marcin Marcinkowski", "Sous Chef");
    Chef sousChef2 = new Chef("Wojciech Wojciechowski", "Sous Chef");
    Chef lineChef1 = new Chef("Łukasz Łukaszowski", "Line Chef");
    Chef lineChef2 = new Chef("Jakub Jakubowski", "Line Chef");
    Chef lineChef3 = new Chef("Dawid Dawidowski", "Line Chef");
    Chef lineChef4 = new Chef("Kamil Kamilowski", "Line Chef");
    Chef commisChef1 = new Chef("Oskar Oskarowski", "Commis Chef");
    Chef commisChef2 = new Chef("Maciej Maciejowski", "Commis Chef");

    // Executive Chef at the top of the tree structure
    execChef.add(headChef);

    // Sous Chefs to be subordinated to Head Chef
    headChef.add(sousChef1);
    headChef.add(sousChef2);

    // Line Chefs to be subordinated to Sous Chefs
    sousChef1.add(lineChef1);
    sousChef1.add(lineChef2);
    sousChef1.add(lineChef3);
    sousChef1.add(lineChef4);

    // Commis Chefs to be subordinated under Line Chef 1
    lineChef1.add(commisChef1);
    lineChef1.add(commisChef2);

    // No subordinates to other Line Chefs
    lineChef2.add(null);
    lineChef3.add(null);
    lineChef4.add(null);

    // No subordinates to Commis Chefs
    commisChef1.add(null);
    commisChef2.add(null);

    // Console output
    System.out.println("\n\nKitchen Staff Management System");
    System.out.println(execChef.getDetails());

    List<KitchenStaff> headChefs = execChef.getStaffList();
    headChefs.forEach(head -> System.out.println("\t" + head.getDetails()));

    List<KitchenStaff> sousChefs = headChef.getStaffList();
    sousChefs.forEach(sous -> System.out.println("\t\t" + sous.getDetails()));

    List<KitchenStaff> lineChefs = sousChef1.getStaffList();
    lineChefs.forEach(line -> System.out.println("\t\t\t" + line.getDetails()));

    List<KitchenStaff> commisChefs = lineChef1.getStaffList();
    commisChefs.forEach(commis -> System.out.println("\t\t\t\t" + commis.getDetails()));

    // fire operation of a line chef
    System.out.println("\n\nKITCHEN STAFF UPDATE");
    System.out.println("\t" + lineChef1.getName() + ", " + lineChef1.getRole() + ", has been terminated.");
    sousChef1.fire(lineChef1);
    System.out.println("\nHere is the updated list of Line Chefs: ");
    List<KitchenStaff> newLineChefs = sousChef1.getStaffList();
    newLineChefs.forEach(newLineChef -> System.out.println("\t" + newLineChef.getDetails()));


  }
}
