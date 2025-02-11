public class Calculator {
    public static void main(String[] args) {
        // Zinsrechner
        System.out.println("Gebe das Kapital ein: ");
        double capital = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Geben Sie den Zinssatz ein: ");
        double interestRate = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Geben Sie die Anlagendauer ein in Monaten: ");
        int month = new java.util.Scanner(System.in).nextInt();
        double totalRate = capital * interestRate * month / (12*100);
        System.out.printf("Die Zinsen betragen: %g %n", totalRate);

    }
}
