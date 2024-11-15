interface Printable {
    void print();
}

class Document implements Printable {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("Printing Document Content: " + content);
    }

    public static void main(String[] args) {
        Document doc = new Document("This is a sample document.");
        doc.print();
    }
}