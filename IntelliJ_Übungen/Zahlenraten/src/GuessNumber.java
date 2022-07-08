import java.util.Scanner;

public class GuessNumber {
    public static void main(String [] args) {
        // Erraten einer Zahl im Bereich von max und min
        int min = 1;
        int max = 20;
        int range = max - min + 1;
        int rand = (int) (Math.random() * range) + min;
        while (true) {
            System.out.println("Rate eine Ganzzahl zwischen " + min + " und " + max);
            int guess = new java.util.Scanner(System.in).nextInt();
            if (guess < min || guess > max) {
                System.out.println("Die Zahl ist nicht inerhalb " + min + " bis" + max);
                continue;
            }
            // Vergleichen der geratenen Zahl
            if (guess == rand) {
                System.out.println("Super Sie haben richtig geraten die Zahl war: " + rand);
                break;
            } else if (guess < rand) {
                System.out.println("Die geratene Zahl war zu klein!");
            } else if (guess > rand) {
                System.out.println("Die Zahl ist zu groß!");
            }
        }
    }
}
