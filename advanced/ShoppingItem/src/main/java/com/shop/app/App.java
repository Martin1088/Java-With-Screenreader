package com.shop.app;
import java.util.Vector;

public class App {
    public static void main(String[] args) {
        Vector vec = new Vector<Item>();
        Item str1 = new Item("Brot", 2.99, 7, 2 );
        vec.add(str1);
        for (int i = 0; i < vec.size(); i++) {
            System.out.println(((Item) vec.elementAt(i)).getArtikel());
        }

    }
}

