public class ShoppingItem {
    String item;
    double netAmount;
    int valuedAddedTax;
    int amount;
    
    public ShoppingItem(String produkt, double nettobetrag, int mws, int menge){
        item = produkt;
        netAmount = nettobetrag;
        valuedAddedTax = mws;
        amount = menge;
    }
    
    public void Ausgabe() {
        System.out.println("Produkt: " + item);
        System.out.println("Nettobetrag: " + netAmount + "€");
        System.out.println("Mehrwertsteuer: " + valuedAddedTax + "%");
        System.out.println("Menge: " + amount);
    }

public static void main(String [] args){
    ShoppingItem produkt = new ShoppingItem("Butter",2.50,7,2);
    
    produkt.Ausgabe();
   }    
}