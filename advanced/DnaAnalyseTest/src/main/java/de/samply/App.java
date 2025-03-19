package de.samply;

import de.samply.dna.DnaAnalyse;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DnaAnalyse dnaAnalyse = new DnaAnalyse();
        String[] testData = new String[] {"GTCAGTCA", "AGTAGTAC", "CTCTGACA"};
        int lenghtBase = testData[0].length();
        int[][] result = dnaAnalyse.getBalance(testData);
        dnaAnalyse.DisplayBalance(result);
        long[] encodedSequence = dnaAnalyse.getSequencesAsBits(testData);
        int[][] bitResult = dnaAnalyse.getBalanceAsBits(encodedSequence, lenghtBase);
        dnaAnalyse.DisplayBalance(bitResult);
    }
}
