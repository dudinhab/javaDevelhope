public class Conta {
    int agencia;
    int numero;
    double saldo;

    public Conta(){

    }

    public Conta(int agencia, int numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositarSaldo(double valor){
        this.saldo += valor;
    }

    public void sacarSaldo(double valor){
        this.saldo -= valor;
    }

    public double verificarSaldo(){
        return this.saldo;
    }
}
