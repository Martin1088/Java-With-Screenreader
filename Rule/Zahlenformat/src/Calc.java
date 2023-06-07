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
  public static String representation(int number) {
    String result;
    if (number <= 9) {
      result = String.valueOf(number);
    } else if (number == 10) {
      result = "A";
    } else if (number == 11) {
      result = "B";
    } else if (number == 12) {
      result = "C";
    } else if (number == 13) {
      result = "D";
    } else if (number == 14) {
      result = "E";
    } else {
      result = "F";
    }
    return result;
  }
  public static String dez2hex(int number) {
    String result = "";
    while (number != 0) {
      result = representation(number % 16) + result;
      number = number / 16;
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int task;
    System.out.println("*Geben Sie eine Dezimal Zahl ein ");
    task = scanner.nextInt();
    System.out.println(dez2bin(task));
    System.out.println("Geben Sie eine Dezimalzahl ein zum um rechnen in hex ");
    task = scanner.nextInt();
    System.out.println(dez2hex(task));
  }

}
