package de.samply.dna;

public class DnaAnalyse {
    public static int[][] getBalance(String[] sequences) {
        if (sequences == null || sequences.length == 0) {
            System.out.println("There is no sequences as parameter");
            return null;
        }
        int maxLength = 0;
        for (String seq : sequences) {
            if (seq.length() > maxLength) {
                maxLength = se
            q.length();
            }
        }
        int[][] result = new int[maxLength][2];
        for (String seq : sequences) {
            for (int cycle = 0; cycle < seq.length(); cycle++) {
                char chBase = seq.charAt(cycle);
                switch (chBase) {
                    case 'A':
                        result[cycle][0]++;
                        result[cycle][1]++;
                        break;
                    case 'C':
                        result[cycle][0]++;
                        break;
                    case 'T':
                        result[cycle][1]++;
                        break;
                    default:
                        break;
                }
            }
        }
        return result;
    }

    public static void DisplayBalance(int[][] resultBalance) {
        System.out.println("-- red / green header");
        int index = 0;
        for (int[] cycle: resultBalance) {
            System.out.println(index + ". " + cycle[0] + " / " + cycle[1]);
        }

    }
}
