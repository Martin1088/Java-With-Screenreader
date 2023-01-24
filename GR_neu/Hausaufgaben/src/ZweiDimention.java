public class ZweiDimention {

  public static void minDistance(int[][] c) {
    // Ergebnis Variable
    int[] resultIndex = new int[2];
    double distance = 0;
    double distanceResult = 10000; // hoher Wert
    // zwischen Schritte
    int y;
    int x;

    for (int i = 0; i < (c.length - 1); i++) {
      for (int j = 1; j < (c.length); j++) {
        x = Math.abs((c[i][0] - c[j][0]));
        y = Math.abs((c[i][1] - c[j][1]));
        distance = Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));
        if (distance < distanceResult) {
          distanceResult = distance;
          resultIndex[0] = i;
          resultIndex[1] = j;
        }
      }
    }
    // Ausgabe
    System.out.println("Die minimale Distance ist : " + distanceResult);
    System.out.println("Die Indizes sind : " + resultIndex[0] + ", " + resultIndex[1]);
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
    minDistance(test);
  }
}