import java.util.HashSet;

/*
Scrivere una funzione che restituisca un hashset riempito
Leggere l'hashSet e stampre grandezza ed elementi
 */

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSetFilm = filmSet();
        System.out.println("Il Hash Set ha una grandezza di: " + hashSetFilm.size());
        System.out.println("Questi sono gli elementi del Hash:");
        for (String i : hashSetFilm) {
        }

        /*
        System.out.println(hashSetFilm.toString());
         */

    }

    public static HashSet<String> filmSet() {
        HashSet<String> filmSet = new HashSet<>();
        filmSet.add("Guardians of the Galaxy 1");
        filmSet.add("Guardians of the Galaxy 2");
        filmSet.add("Guardians of the Galaxy 3");

        return filmSet;
    }
}
