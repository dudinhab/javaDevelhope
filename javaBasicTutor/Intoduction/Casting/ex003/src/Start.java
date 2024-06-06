/*
Scrivere uno snippet di codice che dati 2 numeri con la virgola(double) li sommi e li stampi senza virgola (int).
 */

import org.w3c.dom.ls.LSOutput;

public class Start {
    public static void main(String[] args) {
        double n1 = 2.4;
        double n2 =35.9;
        int sum = (int)(n1+n2);

        System.out.println("La soma del numero "+n1+" e "+n2+" risulta in "+sum+" utilizando il casting di int");
    }
}
