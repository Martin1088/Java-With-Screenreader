package de.samply.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Filewriter {
    public static List<ArrayList<Integer>> Randomizer() {
        List<ArrayList<Integer>> numbers = null;
        try {
            // erzeuge eine Zufallszahlen Liste
            numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                ArrayList<Integer> temp =new ArrayList<>();
                for (int f = 0; f < 10; f++) {
                    temp.add((int) (Math.random() * 10001));
                }
                numbers.add(temp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return numbers;
    }
    // Funktion Random words

    public static void main(String [] args) {
        try {
            FileWriter my_writer = new FileWriter("test.txt");
            for (ArrayList<Integer> l : Randomizer()) {
                System.out.println(l);
                for (Integer s : l) {
                    my_writer.write(s.toString());
                }
                System.out.println();
            }
            my_writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

