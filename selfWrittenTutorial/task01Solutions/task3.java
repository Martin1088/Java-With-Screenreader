import java.util.HashMap;

public class Cities {
    public static void main(String [] args){
        HashMap<String,Integer> cities = new HashMap<String,Integer>();
        cities.put("Frankfurt",60306);
        cities.put("Beerfelden",64760);
        cities.put("Heidelberg",69115);
        cities.put("Rai-Breitenbach",64747);
        
        for(String i : cities.keySet()){
            System.out.println("Stadt: "+ i);
            System.out.println("PLZ: "+ cities.get(i));
            System.out.println("");
        }
    }
}