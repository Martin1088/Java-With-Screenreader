package de.samply.benchmark;
import org.openjdk.jmh.annotations.*;
import de.samply.dna.DnaAnalyse;
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
    @Benchmark
    public void processDNA(){
        DnaAnalyse dnaAnalyse = new DnaAnalyse();
        int lenghtBase = testData[0].length();
        int[][] result = dnaAnalyse.getBalance(testData);

        //long[] encodedSequence = dnaAnalyse.getSequencesAsBits(testData);
        //int[][] bitResult = dnaAnalyse.getBalanceAsBits(encodedSequence, lenghtBase);
    }
}
