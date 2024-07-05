public class Publisher {
    private String name;
    private Book[] booksPublished;
    private int bookCount;

    public Publisher(int dimensionePublished) {
        booksPublished = new Book[dimensionePublished];
        bookCount = 0;
    }

    public void aggiungereLibro(Book b){
        if (booksPublished.length>bookCount){
            booksPublished[bookCount] = b;
            bookCount++;
        }else {
            System.out.println("Array pieno!");
        }
    }

    public void aggiungereLibro(Book[] b){
        for (int i = 0; i < b.length; i++) {
            if (booksPublished.length>bookCount && b!=null){
                booksPublished[bookCount] = b[i];
                bookCount++;
            }else {
                System.out.println("Array pieno!");
            }
        }

    }

    public void  visualizzaLibri(){
        for (int i = 0; i < bookCount ; i++) {
            System.out.println(booksPublished[i].toString());
        }
    }

    public Book piuEconomico(){
        int economico=0;
        for (int i = 0; i < bookCount; i++) {
            if (booksPublished[i].getPrezzo()<booksPublished[economico].getPrezzo()){
                economico = i;
            }
        }
        return booksPublished[economico];
    }
}
