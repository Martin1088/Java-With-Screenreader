package de.samply.benchmark;

import org.openjdk.jmh.Main;

public class BenchmarkRunner {
    public static void main(String[] args) throws Exception {
        String[] benchmarkArgs = new String[]{"-wi", "3", "-i", "5", "de.samply.benchmark.DNAProcessing"};
        Main.main(benchmarkArgs);
    }
}