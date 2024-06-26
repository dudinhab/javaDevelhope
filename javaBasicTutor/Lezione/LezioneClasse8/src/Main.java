/*
Traccia Aggiornata:
Creare una classe astratta Device con i seguenti attributi:

id: int
brand: String
price: double
type: DeviceType
Implementare anche costruttore e getter per ogni attributo ed un setter per l’attributo price.
Aggiungere un metodo astratto isEligibleForDiscount() che ritorna un boolean.
Implementare una classe Laptop che eredita da Device ed ha i seguenti attributi:

ramSize: int
Implementare anche costruttore ed un setter per l’attributo ramSize.
Il metodo isEligibleForDiscount() ritorna true se ramSize > 8 e price < 1000.
Implementare una classe Smartphone che eredita da Device ed ha i seguenti attributi:

batteryLife: int
Implementare anche costruttore ed un setter per l’attributo batteryLife.
Il metodo isEligibleForDiscount() ritorna true se batteryLife > 20 e price < 600.
Scrivere un metodo main in una classe Main in cui si effettuano le seguenti operazioni:
a) Inizializzare un array con i seguenti oggetti Laptop:
i) 1, "Dell", 950.0, 16
ii) 2, "HP", 850.0, 8
iii) 3, "Apple", 1200.0, 16
b) Inizializzare un array con i seguenti oggetti Smartphone:
i) 4, "Samsung", 500.0, 24
ii) 5, "Xiaomi", 450.0, 22
iii) 6, "Apple", 900.0, 18
c) Stampare a schermo tutti i dispositivi eleggibili per uno sconto
d) Creare un array di oggetti Device unendo i due array precedentemente creati
e) Stampare la marca e il prezzo di ogni dispositivo
f) Stampare la marca di ogni dispositivo escludendo le lettere maiuscole
 */

public class Main {
    public static void main(String[] args) {
        Laptop[] laptop = new Laptop[3];
        laptop[0] = new Laptop(1, "Dell", 950.0, DeviceType.LAPTOP,16);
        laptop[1] = new Laptop(2, "HP", 850.0,DeviceType.LAPTOP, 8);
        laptop[2] = new Laptop(3, "Apple", 1200.0,DeviceType.LAPTOP, 16);

        Smartphone[] smartphone = new Smartphone[3];
        smartphone[0] = new Smartphone(4, "Samsung", 500.0, DeviceType.SMARTPHONE, 24);
        smartphone[1] = new Smartphone(5, "Xiaomi", 450.0, DeviceType.SMARTPHONE, 22);
        smartphone[2] = new Smartphone(6, "Apple", 900.0, DeviceType.SMARTPHONE, 18);

        for (int i = 0; i < laptop.length; i++) {
            if (laptop[i].isEligibleForDiscount()){
                System.out.println(laptop[i].getBrand());
            }
        }

        for (int i = 0; i < smartphone.length ; i++) {
            if (smartphone[i].isEligibleForDiscount()){
                System.out.println(smartphone[i].getBrand());
            }
        }

        Device[] device = new Device[laptop.length+smartphone.length];
        System.arraycopy(laptop,0,device,0,laptop.length);
        System.arraycopy(smartphone,0,device,laptop.length,smartphone.length);

        for (int i = 0; i < device.length; i++) {
            System.out.println("Brand: "+device[i].getBrand()+" || Price: "+device[i].getPrice());
        }

        for (int i = 0; i < device.length; i++) {
            System.out.println(device[i].getBrand().replaceAll("[^a-z]+",""));
        }
    }
}
