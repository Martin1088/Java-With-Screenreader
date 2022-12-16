public class Max_Aufgabe3 {

  public static void main(String[] args) {
    int[] values = {3,1,5,7,4,12,3,8,-2};
    int max_values = 0;
    int second_highest = 1;
    for (int i = 0; i < values.length; i++) {
      if (max_values < values[i]) {
        max_values = values[i];
      }
    }
    for (int i = 0; i < values.length; i++) {
      if (second_highest < values[i] && max_values != values[i]) {
        second_highest = values[i];
      }
    }
    System.out.println(max_values);
    System.out.println(second_highest);
  }
}
