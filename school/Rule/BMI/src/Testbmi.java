public class Testbmi {
  public static void main(String[] args) {
    FitData fitData = new FitData();
    double A;
    double bmi;
    A = fitData.xy(23.152);
    System.out.println(A);
    fitData.setGewicht(65);;
    fitData.setGroesse(180);
    bmi = fitData.getBMI();
    fitData.bmiAuswert();
    System.out.println(bmi);
  }

}
