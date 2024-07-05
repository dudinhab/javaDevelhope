/*
Titolo: Sistema di Gestione di un Parco Veicoli
Obiettivo:
Implementare un sistema di gestione di un parco veicoli utilizzando Java. Il sistema dovrà gestire diverse categorie di veicoli, permettendo l'aggiunta, la rimozione, la visualizzazione e la ricerca di veicoli. Si utilizzeranno concetti avanzati come HashSet, gestione dei valori null, classi astratte, interfacce e gestione delle eccezioni.
Requisiti:
1	Interfaccia Vehicle:
◦	Definire un'interfaccia Vehicle con i seguenti metodi:
▪	String getModel(): restituisce il modello del veicolo.
▪	double getPrice(): restituisce il prezzo del veicolo.
▪	boolean isAvailable(): restituisce la disponibilità del veicolo.
▪	default String getType(): restituisce una stringa che rappresenta il tipo di veicolo.
2	Classe Astratta AbstractVehicle:
◦	Creare una classe astratta AbstractVehicle che implementa l'interfaccia Vehicle.
◦	La classe deve avere i seguenti attributi:
▪	String model
▪	double price
▪	boolean available
◦	Implementare i metodi dell'interfaccia Vehicle.
◦	Definire un costruttore per inizializzare gli attributi.
◦	Aggiungere un metodo astratto void displayDetails().
3	Classi Concrete:
◦	Creare due classi concrete che estendono AbstractVehicle:
▪	Car
▪	Aggiungere un attributo String brand.
▪	Implementare il metodo displayDetails() per visualizzare i dettagli della macchina.
▪	Sovrascrivere il metodo getType() per restituire "Car".
▪	Motorcycle
▪	Aggiungere un attributo String engineType.
▪	Implementare il metodo displayDetails() per visualizzare i dettagli della motocicletta.
▪	Sovrascrivere il metodo getType() per restituire "Motorcycle".
4	Eccezione Personalizzata:
◦	Creare un'eccezione personalizzata VehicleNotFoundException che estende Exception.
5	Classe VehicleManager:
◦	Creare una classe VehicleManager per gestire il parco veicoli.
◦	Utilizzare un HashSet<Vehicle> per memorizzare i veicoli.
◦	Implementare i seguenti metodi:
▪	void addVehicle(Vehicle vehicle): aggiunge un veicolo al parco se non è null.
▪	void removeVehicle(Vehicle vehicle): rimuove un veicolo dal parco se non è null.
▪	void displayVehicles(): visualizza i dettagli di tutti i veicoli nel parco, gestendo i valori null.
▪	Vehicle findVehicleByModel(String model) throws VehicleNotFoundException: cerca un veicolo per modello e lancia un'eccezione se non viene trovato.
6	Classe Main:
◦	Creare una classe Main con il metodo main.
◦	Nel metodo main:
▪	Creare un'istanza di VehicleManager.
▪	Aggiungere alcuni veicoli di tipo Car e Motorcycle al parco.
▪	Tentare di aggiungere un veicolo null.
▪	Visualizzare il contenuto del parco.
▪	Eseguire una ricerca per modello, gestendo l'eccezione VehicleNotFoundException.
Vincoli:
•	I veicoli devono essere aggiunti al parco solo se non sono null.
•	La visualizzazione del parco deve gestire correttamente i valori null.
•	La ricerca di un veicolo per modello deve gestire l'eccezione VehicleNotFoundException.
Output Atteso:
Il programma dovrebbe stampare i dettagli di tutti i veicoli nel parco, ignorando o gestendo i valori null secondo le specifiche. Inoltre, dovrebbe gestire correttamente l'eccezione VehicleNotFoundException durante la ricerca.
 */

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        VehicleManager vehicleManager = new VehicleManager();
        HashSet<AbstractVehicle> cars = new HashSet<>();
        HashSet<AbstractVehicle> motorcycles = new HashSet<>();

        cars.add(new Car("Modelo", 2.44, true, "Marca"));
        cars.add(new Car("Modelo2", 2.64, true, "Marca1"));
        cars.add(new Car("Modelo3", 2.14, true, "Marca2"));

        motorcycles.add(new Motorcycle("Modelo1", 2.14, true, "Motor1"));
        motorcycles.add(new Motorcycle("Modelo2", 2.14, true, "Motor2"));
        motorcycles.add(new Motorcycle("Modelo3", 2.14, true, "Motor3"));


        vehicleManager.addVehicle(cars);
        vehicleManager.addVehicle(motorcycles);

        vehicleManager.displayVehicles();

        System.out.println("Modelo 2:");
        vehicleManager.findVehicleByModel("Modelo2");
    }
}
