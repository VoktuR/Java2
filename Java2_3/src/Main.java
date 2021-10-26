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
        myPhoneBook.initializePhoneBook();
        myPhoneBook.showContacts();
        myPhoneBook.addContact("12345678900","Рутковский");
        myPhoneBook.getContact("Рутковский");
    }
}
