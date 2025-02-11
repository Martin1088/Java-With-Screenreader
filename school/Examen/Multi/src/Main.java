import java.util.Scanner;

public class Main {
    public static int Multiplication(int a, int b) {
        int  result = 0;
        while (a > 0) {
            if ((a % 2) != 0) {
                result += b;
            }
            a = a / 2;
            b = b * 2;
        }
        return result;
    }

    public static void Matchingsticks() {
        int x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anzahl der Streichhölzer in der ersten Reihe");
        x = scanner.nextInt();
        System.out.println("Anzahl der Streichhölzer in der zweien Reihe");
        y = scanner.nextInt();
        while (x != y) {
            if (y < x) {
                x = x - y;
            } else {
                y = x - y;
            }
        }
        System.out.println(" Gleiche länge bei " + x + "!");
    }

    public static void Leapyears() {
        Scanner scanner = new Scanner(System. in);
        int year = scanner.nextInt();
        boolean leapyear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0 ) {
                if (year % 400 == 0) {
                    leapyear = true;
                } else {
                    leapyear = false;
                }
            }
        } else {
            leapyear = false;
        }
        if (leapyear) {
            System.out.println("ist Schaltjahzr " + year);
        } else {
            System.out.println("kein Schaltjahr " + year);
        }

    }

    public static void Collatz(int n) {
        int count = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                System.out.println(n);
            } else {
                n = n * 3 +1;
                System.out.println(n);
            }
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int res = Multiplication(126, 13);
        System.out.println("result: " + res);
        Scanner scanner = new Scanner(System. in);
        int value = scanner.nextInt();
        //Matchingsticks();
        //Leapyears();
        Collatz(value);
    }
}
