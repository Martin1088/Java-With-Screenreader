package de.samply;

public class test_Input {
    // Funktion zum einlesen von Zahlen und Mittelwert errechnen
    private static double findAverage(String [] input) {
        double result = 0;
        try {
            for (String s: input) {
                result += Integer.parseInt(s);
                System.out.println(s + " ");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return result / input.length;
    }

    public static void main(String [] args) {
        System.out.println("Hier kommt der durchschnitt aller er eingegebenen Zahlen: ");
        double avg = findAverage(args);
        System.out.println(avg);
    }
}
