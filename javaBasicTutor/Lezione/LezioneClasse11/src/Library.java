public class Library {
    protected Book[] books;

    public Library() {
        books = new Book[5];
    }

    public void addBook(Book book) {
        boolean pieno = false;
        int position = 0;
        for (int i = 0; i <= books.length - 1; i++) {
            if (books[i] == null) {
                position = i;
                break;
            } else if (i == books.length - 1) {
                pieno = true;
            }
        }
        if (pieno) {
            System.out.println("Array pieno!");
        } else {
            System.out.println("libroggiunto");
            books[position] = book;
        }
    }

    public String getBook(int index) {
        if (books.length <= index) {
            System.out.println("Questo libro non esiste!");
            return null;
        } else {
            return "Il libro scelto è: "+books[index].title+ " con "+books[index].pages+" pagine del author: "+books[index].author+" del genere: "+books[index].genre;
        }
    }

    public int countBooksByGenre(Genre g) {
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getGenre() == g) {
                count++;
            }
        }
        return count;
    }
}
