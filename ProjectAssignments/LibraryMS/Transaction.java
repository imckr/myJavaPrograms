package library.transactions;

import java.util.ArrayList;
import java.util.List;

public class Transaction implements TransactionInterface {
    private List<String> transactions = new ArrayList<>();

    @Override
    public void issueBook(String memberId, String isbn) {
        transactions.add("Issued Book ISBN: " + isbn + " to Member ID: " + memberId);
    }

    @Override
    public void returnBook(String memberId, String isbn) {
        transactions.add("Returned Book ISBN: " + isbn + " from Member ID: " + memberId);
    }

    @Override
    public void displayTransactions() {
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }
}