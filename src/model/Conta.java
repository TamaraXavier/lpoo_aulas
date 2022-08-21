package model;

public abstract class Conta {
    protected double saldo;

    public Conta(){
        super();
    }

    public Conta(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double valor){
        //System.out.println("\nDeposita");
        this.saldo += valor;
        //saldo += saldo + valor;
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
    
    public void atualiza(double taxa){
        //System.out.println("\nAtualiza");
        if(taxa > 0){
            this.saldo += this.saldo * (taxa/100);
        }
        else{
            System.out.println("\n Necessário Taxa ser maior que zero.");
        }
    }


}
