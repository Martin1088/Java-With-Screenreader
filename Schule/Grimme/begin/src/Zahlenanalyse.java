public class Zahlenanalyse {
  public static void main(String[] args) {
    // Zahlen analyse

    for (int number = 1;number < 200; number++ ) {
      // Teilbar durch 3 und 5
      if (number % 5 == 0 || number % 3 == 0) {
        System.out.print("# " + number + "# ");
      } else {
        System.out.print(" " + number + " ");
      }
      // teilbarkeit Links
      if (number % 10 == 0) {
        System.out.print("Zehnerzahl ");
      }
      // ungerade und gerade
      if (number % 2 == 0) {
        System.out.print("g ");
      } else {
        System.out.print("u ");
      }
      // durch 7
      if (number % 7 != 0) {
        System.out.print("nT7 ");
      }
      System.out.println();
    }
  }

}
