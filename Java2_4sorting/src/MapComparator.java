import java.util.Comparator;
import java.util.Map;

public class MapComparator implements Comparator<String> {

    private Map<String, Integer> sortedMap;
    public MapComparator(Map<String, Integer> sortedMap) {
        this.sortedMap = sortedMap;
    }

    @Override
    public int compare(String name1, String name2) {
        if (sortedMap.get(name2) >= sortedMap.get(name1)) {
            return -1;
        } else {
            return 1;
        }
    }

}
