import java.awt.SystemTray;

public class Suddoko {
  public static boolean checkRow(int[] [] sudoku) {
    // Row
    int sum = 0;
    int result =45; //all togehther
    for(int[] e: sudoku) {
      for (int number: e) {
        sum = number + sum;
      }
      if (sum != result) {
        return false;
      }
      sum = 0;
    }
    return true;
  }
  pu public static checkCulomn(int[] [] sudoku ) {
    // Column
  }
  public static void main(String[] args) {
    int[][] sudoku =
        {
            {8,3,5,4,1,6,9,2,7},
            {2,9,6,8,5,7,4,3,1},
            {4,1,7,2,9,3,6,5,8},
            {5,6,9,1,3,4,7,8,2},
            {1,2,3,6,7,8,5,4,9},
            {7,4,8,5,2,9,1,6,3},
            {6,5,2,7,8,1,3,9,4},
            {9,8,1,3,4,5,2,7,6},
            {3,7,4,9,6,2,8,1,5}
        };
    // check if is correct
    if (checkRow(sudoku)) {
      System.out.println("Lösung ist korrekt");
    } else {
      System.out.println("Lösung ist nicht korekt ");
    }

  }

}
