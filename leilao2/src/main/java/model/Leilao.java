package model;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;

public class Leilao {
    private int id_leilao;
    private Calendar dt_inicio;
    private Time hr_inicio;
    private Calendar dt_final;
    private Time hr_final;

    private List<ItemLeilao> itemLeilaoList = new ArrayList<>();

    public Leilao(){
        super();
    }

    public Leilao(int id_leilao, Calendar dt_inicio, Calendar dt_final, Time hr_inicio, Time hr_final){
        super();
        this.id_leilao=id_leilao;
        this.dt_inicio=dt_inicio;
        this.dt_final=dt_final;
        this.hr_inicio=hr_inicio;
        this.hr_final=hr_final;
    }

    public int getId_leilao() {
        return id_leilao;
    }

    public void setId_leilao(int id_leilao) {
        this.id_leilao = id_leilao;
    }

    public Calendar getDt_inicio() {
        return dt_inicio;
    }

    public void setDt_inicio(Calendar dt_inicio) {
        this.dt_inicio = dt_inicio;
    }

    public Time getHr_inicio() {
        return hr_inicio;
    }

    public void setHr_inicio(Time hr_inicio) {
        this.hr_inicio = hr_inicio;
    }

    public Calendar getDt_final() {
        return dt_final;
    }

    public void setDt_final(Calendar dt_final) {
        this.dt_final = dt_final;
    }

    public Time getHr_final() {
        return hr_final;
    }

    public void setHr_final(Time hr_final) {
        this.hr_final = hr_final;
    }

    public List<ItemLeilao> getItemLeilaoList() {
        return itemLeilaoList;
    }

    public void setItemLeilaoList(List<ItemLeilao> itemLeilaoList) {
        this.itemLeilaoList = itemLeilaoList;
    }

    private static String calendarToString(Calendar dt_inicio) {
        if (dt_inicio != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            return sdf.format((dt_inicio).getTime());
        }
        return "00/00/0000 00:00";
    }

    /*private static String calendarToString(Calendar dt_final) {
        if (dt_final != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            return sdf.format(dt_final.getTime());
        }
        return "00/00/0000 00:00";
    }*/

    @Override
    public String toString() {
        return "Leilao{" +
                "id_leilao=" + id_leilao +
                ", dt_inicio=" + calendarToString(dt_inicio) +
                ", hr_inicio=" + hr_inicio +
                ", dt_final=" + calendarToString(dt_final) +
                ", hr_final=" + hr_final +
                ", itemLeilaoList=" + itemLeilaoList +
                '}';
    }
}