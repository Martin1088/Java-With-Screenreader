package de.samply.dna;

import org.junit.Test;

import static org.junit.Assert.*;

public class DnaAnalyseTest {
    @Test
    public void testGetBalance() {
        String[] testData = new String[]{"GTCAGTCA", "AGTAGTAC", "CTCTGACA"};
        int[][] expected = {
                {2, 1},
                {0, 2},
                {2, 1},
                {2, 3},
                {0, 0},
                {1, 3},
                {3, 1},
                {3, 2}
        };
        assertArrayEquals(expected, DnaAnalyse.getBalance(testData));
    }


    @Test
    public void testGetBalance_EmptyArray() {
        String[] sequences = {};
        assertNull(DnaAnalyse.getBalance(sequences));
    }

    @Test
    public void testGetBalance_NullArray() {
        assertNull(DnaAnalyse.getBalance(null));
    }
}
