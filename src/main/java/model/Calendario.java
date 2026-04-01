/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author ftana
 */
public class Calendario {
    
    private int ano;
    private int mes;
    private int dia;

    public Calendario() {
    }

    public Calendario(int ano, int mes, int dia) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }
    
    
    public int getAno() {
        Calendar c = Calendar.getInstance();
        ano = c.get(Calendar.YEAR);
        return ano;
    }

    public int getMes() {
        Calendar c = Calendar.getInstance();
        mes = c.get(Calendar.MONTH);
        return mes;
    }

    public int getDia() {
        Calendar c = Calendar.getInstance();
        dia = c.get(Calendar.DAY_OF_MONTH);
        return dia;
    }
}
