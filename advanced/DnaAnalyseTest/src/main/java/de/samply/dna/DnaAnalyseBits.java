package de.samply.dna;

public class DnaAnalyseBits {
    private static int encodeBase(char chBase) {
        return switch (chBase) {
            case 'A' -> 0b00;
            case 'C' -> 0b01;
            case 'G' -> 0b10;
            case 'T' -> 0b11;
            default -> throw new IllegalStateException("Unexpected value: " + chBase);
        };
    }

    private static int decodeBase(int bits) {
        return switch (bits) {
            case 0b00 -> 'A';
            case 0b01 -> 'C';
            case 0b10 -> 'G';
            case 0b11 -> 'T';
            default -> throw new IllegalStateException("Unexpected value: " + bits);
        };
    }

    private static long encodeDNA(String dna) {
        long encoded = 0;
        for (char c : dna.toCharArray()) {
            encoded = (encoded << 2) | encodeBase(c);
        }
        return encoded;
    }

    private static long decodeDNA(long encoded, int position, int length) {
        int shift = 2 * (position - length - 1);
        return decodeBase((int) encoded >> shift) & 0b11;
    }

    // Red = A and C
    private static boolean isRedCheck(int bits) {
        return bits == 0b00 || bits == 0b01;
    }

    // Green = A and T
    private static boolean isGreenCheck(int bits) {
        return bits == 0b00 || bits == 0b11;
    }

    public static long[] getSequencesAsBits(String[] sequences) {
        long[] encodedSequences = new long[sequences.length];
        for (int i = 0; i < sequences.length; i++) {
            encodedSequences[i] = encodeDNA(sequences[i]);
        }
        return encodedSequences;
    }

    public static int[][] getBalanceAsBits(long[] sequencesBits, int lengthBase) {
        int[][] result = new int[lengthBase][2];
        for (int i = 0; i < lengthBase; i++) {
            int redCounter = 0;
            int greenCounter = 0;
            for (long sequenceBit : sequencesBits) {
                int bits = (int) ((sequenceBit >> (2 * (lengthBase -i -1)))) & 0b11;
                if (isRedCheck(bits)) {redCounter++;}
                if (isGreenCheck(bits)) {greenCounter++;}
            }
            result[i][0] = redCounter;
            result[i][1] = greenCounter;
        }
        return result;
    }



}
