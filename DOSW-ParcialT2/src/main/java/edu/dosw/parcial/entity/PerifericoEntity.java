package edu.dosw.parcial.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
public class PerifericoEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TIPOPERIFERICO perifericoT;

    private String name;
    @Column(length = 50)

    private boolean inalambrico;

    @OneToMany
    @JoinColumn(name = "id", nullable = false)
    private ColaboradoresEntity colaborador;

    public PerifericoEntity () {}
    public PerifericoEntity (String name, boolean inalambrico,  TIPOPERIFERICO perifericoT) {
        this.name = name;
        this.inalambrico = inalambrico;
        this.perifericoT = perifericoT; 
    }

    public long getId() {
        return id;
    }

    public TIPOPERIFERICO getType() {
        return perifericoT;
    }

    public String getName() {
        return name;
    }

    public ColaboradoresEntity getColabor() {
        return colaborador;
    }

    public boolean getInalambr() {
        return inalambrico;
    }

    public void setInalambr( boolean i) {
        this.inalambrico = i;
    }
}

