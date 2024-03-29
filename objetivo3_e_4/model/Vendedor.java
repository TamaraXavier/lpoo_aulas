package model;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Funcionario {

    //private int matricula;
    private String local;
    private List<Pedido> pedidos = new ArrayList<>();

    public Vendedor(int i, String local, String s, String três_vendas, String s1, String pelotas, String rs, String s2){
        this.local=local;
    }

    public Vendedor(int matricula, String nome, String endereco, String bairro, String cep, String cidade, String estado){
        super(matricula, nome, endereco,bairro, cep, cidade, estado);
        this.local=local;
    }

    public String getLocal(){
        return local;
    }

    public void setLocal(String local){
        this.local=local;
    }

    public List<Pedido> getPedidos(){
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos){
        this.pedidos=pedidos;
    }

    @Override
    public String toString() {
        return "\nVendedor{" + "matricula=" + getMatricula() + ", nome='" + getNome() + '\'' + ", endereco='" + getEndereco() + '\'' + ", bairro='" + getBairro() + '\'' +
                ", cep='" + getCep() + '\'' + ", cidade='" + getCidade() + '\'' + ", estado='" + getEstado() + '\'' + "local='" + local + '\'' + '}';
    }

    /*public void realizarPedido(){
    }

    public void consultarPreco(){
    }*/


}
