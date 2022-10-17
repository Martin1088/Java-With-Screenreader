import java.util.Arrays;
import java.util.Scanner;

public class Maximumeinfach {
  public static void main(String[] args) {
    // drei Zahlen eingeben und maximum bestimmen
    Scanner myReader = new Scanner(System.in);
    int[] numbers = new  int[3];
    System.out.println("Geben Sie drei Zahlen ein");
    numbers[0] = myReader.nextInt();
    numbers[1] = myReader.nextInt();
    numbers[2] = myReader.nextInt();
    Arrays.sort(numbers);
    System.out.println(numbers);
    for (int i : numbers) {
      System.out.println(i);
    }

  }

}
