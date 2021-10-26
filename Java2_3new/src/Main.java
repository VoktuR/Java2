import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // 1
        ListOfWords myListOfWords = new ListOfWords();
        myListOfWords.countWords();

        System.out.println();
        System.out.println("--------------------------");
        System.out.println();

        // 2
        PhoneBook myPhoneBook = new PhoneBook();
        List<String> phoneNumbers = new ArrayList<>();
        myPhoneBook.initializePhoneBook();
        myPhoneBook.showContacts();
        myPhoneBook.addContact("12345678900","Рутковский");
        myPhoneBook.showContacts();
        phoneNumbers = myPhoneBook.getContact("Рутковский");
        System.out.println("Номера соответствующие фамилии: " + phoneNumbers);
        phoneNumbers.clear();
        phoneNumbers = myPhoneBook.getContact("Букреева");
        System.out.println("Номера соответствующие фамилии: " + phoneNumbers);
        phoneNumbers.clear();
    }


}
