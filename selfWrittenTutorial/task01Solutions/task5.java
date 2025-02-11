import java.util.HashMap;
import java.util.ArrayList;
public class Shoppinglists {
    public static void main(String [] args){
        HashMap<Integer,ArrayList> shoppinglist = new HashMap<Integer,ArrayList>();
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        int count;
        
        list1.add("Butter");
        list1.add("3.00€");
        list1.add("7%");
        list1.add("2");
        
        list1.add("Kaffepulver");
        list1.add("5.00€");
        list1.add("7%");
        list1.add("3");
        shoppinglist.put(0,list1);
        
        list2.add("Brot");
        list2.add("5.00€");
        list2.add("7%");
        list2.add("2");
        
        list2.add("Käse");
        list2.add("2.50€");
        list2.add("7%");
        list2.add("4");
        
        list2.add("Wurst");
        list2.add("2.50€");
        list2.add("7%");
        list2.add("2");
        shoppinglist.put(1,list2);
        

        
        for (int i = 0; i<shoppinglist.size(); i++){
            count = 0;
            System.out.println("Liste " + (i + 1) + ": ");
            while(count + 1 < shoppinglist.get(i).size()) {
            System.out.println("Produkt: " + shoppinglist.get(i).get(count));
            count++;
            System.out.println("Preis: " + shoppinglist.get(i).get(count) + "€");
            count++;
            System.out.println("Mehrwertsteuer: " + shoppinglist.get(i).get(count) + "%");
            count++;
            System.out.println("Menge: " + shoppinglist.get(i).get(count));
            count++;
            System.out.println();
            }
            System.out.println("_______________");
        }
    }
}