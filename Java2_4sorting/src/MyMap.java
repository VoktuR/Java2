import java.util.HashMap;
import java.util.Map;

public class MyMap {

    private Map<String, Integer> Map = new HashMap<>();

    public void createMap() {
        addContact("Рутковский", 1);
        addContact( "Букреева", 2);
        addContact("Петренко", 3);
        addContact( "Сокольский", 4);
    }

    public void addContact(String name, Integer number) {
        Map.put(name, number);
    }

    public Map<String, Integer> getMap() {
        return Map;
    }

    @Override
    public String toString() {
        return "SortMap{" +
                "sortMap=" + Map +
                '}';
    }

}
