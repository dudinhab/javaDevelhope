/*
Scrivere una funzione che restituisca un HashSet riempito
Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
Verificare che l' elemento sia parte del Set e stampare il risultato
 */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>(hashSet());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual'elemento vuoi verificare se esiste nel Hash Set?");
        String cerca = scanner.nextLine();

        if(verificaHash(hashSet, cerca)){
            System.out.println("Questo esiste nel Hash!");
        }else {
            System.out.println("Questo non esiste nel Hash!");
        }

        scanner.close();
    }

    public static HashSet<String> hashSet() {
        HashSet<String> hashSet = new LinkedHashSet<>();
        hashSet.add("Mela");
        hashSet.add("Pera");
        hashSet.add("Anana");
        hashSet.add("Fragola");
        return hashSet;
    }

    public static Boolean verificaHash(HashSet<String> hash, String cerca){
        return hash.contains(cerca);
    }
}
