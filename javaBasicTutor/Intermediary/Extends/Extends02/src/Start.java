public class Start {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        cc.setAgencia(1111);
        cc.setNumero(2222);
        cc.setTipoDeConta("PF");
        cc.setChequeEspecial(1000);

        cc.sacar(10);
        System.out.println(cc.getSaldoDisponivel());


        Conta cc2 = new Conta();
        cc2.setAgencia(1111);
        cc2.setNumero(2222);
        cc2.sacar(10);

        System.out.println(cc2.getSaldo());

    }

}
