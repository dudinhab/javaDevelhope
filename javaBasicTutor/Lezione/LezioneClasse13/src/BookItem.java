public class BookItem extends LibraryItem {

    private Book book;
    private boolean isCheckedOut;

    public BookItem(String title, int itemID, Book book, boolean isCheckedOut) {
        super(title, itemID);
        this.book = book;
        this.isCheckedOut = isCheckedOut;
    }

    @Override
    public void checkOut() {

    }

    @Override
    public void checkIn() {

    }
}
