package edu.dosw.parcial.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;
import java.util.List;

@Entity
public class ComputadoresEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String serial;
    @Column (length = 20)

    private String marca;
    @Column (length = 10)

    private int numLab;
    @Column( length = 4)

    private boolean ocupado;
    @Column(nullable = false)

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private List<PerifericoEntity> periferico;

    @OneToMany
    @JoinColumn(name = "id", nullable = false)
    private ColaboradoresEntity colaborador;

    public ComputadoresEntity() {}

    public ComputadoresEntity (String serial, String marca, int numLab, boolean ocupado, List<PerifericoEntity> periferico) {
        this.serial = serial;
        this.marca = marca;
        this.numLab = numLab;
        this.ocupado = ocupado;
        this.periferico = periferico;
    }

    
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

    public List<PerifericoEntity> getPerif() {
        return periferico;
    }

    public ColaboradoresEntity getCol() {
        return colaborador;
    }

    public void setOcupado( boolean o) {
        this.ocupado = o;
    }
}
