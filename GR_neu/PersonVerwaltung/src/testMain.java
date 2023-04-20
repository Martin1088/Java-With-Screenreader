public class testMain {
public static void main(String[] args) {
   Mitarbeiter mitarbeiter = new Mitarbeiter(123, "Schulze");
   mitarbeiter.setVorname("Hans");
   mitarbeiter.setGehalt(900);
   mitarbeiter.erhoeheGehalt(10);
   mitarbeiter.erhoeheGehalt(2);
   mitarbeiter.erhoeheGehalt(-2);
   mitarbeiter.druckinfo();
   // mitarbeiter zwei
   Mitarbeiter m2 = new Mitarbeiter(101, "MÜller", "Teo", 2000);
       m2.druckinfo();
   Mitarbeiter m3 = new Mitarbeiter(122, "Dörr", "Erwin, 4000);
       m3.druckinfo();


}
}
