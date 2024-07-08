import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

/*
Creare 3 hashmap con 3 differenti metodi di inizializzazione e stampare il contenuto.
 */
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(1, "One");
        stampaMap(hashMap1);

        Map<Integer, String> hashMap2 = new HashMap<>(Map.of(1, "One"));
        stampaMap(hashMap2);


        Map<Integer, String> hashMap3 = new HashMap<>(Map.ofEntries(
                new AbstractMap.SimpleEntry<Integer, String>(1, "One")));
        stampaMap(hashMap3);
    }

    public static void stampaMap(Map<Integer, String> hashMap) {
        for (Map.Entry<Integer, String> i : hashMap.entrySet()) {
            System.out.println(i);
        }
    }
}
