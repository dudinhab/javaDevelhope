import java.math.BigDecimal;

/*
Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica (Addizione, sottrazione, moltiplicazione e divisione, min e max) definita in un enum
Crei un metodo per calcolare l'operazione richiesta e e ritorni il risultato.
Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo
 */
public class Main {
    public static void main(String[] args) {
        BigDecimal bigNum1 = new BigDecimal(678902345654.43245);
        BigDecimal bigNum2 = new BigDecimal(678922345654.43245);

        System.out.println(sum(bigNum1,bigNum2));
    }

    public static BigDecimal sum(BigDecimal n1, BigDecimal n2) {
        return n1.add(n2);
    }
}
