/*
Scrivere un programma che contenga un metodo che permette di inizializzare una matrice e di scambiare le sue righe e le sue colonne stampandola a video.
 *   Matrice di partenza
 *   1 2 3
 *   4 5 6
 *   Matrice risultato
 *   1 4
 *   2 5
 *   3 6
 */

public class Start {
    public static void main(String[] args) {
        int[][] matrice1 = new int[2][3];
        System.out.println("Inserindo dati sul matrice: ");
        matrice1 = creaMatrice(matrice1);

        System.out.println("----------------------------------------");

        int[][] matrice2 = new int[3][2];
        System.out.println("Cambiando le posizione sul matrice: ");
        matrice2 = cambiaMatrice(matrice1);
    }

    private static int[][] creaMatrice(int[][] matrice1) {
        int cont = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrice1[i][j] = cont;
                System.out.print(cont + " ");
                cont++;
            }
            System.out.println("");
        }
        return matrice1;
    }

    private static int[][] cambiaMatrice(int[][] matrice1) {
        int[][] matrice2 = new int[3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matrice2[i][j] = matrice1[j][i];
                System.out.print(matrice2[i][j] + " ");
            }
            System.out.println("");
        }
        return matrice2;
    }
}
