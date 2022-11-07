 public class Sportartikel {
   public static double Rechne (double[] bestell) {
     double betrag = 0;
     double sum = 0;
     for (int i = 0; i < bestell.length; i++) {
       sum += bestell[i];
       System.out.println(sum);
       System.out.println(bestell[i]);
     }
     if (sum >= 1000) {
       betrag = sum - ((sum / 100) * 5);
     } else if (sum >= 5000) {
       betrag = sum - ((sum / 100) * 10);
     } else {
       betrag = sum;
     }
     return betrag;
   }

     public static void main(String[] args) {
  double[] bestell = { 300.50 , 195.99, 4009.95};
  double[] bestell01 = {1000, 1000, 2000, 2000};
  double t = Rechne(bestell01);
    System.out.println("Rechnungsbetrag: " + t  + " Euro");

  }

 }
