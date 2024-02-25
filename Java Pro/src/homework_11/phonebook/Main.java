package homework_11.phonebook;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(new Record("John Doe", "123-456-7890"));
        phoneBook.add(new Record("Jane Doe", "098-765-4321"));
        phoneBook.add(new Record("John Smith", "555-555-5555"));
        phoneBook.add(new Record("John Doe", "111-222-3333"));

        System.out.println(phoneBook.find("John Doe"));
        System.out.println(phoneBook.findAll("John Doe"));
        System.out.println(phoneBook.find("Jane Smith"));
    }
}
