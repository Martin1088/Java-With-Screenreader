import java.util.ArrayList;
public class CityList {
    public static void main(String[] args) {
        
        ArrayList<String> cities = new ArrayList<String>();
        
        cities.add("Frankfurt");
        cities.add("Beerfelden");
        cities.add("Heidelberg");
        cities.add("Rai-Breitenbach");
        
        for (int i = 0; i < cities.size(); i++){
        
        System.out.println(cities.get(i));
        }
    }
}