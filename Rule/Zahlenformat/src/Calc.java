import java.util.Scanner;

public class Calc {
  public static String dez2bin(int number) {
    String result = "";
    while (number != 0) {
      result = String.valueOf(number % 2) + result;
      number = number /2;
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int task;
    System.out.println("*Geben Sie eine Dezimal Zahl ein ");
    task = scanner.nextInt();
    System.out.println(dez2bin(task));
  }

}
