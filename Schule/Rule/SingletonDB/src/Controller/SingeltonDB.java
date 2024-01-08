package Controller;

public class SingletonDB {
  private static SingletonDB instance;
  private String data;

  public SingletonDB(String data) {
    this.data = data;
  }

  public static SingletonDB getInstance(String data) {
    if (instance == null) {
      instance = new SingletonDB(data);
    }
    return instance;
  }
}
