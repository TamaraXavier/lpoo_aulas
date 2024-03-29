package model;

import java.util.Locale;

public class Aluno {
    //Atributos
    private int id;
    private String cpf;
    private String nome;
    private String sobrenome;
    private String email;

    //Métodos construtores
    public Aluno() {
        super();
    }

    public Aluno(int id, String cpf, String nome, String sobrenome, String email) {
        super();
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
    }

    //Métodos acessores
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", cpf=" + cpf +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
