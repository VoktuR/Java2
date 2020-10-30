import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private Map<String, String> contacts = new HashMap<>();

    public void initializePhoneBook() {
        addContact("9104395592", "Рутковский");
        addContact( "0679481774", "Рутковский");
        addContact( "9453109133", "Букреева");
        addContact("0931114098", "Петренко");
        addContact( "3105520023", "Сокольский");
        addContact("8883124467", "Букреева");
    }

    public void addContact(String number, String name) {
        contacts.put(number, name);
    }

    public void showContacts() {
        System.out.println(contacts);
    }

    public List getContact(String name) {
        List<String> phoneNumbers = new ArrayList<>();
        System.out.println(name);
        for (Map.Entry entry : contacts.entrySet()) {
            if (name.equals(entry.getValue())) {
                phoneNumbers.add((String) entry.getKey());
            }
        }
        return phoneNumbers;
    }

}
