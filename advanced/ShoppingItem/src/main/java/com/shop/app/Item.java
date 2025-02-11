
package com.shop.app;
public class Item {
    String artikel;
    double net_amount;
    int vat;
    int amount;

    public Item(String artikel, double net_amount, int vat, int amount) {
        this.artikel = artikel;
        this.net_amount = net_amount;
        this.vat = vat;
        this.amount = amount;
    }

    public String getArtikel() {
        return this.artikel;
    }

    public double getNet_Amount() {
        return this.net_amount;
    }

    public int getVat() {
        return this.vat;
    }

    public int getAmount() {
        return this.amount;
    }
}
