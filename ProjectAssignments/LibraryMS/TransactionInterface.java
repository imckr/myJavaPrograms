package library.transactions;

public interface TransactionInterface {
    void issueBook(String memberId, String isbn);
    void returnBook(String memberId, String isbn);
    void displayTransactions();
}