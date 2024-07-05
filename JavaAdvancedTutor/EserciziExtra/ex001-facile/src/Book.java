import java.sql.SQLOutput;

public class Book extends AbstractItem {
    private String author;

    public Book(String name, double price, boolean available, String author) {
        super(name, price, available);
        this.author = author;
    }

    @Override
    public String displayDetails() {
        return "Nome: " + name + " | Prezzo: " + price + " | Avaliazion: " + available + " | Autor: " + author;
    }
}
