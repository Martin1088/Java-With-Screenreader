import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String [] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Heidelberg");
        cities.add("Mannheim");
        cities.add("Stuttgart");
        cities.add("Ulm");
        cities.add("Basel");
        cities.add("Rom");
        cities.add("Madrid");
        for (int i = 0; i<cities.size(); i++) {
            System.out.println(cities.get(i));
        }
        System.out.println("===Next===");
        // Beispiel Hashset
        HashSet<String> towns = new HashSet<>();
        for (int i = 0; i < cities.size(); i++) {
            towns.add(cities.get(i));
        }
        Iterator<String> it = towns.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //
        List<Integer> population = new ArrayList<>();




    }
}
