package edu.dosw.parcial.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

@Entity
public class ColaboradoresEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @Column(unique = true, nullable = false)
    private String mail;

    private String password;
    @Column(length = 15, nullable = false)

    private String name;
    @Column(length = 10)

    private String lastName;
    @Column(length = 20)

    private int phone;
    @Column(length = 10)

    private LocalDate date;

    public ColaboradoresEntity() {}
    public ColaboradoresEntity(String mail, String password, String name, String lastName, int phone) {
        this.mail = mail;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
    }

    public void setCorreo(String m) {
        this.mail = m;
    }

    public void setTel(int t) {
        this.phone = t;
    }

    public long getId() {
        return id;
    }

    public String getMail() {
        return mail;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPhone() {
        return phone;
    }

    public LocalDate getDate() {
        return date;
    }

}