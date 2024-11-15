package library.books;

import java.util.ArrayList;
import java.util.List;

public class Book implements BookInterface {
    private List<String> books = new ArrayList<>();

    @Override
    public void addBook(String title, String author, String isbn) {
        books.add("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }

    @Override
    public void removeBook(String isbn) {
        books.removeIf(book -> book.contains("ISBN: " + isbn));
    }

    @Override
    public void displayBooks() {
        for (String book : books) {
            System.out.println(book);
        }
    }
}