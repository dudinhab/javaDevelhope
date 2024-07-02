import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

/*
Scrivere una funzione che restituisca un hashset riempito
Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
Svuotare l'hashset, verificarlo e stampare il risultato
 */
public class Main {
    public static void main(String[] args) {
        HashSet<String> hashFruit = hashSet();
        Scanner scanner = new Scanner(System.in);
        stamparHash(hashFruit);

        System.out.println("Inserisci una frutta che desidera eliminare: ");
        String frutta = scanner.nextLine();
        hashFruit.remove(frutta.toUpperCase());
        System.out.println("");
        System.out.println("Hash con valore eliminato:");
        stamparHash(hashFruit);

        hashFruit.clear();
        System.out.println("");
        System.out.println("Hash svuoto:");
        stamparHash(hashFruit);

    }

    public static HashSet<String> hashSet() {
        HashSet<String> hash = new LinkedHashSet<>();
        hash.add("MELA");
        hash.add("PERA");
        hash.add("ANANA");
        hash.add("FRAGOLA");
        return hash;
    }
    public static void stamparHash(HashSet<String> hashFruit){
        for (String i : hashFruit) {
            System.out.println(i);
        }
    }
}
