/*
Scrivi un programma che contenga un metodo che crea un array e lo riempie con i numeri da 1 a 10 e che che calcoli la somma dei numeri contenuti nell'array inizializzato e la stampi a video.
 */
public class Start {
    public static void main(String[] args) {
        int[] arrayNum = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += (i + 1);
            arrayNum[i] = (i + 1);
            System.out.print(arrayNum[i]);
            if ((i + 1) < 10) {
                System.out.print(" + ");
            } else if ((i + 1) == 10) {
                System.out.print(" = ");
            }
        }
        System.out.println(sum);
    }
}
