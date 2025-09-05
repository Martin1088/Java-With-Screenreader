import DNA.DnaAnalyse;

public class Main {
    public static void main(String[] args) {
        DnaAnalyse dnaAnalyse = new DnaAnalyse();
        String[] testData = new String[] {"GTCAGTCA", "AGTAGTAC", "CTCTGACA"};
        dnaAnalyse.getBalance(testData);
    }
}