import java.util.ArrayList;
import java.util.Arrays;

public class RandomNumber {
  public static void main(String [] args) {
    // Array mit 10 nummern
    ArrayList<Integer> rand = new ArrayList<>();
    int[] randarray = new int[10];
    for (int i = 0; i < 10; i++) {
      randarray[i] = (int) (Math.random() * 1001);
      rand.add((int)(Math.random() * 1001));
    }
    for (Integer i: rand) {
      System.out.println(i);
    }
    for (Integer i: randarray) {
      System.out.print(i + " ");
    }
    // Aufgabe 2 Indexnummern
    int[] indexnumber = new int[10];
    System.out.println();
    for (int i = 0;i < 10 ; i++) {
      indexnumber[i] = i;
      System.out.print(" " + indexnumber[i]);
    }
    // Aufgabe 3 randarray cobieren und 10 addieren
    System.out.println();
    int[] randadd = new int[10];
    for (int i = 0;i < 10; i++) {
       randadd[i] = randarray[i] + 10;
    }
    for (int i = 0; i < 10; i++) {
      if (i <=(randadd.length) -2)  {
        System.out.print(randadd[i] + " ,");
      } else {
        System.out.print(randadd[i]);
      }

    }

  }

}
