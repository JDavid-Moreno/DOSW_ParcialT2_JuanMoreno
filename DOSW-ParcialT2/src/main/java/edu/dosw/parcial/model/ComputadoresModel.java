package edu.dosw.parcial.model;

import java.time.LocalDate;
import java.util.List;

public class ComputadoresModel {
    private Long id;

    private String serial;

    private String marca;


    private int numLab;

    private boolean ocupado;
    private List<PerifericoModel> periferico;
    private ColaboradoresModel colaborador;

    
    public long getId() {
        return id;
    }

    public String getSerial() {
        return serial;
    }

    public String getMarca() {
        return marca;
    }

    public int getNumLab() {
        return numLab;
    }

    public boolean getOcupado() {
        return ocupado;
    }

    public List<PerifericoModel> getPerif() {
        return periferico;
    }

    public ColaboradoresModel getCol() {
        return colaborador;
    }

    public void setOcupado( boolean o) {
        this.ocupado = o;
    }
}