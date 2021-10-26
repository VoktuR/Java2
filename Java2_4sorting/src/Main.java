import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        MyMap Map = new MyMap();
        Map.createMap();
        Map<String, Integer> myMap = new HashMap<>(Map.getMap());

        System.out.println(myMap);

        MapComparator comp = new MapComparator(myMap);
        Map<String, Integer> sortedMap = new TreeMap<>(comp);
        sortedMap.putAll(myMap);

        System.out.println(sortedMap);


    }
}
