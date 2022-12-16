import java.io.FileReader;
import java.io.IOException;

public class satz {
  public static void main(String[] args) {

    String temp;
    String revers = "";
    try {
      FileReader myreader = new FileReader("satz.txt");
      temp = myreader.toString();
      String[] result = temp.split(" ");
      for (int i = temp.length() -1; i >= 0; i--) {
        revers = revers + temp.charAt(i);
      }
  String[] tep_reverse = revers.split(" ");

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
