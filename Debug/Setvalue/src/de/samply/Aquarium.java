package de.samply;

import java.util.ArrayList;
import java.util.Arrays;

public class Aquarium {
    private ArrayList<Fish> fish;
    public static void main(String [] args) {
        var aquarium = new Aquarium();
        System.out.println(aquarium.getFish());
        // init
        System.out.println(aquarium.getFish());
    }
    private ArrayList<Fish> getFish() {
    if (fish == null) {
        initFish();
    }
        return fish;
    }

    private void initFish() {
    fish = new ArrayList<>(Arrays.asList(
            new Fish("Bubbles"),
            new Fish("Calypso"),
            new Fish("Dory")
    ));
    }
}
class Fish {
    private String name;

    public Fish(String name) {
        this.name = name;
    }
    public String toString() {
    return name;
    }
}
