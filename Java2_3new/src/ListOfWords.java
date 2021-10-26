import java.lang.reflect.Array;
import java.util.*;

public class ListOfWords {

    private String[] words = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота","Воскресенье",
                                "Среда", "Вторник", "Среда", "Пятница", "Воскресенье", "Среда", "Пятница", "Понедельник"};

    public Set<String> createUniqueArray() {
        Set<String> uniqueWords = new HashSet<String>(Arrays.asList(words));
        return uniqueWords;
    }

    public void countWords() {
        Set<String> uniqueWords = createUniqueArray();
        List<String> tempWords = new ArrayList<>(Arrays.asList(words));
        int counter = 0;

        for (String uniqueWord : uniqueWords) {
            for (int i = 0; i < tempWords.size(); i++) {
                if (uniqueWord.equals(tempWords.get(i))) {
                    counter++;
                }
            }
            System.out.println(uniqueWord + ":  " + counter);
            counter = 0;
        }
    }

}
