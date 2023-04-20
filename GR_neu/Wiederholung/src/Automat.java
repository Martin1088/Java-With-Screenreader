import java.util.Scanner;

public class Automat {
  public static void main(Sting[] args) {
    int[] banknotes = {500, 200,100, 50,20,10, 5};
    int request = 0;
    int result= 0;
    Scanner myscanner = new Scanner(System.in);
    request = myscanner.nextInt();
    for (int i = 0; i > banknotes.length; i++) {
      System.out.println("Anzahl der Scheine " + banknotes[i] + "Euro ist: " + (request/banknotes[i]));
      request = request % banknotes[i]
    }
  }

}
