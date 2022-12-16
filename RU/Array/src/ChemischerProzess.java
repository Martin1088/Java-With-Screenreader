public class ChemischerProzess {
  public static String LiefereAusgabe( int messprotokoll[], int uG, int  oG) {
    String result = "";
    int counter = 0;
    int uG_counter = 0;
    int oG_counter = 0;
    int normal_counter = 0;

    for (int i = 0;i < messprotokoll.length; i++) {
      counter++;
      if ( messprotokoll[i] < uG) {
        uG_counter++;
      } else if (messprotokoll[i] <= oG) {
        normal_counter++;
      } else {
        oG_counter++;
      }
    }
    result ="Anzahl Messungen: " + counter + "\n" + "Unter Normalbereich: " + uG_counter + "\n" + "Im Normalbereich: " + normal_counter + "\n" + "Über Normalbereich: " + oG_counter;
    return result;
  }
  public static void main(String [] args) {
    // Methode Chemische Werte
    int[] messprodukolle = {200, 20, 100, 45, 7, 11, 58, 1024};
    int min_value = 50;
    int max_value = 100;
    String temp = LiefereAusgabe(messprodukolle, min_value,max_value);
    System.out.println(temp);
  }

}
