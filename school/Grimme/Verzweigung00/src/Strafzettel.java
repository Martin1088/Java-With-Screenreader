import java.util.Scanner;

public class Strafzettel {
  public static void außerorts() {
    // bei innerorts true und außerorts false
    Katalog(false);
  }
  public static void innerorts() {
    // bei innerorts true und außerorts false
    Katalog(true);
  }
  // Bußgeld Katalog
  public static void Katalog(boolean ort) {
    Scanner myscanner = new Scanner(System.in);
    System.out.println("Wie hoch war die Überschreitung ?");
    int speed = myscanner.nextInt();
    // Strafe
    System.out.print("Strafe: ");
    if (speed <= 10) {
      choiceOrt(ort, 0);
    } else if (speed <= 15) {
      choiceOrt(ort, 1);
    } else if (speed <= 20) {
      choiceOrt(ort, 2);
    } else if (speed <= 25) {
      choiceOrt(ort, 3);
    } else if (speed <= 30) {
      choiceOrt(ort, 4);
    }else if (speed <= 40) {
      choiceOrt(ort, 5);
    } else if (speed <= 50) {
      choiceOrt(ort, 6);
    } else if (speed <= 60) {
      choiceOrt(ort, 7);
    } else if (speed <= 70) {
      choiceOrt(ort, 8);
    } else {
      choiceOrt(ort, 9);
    }
    // \n
    System.out.print("\n");
  }

  public static void choiceOrt(boolean ort, int pos) {
    Integer[] I_Strafe = {30, 50, 70, 115, 180, 260, 400, 560, 700, 800};
    Integer[] A_Strafe = {20, 40, 60, 100, 150, 200, 320, 480, 600, 700};
    if (ort) {
      System.out.print(I_Strafe[pos]);
    } else {
      System.out.print(A_Strafe[pos]);
    }
  }
  // Punkte
  public static void points(int number) {

  }

  public static void main(String[] args) {
    Scanner myscanner = new Scanner(System.in);
    int choice = 0;
    System.out.println("1. Überschreitung außerorts: ");
    System.out.println("2. Überschreitung innerorts: ");
    boolean askAgain = true;
    while (askAgain) {
      choice = myscanner.nextInt();
      switch (choice){
        case 1:
          // außerorts
          außerorts();
          askAgain = false;
          break;
        case 2:
          // innerortsa
          innerorts();
          askAgain = false;
          break;
        default:
          System.out.println("Die Eingabe muss 1 oder 2 sein.");
          break;

      }

    }


  }

}
