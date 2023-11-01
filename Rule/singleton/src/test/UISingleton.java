package test;

/**
 * UISingelton
 */
public class UISingleton {
  public static void main(String[] args) {
    Singleton si1 = Singleton.getInstance();
    Singleton si2 = Singleton.getInstance();
    System.out.println(si1);
    System.out.println(si2);
    si1.setValue(11);
    // System.out.println(si2.getValue);
  }

}
