package model;

public class Associado implements AssociadoVip {
    private String nome;
    private double lucros;
    private int qdeCotas;
    private double valorCota;

    public Associado(){
        super();
    }

    public Associado(String nome, double lucros, int qdeCotas, double valorCota){
        this.nome = nome;
        this.lucros = lucros;
        this.qdeCotas = qdeCotas;
        this.valorCota = valorCota;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public double lucros(int qdeCotas, double valorCota){
        return lucros;
    }


    public int getQdeCotas(){
        return qdeCotas;
    }

    @Override
    public String toString() {
        return "Associado{" +
                "nome='" + nome + '\'' +
                ", lucros=" + lucros +
                ", qdeCotas=" + qdeCotas +
                ", valorCota=" + valorCota +
                '}';
    }
}
