package structural_design_patterns.proxy;

/**
 * @author bl4kee
 * @since 27.03.2023
 */
public class ProxyDriver {

  public static void main(String[] args) {

    System.out.println("\n\n===============================================");
    System.out.println("\t\tProxy Weather Forecast Demo");
    System.out.println("===============================================");

    Proxy proxyCall = new Proxy();
    proxyCall.whoAmI();
  }
}
