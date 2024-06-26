/*
Scrivere una funzione che provi a dividere un numero per 0 e catturi l'eccezione leggendone il messaggio.
 */

public class Main {
    public static void main(String[] args) {
        try {
            int div = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
