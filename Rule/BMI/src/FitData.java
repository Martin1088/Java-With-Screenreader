public class FitData {
private String name;
private  float gewicht;
private float groesse;
// kein Consturctor

  public void setGewicht(float gewicht) {
    this.gewicht = gewicht;
  }

  public void setGroesse(float groesse) {
    this.groesse = groesse;
  }
  // BMI berechnen
  public float getBMI() {
    double result;
    result = gewicht / (Math.sqrt(groesse));
      result = Math.round(result);
      return(float) result;
  }
  // Auswerten BMI
  public void bmiAuswert() {
    float bmi = getBMI();
    if (bmi < 19) {
      System.out.println("Sie müssen mehr essen");
    } else if (bmi > 25) {
      System.out.println("Sie sollten weniger essen");
    } else {
      System.out.println("ihr BMI ist in Ordnung");
    }
  }
  // Medhode xy
  public double xy(double bmi) {
    bmi = bmi +  0.05;
    bmi = bmi * 10;
    bmi = Math.round(bmi);
    bmi = bmi /10;
    return bmi;
  }
}
