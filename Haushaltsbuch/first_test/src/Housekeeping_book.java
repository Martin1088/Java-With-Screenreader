import java.util.ArrayList;

public class Housekeeping_book {
  class collection_balance_sheet {
    int income;
    int outcome;
    int end_balance;

    public collection_balance_sheet(int end_balance, int outcome, int income) {
      this.end_balance = end_balance;
      this.outcome = outcome;
      this.income = income;
    }

  }
  // arrays forthe entries
  ArrayList<entries> booking = new ArrayList<>();
  static class entries {
    String title;
    String typ;
    int amount;
    String datum;

    public entries(String title, String typ, int amount, String datum) {
      this.title = title;
      this.typ = typ;
      this.amount = amount;
      this.datum = datum;
    }
  }

}
