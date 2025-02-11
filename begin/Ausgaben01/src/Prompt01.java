public class Prompt01 {
    public static void main(String[] args) {
        System.out.printf("Was ist heute los? %n");
        System.out.printf("%d Kanäle und über all nur %s.%n", 201, "Bilder");
        System.out.printf("%d Äpfel kosten %f Euro ", 50, 10.99);
        // Zinsrechnen
        System.out.println();
        double capital = 20000;
        double interestRate = 3.6 /*Prozentsatz */;
        double totalRate = capital * interestRate / 100;
        System.out.print("Zinsen: ");
        System.out.println(totalRate);
    }
}
