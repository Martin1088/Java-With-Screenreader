package DNA;

public class DnaAnalyse {
    public static void getBalance(String[] sequences) {
        if (sequences == null || sequences.length == 0) {
            System.out.println("There is no sequences as parameter");
            return;
        }
        int lengthBase = sequences[0].length();
        System.out.println("-  red / green"); //as header
        for (int cycle = 0; cycle < lengthBase; cycle++) {
            int redCounter = 0;
            int greenCounter = 0;
            for (String sequence : sequences) {
                if (sequence.length() <= cycle) { continue; }
                char chBase = sequence.charAt(cycle);
                if (chBase == 'A' || chBase == 'C') {
                    redCounter++;
                }
                if (chBase == 'T' || chBase == 'A') {
                    greenCounter++;
                }
            }
            System.out.println((cycle + 1) + ". " + redCounter + " / " + greenCounter);
        }
    }
}
