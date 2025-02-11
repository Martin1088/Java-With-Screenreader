import java.util.ArrayList;
public class ShoppingList {
    public static void main(String [] args){
        ArrayList<String> shoppinglist = new ArrayList<String>();
        String [] produkt = new String[4];
        double kosten;
        
        shoppinglist.add("Milch, 1.50, 19, 12");
        shoppinglist.add("Butter, 3.00, 7, 3");
        shoppinglist.add("Brot, 2.50, 19, 1");
        
        for(String i : shoppinglist) {
            produkt = i.split(", ");
            
            System.out.println("Produkt: " + produkt[0]);
            System.out.println("Nettobetrag: " + produkt[1] + "€");
            System.out.println("Mehrwertsteuer: " + produkt[2] + "%");
            System.out.println("Menge: " + produkt[3]);

            kosten = Integer.parseInt(produkt[3])*(Double.parseDouble(produkt[1]) * (1+ (Double.parseDouble(produkt[2]) / 100)));
            kosten = Math.round(100.0 * kosten) / 100.0;

            System.out.println("Kosten: " + kosten + "€");
            System.out.println();
            
        }
    }
}
