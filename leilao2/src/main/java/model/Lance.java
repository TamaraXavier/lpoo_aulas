package model;
import java.text.NumberFormat;

public class Lance {
    private int Id_lance;
    private double val_lance;
    private double hora_lance;

    private Participante participante; //chave estrangeira

    private ItemLeilao itemLeilao;

    public Lance(){
        super();
    }

    public Lance(int id_lance, double val_lance, double hora_lance, Participante participante){
        super();
        this.Id_lance=id_lance;
        this.val_lance=val_lance;
        this.hora_lance=hora_lance;
        this.participante=participante;
    }

    public int getId_lance() {
        return Id_lance;
    }

    public void setId_lance(int id_lance) {

        this.Id_lance=id_lance;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public double getVal_lance(){
        return val_lance;
    }

    public void setVal_lance(double val_lance){
        this.val_lance=val_lance;
    }

    public double getHora_lance(){
        return hora_lance;
    }

    public void setHora_lance(double hora_lance) {
        this.hora_lance = hora_lance;
    }

    @Override
    public String toString() {
        return "Lance{" +
                "Id_lance=" + Id_lance +
                ", val_lance=" + val_lance +
                ", hora_lance=" + NumberFormat.getCurrencyInstance().format(hora_lance) +
                ", Participante=" + participante +
                '}';
    }
}
