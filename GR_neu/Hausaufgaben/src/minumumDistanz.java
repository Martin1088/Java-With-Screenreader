public class minumumDistanz {

  public static void main(String[] args) {
    int[] test = {4, 8, 6, 1, 2, 9, 4};
    int[] resultIndex = new int[2];
    int[] resultValues = new int[2];
    int distance = 0;
    int distanceResult = 100; // hoher Wert

    // length -1 für den durchlauf
    for (int i = 0; i < (test.length - 2); i++) {

      distance = test[i + 1] - test[i];
      distance = Math.abs(distance);
      if (distance < distanceResult) {
        distanceResult = distance;
        resultIndex[0] = i;
        resultIndex[1] = i + 1;
        resultValues[0] = test[i];
        resultValues[1] = test[i + 1];

      }
    }
    // Ausgabe
    System.out.println("minimale Distanz: " + distanceResult);
    System.out.println("Indizes der Nachbarn: " + resultIndex[0] + ", " + resultIndex[1]);
    System.out.println("Nachbarn: " + resultValues[0] + ", " + resultValues[1]);


  }
}
