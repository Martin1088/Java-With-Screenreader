//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Integer berechnePruefziffer(Integer blz, Integer kontoNr) {
        int pruefZiffer = 0;
        while ( blz >= 97 ) {
            blz = blz - 97;
        }
        kontoNr = (kontoNr * 1000000) + 131400;
        while (kontoNr >= 88529281) {
            kontoNr = kontoNr - 88529281;
        }
        while (kontoNr >= 97) {
            kontoNr = kontoNr - 97;
        }
        pruefZiffer = blz * 62 + kontoNr;
        while (pruefZiffer >= 97) {
            pruefZiffer = pruefZiffer - 97;
        }
        pruefZiffer = 98 - pruefZiffer;
        return pruefZiffer;
    }

    public static void main(String[] args) {
        int result = berechnePruefziffer(21050170, 12345678);
        System.out.println("Result: " + result);
    }
}