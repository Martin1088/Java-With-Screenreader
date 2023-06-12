package StringTest;

public class Substring {

  public static void main(String[] args) {
    String myTest01 = "Hubert-Sternberg-Schule";
    String a = myTest01.substring(0, 6);
    String b = myTest01.substring(7, 16);
    System.out.println(b);
    System.out.println(a);
    System.out.println(myTest01.substring(17));
  }
}
