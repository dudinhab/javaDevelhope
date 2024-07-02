/*
Traccia:
Creare una classe Book con i seguenti attributi:
title: String
isbn: String (codice unico del libro)
Creare una classe astratta Person con i seguenti attributi:
firstName: String
lastName: String
age: int
Implementare anche un costruttore e getter per ogni attributo ed un setter per l’attributo age.
Aggiungere i seguenti metodi astratti:
getRole(): ritorna una stringa che indica il ruolo della persona (e.g., "Librarian", "Member").
Implementare una classe Member che eredita da Person e ha i seguenti attributi:
borrowedBooks: Book[] (inizializzato con una dimensione massima di 3)
bookCount: int (inizializzato a 0)
Scrivere un costruttore che inizializzi gli attributi e implementi i seguenti metodi:
addBook(Book b): aggiunge un libro all'array borrowedBooks.
findBookByISBN(String isbn): cerca un libro nell'array borrowedBooks utilizzando il codice ISBN e lo ritorna se trovato.
getRole(): ritorna "Member".
Scrivere una classe Main dove:
Si creano tre oggetti di tipo Book.
Si crea un oggetto di tipo Member.
Si aggiungono i libri al Member.
Si cerca un libro per ISBN e si stampa il risultato.
 */
public class Main {
    public static void main(String[] args) {

            Book[] books = new Book[3];
            books[0] = new Book("a","a");
            books[1] = new Book("b","b");
            books[2] = new Book("c","c");

            Member member = new Member("Duda","Barone",25);
            member.addBook(books);

            Book find = member.findBookByISBN("g");
            if (find!=null){
                System.out.println("Title: "+find.getTitle()+" | ISBN: "+find.getIsbn());
            }


    }
}
