package test;

/**
 * Singleton
 */
public class Singleton {
  private static Singleton singleton = null;
  private int value;
  private String test;

  private Singleton() {
  };

  public static Singleton getInstance() {
    if (singleton == null) {
      singleton = new Singleton();
    }
    return singleton;
  }

  public int getValue() {
    return this.value;
  }

  public String getTest() {
    return this.test;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public void setTest(String test) {
    this.test = test;
  }

}
