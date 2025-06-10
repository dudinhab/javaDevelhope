/*
Traccia:
Classe Book:

Attributi:
title: String
author: String
pages: int
isbn: String
Metodi:
Costruttore che inizializza tutti gli attributi.
Metodi getter per tutti gli attributi.
Classe LibraryItem (classe astratta):

Attributi:
title: String
itemID: int
Metodi:
Costruttore che inizializza title e itemID.
Metodi getter per title e itemID.
Metodo astratto checkOut(): definisce l'azione di prendere in prestito l'oggetto.
Metodo astratto checkIn(): definisce l'azione di restituire l'oggetto.
Classe BookItem (estende LibraryItem):

Attributi:
book: Book
isCheckedOut: boolean
Metodi:
Costruttore che inizializza book e isCheckedOut.
Override dei metodi astratti checkOut() e checkIn() per gestire il prestito e il ritorno del libro.

Classe Library
BookItem [] catalog;
Fare operazioni di inserimento e ricerca di un libro tramite titolo

Classe Main
Nel metodo main:
Creare oggetti Book per rappresentare libri diversi.
Creare oggetti BookItem per rappresentare copie specifiche dei libri.
Simulare operazioni di check-out e check-in utilizzando i metodi checkOut() e checkIn() degli oggetti BookItem.
Stampare lo stato di check-out dei libri.
 */
public class Main {
}
