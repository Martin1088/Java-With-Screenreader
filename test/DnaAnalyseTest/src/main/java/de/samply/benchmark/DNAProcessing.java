package de.samply.benchmark;

import org.openjdk.jmh.annotations.*;
import de.samply.dna.DnaAnalyse;
import de.samply.dna.DnaAnalyseBits;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@State(Scope.Thread)
public class DNAProcessing {
    private static final String[] testData = {
            "GTCAGTCAAGCTAGTC", "AGTAGTACGCTAGCTA", "CTCTGACAGTCAAGTC",
            "TGCATGCACTGATGCA", "ATGCATGCAGTCATGC", "GATCTGACATGCAGTC",
            "ACGTACGTGATCGTAC", "GTAGCTAGTGACTGCA", "CTAGCTAGGACTAGCT",
            "AGCTAGCTGACTAGGC", "CGATCGATGATCTAGT", "TGCAATGCAGCTAGTC",
            "GCTAGTCAAGCTAGTC", "ATCGATCGACTAGCTA", "TGCAGCTAGTGCATAG",
            "AGCTGACTGACTAGTG", "CTGACTGAGTCTAGAC", "GACTGACTAGTCAGTG",
            "TGCATCGTACGTAGCA", "ATGCTGACTGATAGCT"
    };
    private DnaAnalyse dnaAnalyse;

    @Setup(Level.Trial)
    public void setup() {
        dnaAnalyse = new DnaAnalyse();
    }

    @Benchmark
    public void processDNA() {
        //int lenghtBase = testData[0].length();
        int[][] result = dnaAnalyse.getBalance(testData);

        //long[] encodedSequence = dnaAnalyse.getSequencesAsBits(testData);
        //int[][] bitResult = dnaAnalyse.getBalanceAsBits(bitData, lenghtBase);
    }
}
