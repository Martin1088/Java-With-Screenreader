package StringTest;

public class FQDNAufgabe {
  public static String[] country(String task) {
    String[] result = task.split("\\.");
    return result;

  }

  public static void main(String[] args) {
    String adresse = "www.tagesschau.de";
    System.out.println(adresse.indexOf("."));
    System.out.println(adresse.charAt(3));
    String[] result = country(adresse);
    for (String s: result) {
      System.out.println(s);
    }
  }
}
