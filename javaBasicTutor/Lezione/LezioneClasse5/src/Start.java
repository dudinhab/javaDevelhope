/*
Chiedere difficoltà del gioco: Facile, Normale, Difficile
Facile: 4x4
Normale: 6x6
Difficile: 8x8

Il tabellone è una matrice riempita di 0

Numero di tesori:
Facile: 1
Normale: 2
Difficile: 3

0 0 0
0 0 0
0 0 0
il tesoro sarà posizionato in modo randomico e si potrà riconoscere con 1
il giocatore inserisce il numero e la colonna del gioco
ogni tentativo riduce la quantità di vite
a 0 vite il giocatore perde
la posizione già scelta viene cambiata in 8
stampare se il giocatore ha vinto o perso
 */


import java.util.Random;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scegli la dificolta: (1)Facile (2)Media (3)Dificile:");
        int dificolta = scanner.nextInt();
        randomMatrice(dificolta, scanner);
        scanner.close();
    }

    private static void randomMatrice(int dificolta, Scanner scanner) {
        int tamanho = 0;
        int premio = 0;
        switch (dificolta) {
            case 1:
                tamanho = 4;
                premio = 1;
                break;

            case 2:
                tamanho = 6;
                premio = 2;
                break;

            case 3:
                tamanho = 8;
                premio = 3;
                break;

            default:
                System.out.println("Dificulta sconosciuta!");
                break;
        }

        if (tamanho != 0) {
            int[][] matrice = creaMatrice(tamanho, premio);
            for (int i = 0; i < tamanho; i++) {
                for (int j = 0; j < tamanho; j++) {
                    System.out.print(matrice[i][j] + " ");
                }
                System.out.println(" ");
            }
            gioco(matrice, scanner);
        }
    }


    private static int randomNumber(int tamanho) {
        Random random = new Random();
        return random.nextInt(tamanho);
    }

    public static int[][] creaMatrice(int tamanho, int premio) {
        int[][] matrice = new int[tamanho][tamanho];
        for (int i = 0; i < premio; i++) {
            int linha = randomNumber(tamanho);
            int coluna = randomNumber(tamanho);
            if (matrice[linha][coluna] == 0) {
                matrice[linha][coluna] = 1;
            } else {
                i--;
            }
        }
        return matrice;
    }

    public static void gioco(int[][] matrice, Scanner scanner) {
        int vita = 3;
        int linea;
        int coluna;
        while (vita >= 0) {
            if (vita>0){
                System.out.print("Linea 1 - " + matrice.length + " :");
                linea = scanner.nextInt();
                System.out.print("Coluna 1 - " + matrice.length + " :");
                coluna = scanner.nextInt();

                if (matrice[linea - 1][coluna - 1] == 1) {
                    System.out.println("Hai vinto!");
                    break;
                } else {
                    System.out.println("Hai perso!");
                    vita--;
                    System.out.println("Manca ancora " + vita + " vite");
                }
            }
           else{
                System.out.println("Vite Finite!");
                break;
            }
        }


    }
}