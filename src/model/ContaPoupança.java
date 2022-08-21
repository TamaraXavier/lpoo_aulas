package model;

public class ContaPoupança extends Conta{

    public ContaPoupança() {
        super();
    }

    public ContaPoupança(double saldo){
        super(saldo);
    }

    @Override
    public double getSaldo() {
        return super.getSaldo();
    }

    @Override
    public void setSaldo(double saldo) {
        super.setSaldo(saldo);
    }

    @Override
    public void deposita(double valor){
        super.deposita(valor);
    }

    @Override
    public void saca(double valor){
        super.saca(valor);
    }

    @Override
    public void atualiza(double taxa){
        super.atualiza(taxa);
    }

    @Override
    public String toString() {
        return "ContaPoupança{" +
                "saldo=" + saldo +
                '}';
    }
}
