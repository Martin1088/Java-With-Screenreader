import java.io.FileWriter;
import java.util.ArrayList;

public class PIN {

  public static void main(String[] args) {
    Integer[] pin = new Integer[10000];
    for (int i = 0; i < 10000; i++) {
      pin[i] = i;
    }
    // ausgabe und alle durcch 3 Teilbar mit darf nicht genutzt werden
    for (Integer l : pin) {
      if (l < 10) {
        System.out.print("000" + (String.valueOf(l)));
      } else if (l < 100) {
        System.out.print("00" + (String.valueOf(l)));
      }else if (l < 1000) {
        System.out.print("0" + (String.valueOf(l)));
      } else {
        System.out.print((String.valueOf(l)));
      }
      if (l % 3 == 0) {
        System.out.print(" PIN darf nicht verwendet werden");
      }
      System.out.print("\n");
    }

  }
}

