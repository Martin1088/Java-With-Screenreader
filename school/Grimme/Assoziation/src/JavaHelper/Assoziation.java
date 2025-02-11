package JavaHelper;

public class Assoziation {

  public static void main(String[] args) {
    Mitarbeiter mueller = new Mitarbeiter("Mueller");
    Raum raum101 = new Raum(101);
    mueller.hatZutrittZu(raum101);
    System.out.println(raum101.getraumNr());
    System.out.println(mueller.getName());


  }
}
