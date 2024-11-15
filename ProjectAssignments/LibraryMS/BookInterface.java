package library.books;

public interface BookInterface {
    void addBook(String title, String author, String isbn);

    void removeBook(String isbn);

    void displayBooks();
}