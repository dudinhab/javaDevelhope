/*
Uma classe é um tipo de dado que pode se chamado e instanciado para ser utilizado mais de uma vez, é uma forma mais limpa de utilizar algo que será repetido.
Ao inves de se utilizar uma unica variavel que recebe um valor, a classe quando é chamada, dentro possui diversas variáveis já pré inseridas que podem ser atribuidas para um mesmo "id", sendo atribuido um vinculo entre elas.
 */

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Conta contaCorrente = new Conta(123,321,50.0);
        contaCorrente.depositarSaldo(100);
        System.out.println(contaCorrente.verificarSaldo());


        Conta contaPoupanca = new Conta(111,222,1000);
        contaPoupanca.sacarSaldo(50.0);
        System.out.println(contaPoupanca.verificarSaldo());

    }
}
