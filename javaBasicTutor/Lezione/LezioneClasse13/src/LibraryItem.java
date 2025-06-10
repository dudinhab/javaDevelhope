public abstract class LibraryItem {
    String title;
    int itemID;

    public LibraryItem(String title, int itemID) {
        this.title = title;
        this.itemID = itemID;
    }
    public String getTitle(){
        return title;
    }
    public int getItemID(){
        return itemID;
    }
    public abstract void checkOut();
    public abstract void checkIn();
}
