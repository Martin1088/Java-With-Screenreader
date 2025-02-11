public class Number {

  public static void main(String[] args) {
    byte a ;
    a = (byte) 1; // 128,126, 255
    System.out.println(a);
    short b;
    for (int i = 0; i< 200; i++) {
      b = (short) i;
      a= (byte) i;
      System.out.print(a);
      System.out.print(" ");
    }
  char c = '9';
    System.out.println();
    System.out.println((int) c);
    int d = 65;
    System.out.println((char) d);
  }
}
