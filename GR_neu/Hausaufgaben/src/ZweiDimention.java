public class ZweiDimention {

  public static void minDistance(int[][] c) {
    // Ergebnis Variable
    int[] resultIndex = new int[2];
    int[] resultValues = new int[2];
    int distance = 0;
    int distanceResult = 10000; // hoher Wert
    // zwischen Schritte
    int y;
    int x;

    for (int i = 0; i < (c.length - 2); i++) {
      x = Math.abs((c[i][0] - c[i + 1][0]);
      y = x = Math.abs((c[i][1] - c[i + 1][1]);
    }
  }

  public static void main(String[] args) {
    int[][] test = {
        {3, 7},
        {30, 80},
        {80, 320},
        {15, 276},
        {84, 298},
        {19, 29},
        {200, 200},
        {191, 919}
    };

  }
}