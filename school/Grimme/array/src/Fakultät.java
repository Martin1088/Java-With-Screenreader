import java.math.BigInteger;

public class Fakultät {

  public static void main(String[] args) {
    // von 10 die Fakultät berechnen
    long result = 1;
    for (int i = 2; i < 10; i++) {
      result = result * i;
    }
    System.out.println(result);
  }
}
