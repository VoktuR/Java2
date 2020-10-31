import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // 1
        /*
        ListOfWords myListOfWords = new ListOfWords();
        myListOfWords.countWords();

        System.out.println();
        System.out.println("--------------------------");
        System.out.println();
         */


        // 2
        PhoneBook myPhoneBook = new PhoneBook();
        Set<String> phoneNumbers = new HashSet<>();
        myPhoneBook.initializePhoneBook();
        myPhoneBook.showContacts();
        myPhoneBook.addContact("Рутковский","12345678900");
        myPhoneBook.showContacts();
        phoneNumbers = myPhoneBook.getContact("Рутковский");
        System.out.println("Рутковский");
        System.out.println("Номера соответствующие фамилии: " + phoneNumbers);
        phoneNumbers.clear();
        phoneNumbers = myPhoneBook.getContact("Букреева");
        System.out.println("Букреева");
        System.out.println("Номера соответствующие фамилии: " + phoneNumbers);
        phoneNumbers.clear();
    }


}
