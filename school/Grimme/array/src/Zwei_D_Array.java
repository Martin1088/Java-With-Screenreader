public class Zwei_D_Array {
  public static void Analyse(int[][] convert) {
    int sum = 0;
    int max_value = 0;
    int min_value = 1000; // hoher Wert an hand des arrays
    for (int i = 0; i < convert.length; i++) {
      for (int j = 0; j < convert[i].length; j++) {
        if (max_value < convert[i][j] ) {
          max_value = convert[i][j];
        }
        if (min_value > convert[i][j]) {
          min_value = convert[i][j];
        }
        sum = sum + convert[i][j];
      }
    }
    System.out.println("Summe aller Elemente: " + sum);
    System.out.println("Größtes Element: " + max_value);
    System.out.println("Kleinstes Element: " + min_value);
  }
  public static void main(String[] args) {
    int[][]data={{3,2,5},
        {1,4,4,8},
        {8,1,7,6,7},
        {2,5}
    };
    System.out.println(data.length);
    System.out.println(data[0].length);
    Analyse(data);
  }
}
