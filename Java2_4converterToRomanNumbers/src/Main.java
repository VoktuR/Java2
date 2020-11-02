import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        RomanNumbers romanNumbers = new RomanNumbers();
        romanNumbers.createTable();
        System.out.println(romanNumbers.getTable());

        String answer;
        answer = romanNumbers.convertNumber(1113, (TreeMap<Integer, String>) romanNumbers.getTable());
        System.out.println(answer);

    }
}
