package edu.dosw.parcial.model;

import java.util.List;

public class PerifericoModel {
    
    private long id;
    private TIPOPERIFERICO perifericoT;

    private String name;

    private boolean inalambrico;

    private ColaboradoresModel colaborador;


    public long getId() {
        return id;
    }

    public TIPOPERIFERICO getType() {
        return perifericoT;
    }

    public String getName() {
        return name;
    }

    public ColaboradoresModel getColabor() {
        return colaborador;
    }

    public boolean getInalambr() {
        return inalambrico;
    }

    public void setInalambr( boolean i) {
        this.inalambrico = i;
    }
}