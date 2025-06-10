public class Book {
    private String title;
    private String author;
    private int pages;
    private String isbn;

    public Book(String title, String author, int pages, String isbn) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }
}
