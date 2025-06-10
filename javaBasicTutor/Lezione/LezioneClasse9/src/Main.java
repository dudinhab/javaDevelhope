/*
Traccia:
Creare una classe astratta Vehicle con i seguenti attributi:

id: int
brand: String
price: double
condition: Condition (enum)
Implementare anche costruttore e getter per ogni attributo ed un setter per l’attributo price.
Aggiungere un metodo astratto isEligibleForDiscount() che ritorna un boolean.
Creare un enum Condition con i seguenti valori:

NEW
USED
REFURBISHED
Implementare una classe Car che eredita da Vehicle ed ha i seguenti attributi:

mileage: int
Implementare anche costruttore ed un setter per l’attributo mileage.
Il metodo isEligibleForDiscount() ritorna true se condition è USED e price < 20000.

Scrivere un metodo main in una classe Main in cui si effettuano le seguenti operazioni:
a) Inizializzare un array con i seguenti oggetti Car:
i) 1, "Toyota", 15000.0, Condition.USED, 50000
ii) 2, "BMW", 30000.0, Condition.NEW, 10000
iii) 3, "Fiat", 18000.0, Condition.USED, 30000
c) Stampare a schermo tutti i veicoli eleggibili per uno sconto
d) Creare un array di oggetti Vehicle unendo i due array precedentemente creati
e) Stampare la marca e il prezzo di ogni veicolo
f) Stampare la marca di ogni veicolo escludendo le lettere maiuscole
g) Stampare la marca di ogni veicolo e il prezzo sostituendo il carattere “.” con “,” e le cifre con ‘?’
 */
public class Main {
}
