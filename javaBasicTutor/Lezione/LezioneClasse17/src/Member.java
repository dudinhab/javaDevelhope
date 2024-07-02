public class Member extends Person {
    private Book[] booksborrowedBooks;
    private int bookCount;

    public Member(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        booksborrowedBooks = new Book[5];
        bookCount = 0;
    }

    public void addBook(Book b) {
        if (booksborrowedBooks.length >= bookCount) {
            booksborrowedBooks[bookCount] = b;
            bookCount++;
        } else {
            System.out.println("Array pieno!");
        }
    }
    public void addBook(Book[] b) {
        for (int i = 0; i < b.length; i++) {
            if (booksborrowedBooks.length >= bookCount) {
                booksborrowedBooks[bookCount] = b[i];
                bookCount++;
            } else {
                System.out.println("Array pieno!");
            }
        }
    }

    public Book findBookByISBN(String isbn) {
        try{
            for (int i = 0; i <booksborrowedBooks.length; i++) {
                if (isbn.equals(booksborrowedBooks[i].getIsbn())) {
                    return booksborrowedBooks[i];
                }
            }
        }catch (NullPointerException e){
            System.out.println("Nessuno libro trovato!");
        }
        return null;
    }

    @Override
    public String getRole() {
        return "Member";
    }
}
