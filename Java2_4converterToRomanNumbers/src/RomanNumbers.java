import java.util.*;

public class RomanNumbers {

    private Map<Integer, String> conversionTable = new TreeMap<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });

    public void createTable() {
        addValue(1,"I");
        addValue(4,"IV");
        addValue(5, "V");
        addValue(9,"IX");
        addValue(10, "X");
        addValue(40,"XL");
        addValue(50, "L");
        addValue(90,"XC");
        addValue(100,"C");
        addValue(400,"CD");
        addValue(500,"D");
        addValue(900,"CM");
        addValue(1000,"M");
    }

    public void addValue(Integer number, String romanNumber) {
        conversionTable.put(number, romanNumber);
    }

    public Map<Integer, String> getTable() {
        return conversionTable;
    }

    public String convertNumber(Integer num, TreeMap<Integer, String> conversionTable) {
        if (num <= 0) return null;
        String romanNumber = "";
        for (Map.Entry entry : conversionTable.entrySet()) {
            while (num >= (Integer) entry.getKey()) {
                num -= (Integer) entry.getKey();
                romanNumber = romanNumber.concat((String) entry.getValue());
            }
        }
        return romanNumber;
    }
    

    @Override
    public String toString() {
        return "SortMap{" +
                "sortMap=" + conversionTable +
                '}';
    }

}
