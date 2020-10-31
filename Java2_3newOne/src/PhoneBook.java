import java.util.*;

public class PhoneBook {

    private Map<String, Set<String>> contacts = new HashMap<>();

    public void initializePhoneBook() {
        addContact("Рутковский", "9104395592");
        addContact("Рутковский", "0679481774");
        addContact("Букреева","9453109133");
        addContact("Петренко", "0931114098");
        addContact("Сокольский", "3105520023");
        addContact("Букреева", "8883124467");
    }

    public void addContact(String name, String number) {
        if (contacts.containsKey(name)) { contacts.get(name).add(number); }
        else {
            Set<String> numbers = new HashSet<>();
            numbers.add(number);
            contacts.put(name, numbers);
        }
    }

    public void showContacts() {
        System.out.println(contacts);
    }

    public Set<String> getContact(String name) {
        if (contacts.containsKey(name)) { return contacts.get(name); }
        else return new HashSet<>();
    }

}
