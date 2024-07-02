/*
Creare una classe Car con i seguenti attributi:
model: String
vin: String (codice unico dell'auto)
Creare una classe astratta Person con i seguenti attributi:
firstName: String
lastName: String
age: int
Implementare anche un costruttore e getter per ogni attributo ed un setter per l’attributo age.
Aggiungere i seguenti metodi astratti:
getRole(): ritorna una stringa che indica il ruolo della persona (e.g., "Owner", "Mechanic").
Implementare una classe Owner che eredita da Person e ha i seguenti attributi:
ownedCars: Car[] (inizializzato con una dimensione massima di 3)
carCount: int (inizializzato a 0)
Scrivere un costruttore che inizializzi gli attributi e implementi i seguenti metodi:
addCar(Car c): aggiunge un'auto all'array ownedCars.
findCarByVIN(String vin): cerca un'auto nell'array ownedCars utilizzando il codice VIN e la ritorna se trovata.
getRole(): ritorna "Owner".
Scrivere una classe Main dove:
Si creano tre oggetti di tipo Car.
Si crea un oggetto di tipo Owner.
Si aggiungono le auto al Owner.
Si cerca un'auto per VIN e si stampa il risultato.
 */

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car("a", "a");
        cars[1] = new Car("b", "b");
        cars[2] = new Car("c", "c");

        Owner owner = new Owner("Duda", "Barone", 25);

        owner.addCar(cars);
        Car find = owner.findCarByVIN("a");
        System.out.println("Model: " + find.getModel() + " | Vin: " + find.getVin());

    }
}
