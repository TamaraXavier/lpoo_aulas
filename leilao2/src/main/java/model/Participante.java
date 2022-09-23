package model;

import java.util.ArrayList;
import java.util.List;

public class Participante {
    private int id_part;
    private String nome;
    private String login;
    private String senha;
    private String email;
    private String endereco;
    private String telefone;

    private List<Lance> Lance = new ArrayList<>();

    public Participante (){

        super();
    }

    public Participante(int id_part, String nome, String login, String senha, String email, String endereco, String telefone){
        super();
        this.id_part=id_part;
        this.nome=nome;
        this.login=login;
        this.senha=senha;
        this.email=email;
        this.endereco=endereco;
        this.telefone=telefone;
    }

    public int getId_part() {
        return id_part;
    }

    public void setId_part(int id_part) {

        this.id_part = id_part;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome=nome;
    }

    public String getLogin(){
        return login;
    }
    public void setLogin(String login){
        this.login=login;
    }

    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha=senha;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco=endereco;
    }

    public String getTelefone(){
        return senha;
    }
    public void setTelefone(String telefone){
        this.telefone=telefone;
    }

    public List<Lance> getLance() {
        return Lance;
    }

    public void setLance(List<Lance> lance) {
        this.Lance = lance;
    }

    @Override
    public String toString() {
        return "\nParticipante{" +
                "id_part=" + id_part +
                ", nome='" + nome + '\'' +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", Lance=" + Lance +
                '}';
    }
}
