import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ContactMS {
    private TreeMap<String, String> contacts;

    public ContactMS() {
        contacts = new TreeMap<>();
    }

    public void addContact(String name, String number) {
        contacts.put(name, number);
        System.out.println("Contact added: " + name + " -> " + number);
    }

    public void deleteContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            System.out.println("Contact deleted: " + name);
        } else {
            System.out.println("Contact not found: " + name);
        }
    }

    public void searchByName(String name) {
        if (contacts.containsKey(name)) {
            System.out.println("Found contact: " + name + " -> " + contacts.get(name));
        } else {
            System.out.println("Contact not found: " + name);
        }
    }

    public void searchByNumber(String number) {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            if (entry.getValue().equals(number)) {
                System.out.println("Found contact: " + entry.getKey() + " -> " + number);
                return;
            }
        }
        System.out.println("Contact not found with number: " + number);
    }

    public static void main(String[] args) {
        ContactMS cms = new ContactMS();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Contact");
            System.out.println("2. Delete Contact");
            System.out.println("3. Search by Name");
            System.out.println("4. Search by Number");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter number: ");
                    String number = scanner.nextLine();
                    cms.addContact(name, number);
                    break;
                case 2:
                    System.out.print("Enter name to delete: ");
                    name = scanner.nextLine();
                    cms.deleteContact(name);
                    break;
                case 3:
                    System.out.print("Enter name to search: ");
                    name = scanner.nextLine();
                    cms.searchByName(name);
                    break;
                case 4:
                    System.out.print("Enter number to search: ");
                    number = scanner.nextLine();
                    cms.searchByNumber(number);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}