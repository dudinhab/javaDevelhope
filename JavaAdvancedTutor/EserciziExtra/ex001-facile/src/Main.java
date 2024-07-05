/*
Titolo: Gestione di un Sistema di Inventario
Obiettivo:
Implementare un sistema di gestione dell'inventario per un negozio utilizzando Java. Il sistema dovrà gestire diverse categorie di articoli, permettendo l'aggiunta, la rimozione e la visualizzazione degli articoli. Si utilizzeranno concetti avanzati come HashSet, gestione dei valori null, classi astratte e interfacce.
Requisiti:
1	Interfaccia Item:
    Definire un'interfaccia Item con i seguenti metodi:
    String getName(): restituisce il nome dell'articolo.
    double getPrice(): restituisce il prezzo dell'articolo.
    boolean isAvailable(): restituisce la disponibilità dell'articolo.
2	Classe Astratta AbstractItem:
    Creare una classe astratta AbstractItem che implementa l'interfaccia Item.
    La classe deve avere i seguenti attributi:
    String name
    double price
    boolean available
    Implementare i metodi dell'interfaccia Item.
    Definire un costruttore per inizializzare gli attributi.
    Aggiungere un metodo astratto void displayDetails().
3	Classi Concrete:
    Creare due classi concrete che estendono AbstractItem:
    Book
    Aggiungere un attributo String author.
    Implementare il metodo displayDetails() per visualizzare i dettagli del libro.
    Electronic
    Aggiungere un attributo String brand.
    Implementare il metodo displayDetails() per visualizzare i dettagli dell'articolo elettronico.
4	Classe InventoryManager:
    Creare una classe InventoryManager per gestire l'inventario.
    Utilizzare un HashSet<Item> per memorizzare gli articoli.
    Implementare i seguenti metodi:
    void addItem(Item item): aggiunge un articolo all'inventario se non è null.
    void removeItem(Item item): rimuove un articolo dall'inventario se non è null.
    void displayInventory(): visualizza i dettagli di tutti gli articoli nell'inventario, gestendo i valori null.
5	Classe Main:
    Creare una classe Main con il metodo main.
    Nel metodo main:
    Creare un'istanza di InventoryManager.
    Aggiungere alcuni articoli di tipo Book e Electronic all'inventario.
    Tentare di aggiungere un articolo null.
    Visualizzare il contenuto dell'inventario.
Vincoli:
    Gli articoli devono essere aggiunti all'inventario solo se non sono null.
    La visualizzazione dell'inventario deve gestire correttamente i valori null.
Output Atteso:
Il programma dovrebbe stampare i dettagli di tutti gli articoli nell'inventario, ignorando o gestendo i valori null secondo le specifiche.
*/
public class Main {
    public static void main(String[] args) {
        InventoryManager inventoryManager = new InventoryManager();
        Book book = new Book("Duda", 5, true, "Duda");
        Electronic electronic = new Electronic("Duda", 3, true, "Marca");

        inventoryManager.addItem(book);
        inventoryManager.addItem(electronic);
        inventoryManager.addItem(null);

        inventoryManager.stampaInventory();

    }
}
