/*
Traccia:
Creare una classe Book con i seguenti attributi:

title: String
author: String
pages: int (positivo)
genre: Genre (enum con valori FICTION, NONFICTION, MYSTERY, SCIFI, FANTASY)
Creare una classe Library con i seguenti attributi:

books: Book[] (inizializzato con una dimensione massima di 5)
Scrivere il costruttore che inizializza l'array books come vuoto. Vogliamo inoltre i seguenti metodi:

addBook(Book b): aggiunge un libro all'array books.
getBook(int index): ritorna il libro all'indice specificato dell'array books.
countBooksByGenre(Genre g): ritorna il numero di libri di un determinato genere.
Scrivere una classe Main dove:

Si creano quattro oggetti di tipo Book.
Si crea un oggetto di tipo Library.
Si aggiungono i quattro libri alla Library.
Si stampa il numero di libri per ogni genere presente nella biblioteca.
 */


public class Main {
    public static void main(String[] args) {

        Book[] book = new Book[5];
        book[0] = new Book("Teste", "Duda", 23, Genre.FICTION);
        book[1] = new Book("Duda2", "Duda", 23, Genre.NONFICTION);
        book[2] = new Book("Duda", "Duda", 23, Genre.MYSTERY);
        book[3] = new Book("Duda", "Duda", 23, Genre.MYSTERY);
        book[4] = new Book("Duda", "Duda", 23, Genre.MYSTERY);

        Library library = new Library();

        library.addBook(book[0]);
        library.addBook(book[1]);
        library.addBook(book[2]);
        library.addBook(book[3]);
        library.addBook(book[3]);

        System.out.println(library.getBook(3));

        System.out.println("Fiction:");
        System.out.println(library.countBooksByGenre(Genre.FICTION));
        System.out.println("Non Fiction:");
        System.out.println(library.countBooksByGenre(Genre.NONFICTION));
        System.out.println("Mistery:");
        System.out.println(library.countBooksByGenre(Genre.MYSTERY));
        System.out.println("Scifi:");
        System.out.println(library.countBooksByGenre(Genre.SCIFI));
        System.out.println("Fantasy:");
        System.out.println(library.countBooksByGenre(Genre.FANTASY));
    }
}
