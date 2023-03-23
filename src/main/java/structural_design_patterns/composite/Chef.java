package structural_design_patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bl4kee
 * @since 22.03.2023
 */
public class Chef implements KitchenStaff {

  private String name;
  private String role;
  private List<KitchenStaff> staffList;

  public Chef(String name, String role) {
    this.name = name;
    this.role = role;
    staffList = new ArrayList<>();
  }

  public void add(Chef chef) {
    staffList.add(chef);
  }

  public void fire(Chef chef) {
    staffList.remove(chef);
  }

  public List<KitchenStaff> getStaffList() {
    return staffList;
  }

  @Override
  public String getDetails() {
    return (name + " is assigned the role of " + role);
  }

  public String getName() {
    return name;
  }

  public String getRole() {
    return role;
  }
}
