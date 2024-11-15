import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class LibraryMS {
    public static void main(String[] args) {
        Book bookManager = new Book();
        Member memberManager = new Member();
        Transaction transactionManager = new Transaction();

        // Add books
        bookManager.addBook("The Great Gatsby", "F. Scott Fitzgerald", "1234567890");
        bookManager.addBook("1984", "George Orwell", "0987654321");

        // Add members
        memberManager.addMember("John Doe", "M001");
        memberManager.addMember("Jane Smith", "M002");

        // Issue and return books
        transactionManager.issueBook("M001", "1234567890");
        transactionManager.returnBook("M001", "1234567890");

        // Display all records
        System.out.println("Books:");
        bookManager.displayBooks();

        System.out.println("\nMembers:");
        memberManager.displayMembers();

        System.out.println("\nTransactions:");
        transactionManager.displayTransactions();
    }
}