package model;

public class ContaCorrente extends Conta implements AssociadoVip{

    private double lucros;
    private int qdeCotas;
    private double valorCota;
    public ContaCorrente(){
        super();
    }

    public ContaCorrente(double lucros, int qdeCotas, double valorCota){
        this.lucros = lucros;
        this.qdeCotas = qdeCotas;
        this.valorCota = valorCota;
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
    public void atualiza(double taxa){
        super.atualiza(taxa);
    }

    public void saca(double valor){
        //System.out.println("\nsaca");
        double saldoAtual = this.saldo - valor;
        if(saldoAtual >= 0){
            this.saldo -= valor;
        }
        else{
            System.out.println("\n Saldo insuficiente! Não foi possível realizar o saque.\n");
        }
    }

    @Override
    public double lucros(int qdeCotas, double valorCota){
        return qdeCotas * valorCota;
    }

    @Override
    public int getQdeCotas() {
        return qdeCotas;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "lucros=" + lucros +
                ", qdeCotas=" + qdeCotas +
                ", valorCota=" + valorCota +
                ", saldo=" + saldo +
                '}';
    }
}
