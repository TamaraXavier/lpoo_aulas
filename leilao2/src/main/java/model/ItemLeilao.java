package model;

import java.util.ArrayList;
import java.util.List;

public class ItemLeilao {
    private int id_leilao;
    private String titulo_item;
    private String descricao;
    private double lance_minimo;
    private String caminho_foto;
    private String arrematado;
    private List<Lance> Lance = new ArrayList<>();

    private Leilao leilao;

    public ItemLeilao(){
        super();
    }

    public ItemLeilao(int id_leilao, String titulo_item, String descricao, double lance_minimo, String caminho_foto, String arrematado, Leilao leilao){
        super();
        this.id_leilao=id_leilao;
        this.titulo_item=titulo_item;
        this.descricao=descricao;
        this.lance_minimo=lance_minimo;
        this.caminho_foto=caminho_foto;
        this.arrematado=arrematado;
        this.leilao=leilao;
    }

    public int getId_leilao(){
        return id_leilao;
    }

    public void setId_leilao(int id_leilao){
        this.id_leilao=id_leilao;
    }

    public String getTitulo_item() {
        return titulo_item;
    }

    public void setTitulo_item(String titulo_item) {
        this.titulo_item = titulo_item;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getLance_minimo() {
        return lance_minimo;
    }

    public void setLance_minimo(double lance_minimo) {
        this.lance_minimo = lance_minimo;
    }

    public String getCaminho_foto() {
        return caminho_foto;
    }

    public void setCaminho_foto(String caminho_foto) {
        this.caminho_foto = caminho_foto;
    }

    public String getArrematado() {
        return arrematado;
    }

    public void setArrematado(String arrematado) {
        this.arrematado = arrematado;
    }

    public List<model.Lance> getLance() {
        return Lance;
    }

    public void setLance(List<model.Lance> lance) {
        Lance = lance;
    }

    public Leilao getLeilao() {
        return leilao;
    }

    public void setLeilao(Leilao leilao) {
        this.leilao = leilao;
    }

    @Override
    public String toString() {
        return "ItemLeilao{" +
                "id_leilao=" + id_leilao +
                ", titulo_item='" + titulo_item + '\'' +
                ", descricao='" + descricao + '\'' +
                ", lance_minimo=" + lance_minimo +
                ", caminho_foto='" + caminho_foto + '\'' +
                ", arrematado='" + arrematado + '\'' +
                ", Lance=" + Lance +
                ", Leilao=" + leilao +
                '}';
    }
}
