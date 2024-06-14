public class ContaCorrente extends Conta{
        private String tipoDeConta;
        private double chequeEspecial;

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double getSaldoDisponivel() {
        return super.getSaldo() + this.chequeEspecial;
    }

    //Esse override sobrescreve o que foi criado na classe conta, se for acionada a classe ContaCorrente, será executada esse bloco
    @Override
    public void sacar(double valor){
        valor += 10;
        super.sacar(valor);
    }
}
