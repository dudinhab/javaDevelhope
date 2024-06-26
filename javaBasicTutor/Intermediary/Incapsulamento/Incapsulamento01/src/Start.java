/*
Scrivere un programma che contenga una classe che definisce un Auto che abbia come proprietà cilindrata, targa, marca e modello.
Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Auto.
In questo caso la nota importante è rendere le proprietà della classe auto accessibili solo attraverso i metodi.
 */

public class Start {
    public static void main(String[] args) {
        Auto auto = new Auto("381JD2","Honda","City",321);
        System.out.println(auto.getCilindrata());

    }
}