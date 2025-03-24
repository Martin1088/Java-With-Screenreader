package de.samply;

import de.samply.dna.DnaAnalyse;

public class App 
{
    public static void main( String[] args )
    {
        DnaAnalyse dnaAnalyse = new DnaAnalyse();
        String[] testData = new String[] {"GTCAGTCA", "AGTAGTAC", "CTCTGACA"};
        /*
        String[] testData = {
                "GTCAGTCAAGCTAGTC", "AGTAGTACGCTAGCTA", "CTCTGACAGTCAAGTC",
                "TGCATGCACTGATGCA", "ATGCATGCAGTCATGC", "GATCTGACATGCAGTC",
                "ACGTACGTGATCGTAC", "GTAGCTAGTGACTGCA", "CTAGCTAGGACTAGCT",
                "AGCTAGCTGACTAGGC", "CGATCGATGATCTAGT", "TGCAATGCAGCTAGTC",
                "GCTAGTCAAGCTAGTC", "ATCGATCGACTAGCTA", "TGCAGCTAGTGCATAG",
                "AGCTGACTGACTAGTG", "CTGACTGAGTCTAGAC", "GACTGACTAGTCAGTG",
                "TGCATCGTACGTAGCA", "ATGCTGACTGATAGCT"
        };
         */
        int lenghtBase = testData[0].length();
        int[][] result = dnaAnalyse.getBalance(testData);
        dnaAnalyse.DisplayBalance(result);
        //long[] encodedSequence = dnaAnalyse.getSequencesAsBits(testData);
        //int[][] bitResult = dnaAnalyse.getBalanceAsBits(encodedSequence, lenghtBase);
        //dnaAnalyse.DisplayBalance(bitResult);
    }
}
