public class Book {
    private String title, isbn;
    private Author author;
    private double prezzo;

    @Override
    public String toString() {
        return "Book{ title: " + title + " | isbn: " + isbn + " | author: " + author.getFullName() + " | prezzo: " + prezzo + "}";
    }

    public Book(String title, String isbn, Author author, double prezzo) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.prezzo = prezzo;
    }

    public double getPrezzo() {
        return prezzo;
    }

}
