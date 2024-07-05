/*
Creare una classe Author con i seguenti attributi:

firstName: String
lastName: String
age: int
Implementare anche un costruttore e getter per ogni attributo ed un setter per l’attributo age.
Aggiungere un metodo per ottenere il nome completo dell'autore (getFullName()).
Creare una classe Publisher con i seguenti attributi:

name: String (nome dell'editore)
booksPublished: Book[] (array dei libri pubblicati dall'editore)
bookCount: int (contatore dei libri pubblicati)
Implementare un costruttore che inizializzi l'array booksPublished con una dimensione massima specificata.
Implementare un metodo per aggiungere un libro alla lista dei libri pubblicati.
Implementare un metodo per visualizzare i libri pubblicati.
Creare una classe Book con i seguenti attributi:

title: String
isbn: String (codice unico del libro)
author: Author (autore del libro)
Implementare un costruttore per inizializzare i dati del libro.
Scrivere una classe Main dove:

Si creano tre oggetti di tipo Author.
Si crea un oggetto di tipo Publisher con un array di dimensione 10 per i libri pubblicati.
Si crea un oggetto di tipo Book per ogni autore e si aggiunge alla lista dei libri pubblicati dall'editore.
Si stampa l'elenco dei libri pubblicati dall'editore.
 */

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Duda", "Barone", 25);

        Publisher publisher = new Publisher(10);
        Book[] books = new Book[4];
        books[0] = new Book("a", "a", author1, 2.5);
        books[1] = new Book("b", "b", author1, 3.4);
        books[2] = new Book("c", "c", author1, 1.2);
        books[3] = new Book("c", "c", author1, 10);

        publisher.aggiungereLibro(books);

        publisher.visualizzaLibri();

        System.out.println("Il libro piu economico: " + publisher.piuEconomico().toString());

    }
}
