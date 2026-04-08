package edu.dosw.parcial.model;

import java.time.LocalDate;

public class ColaboradoresModel {

    private long id;
    private String mail;
    private String password;
    private String name;
    private String lastName;
    private int phone;
    private LocalDate date;

    public void setCorreo(String m) {
        this.mail = m;
    }

    public String getPass() {
        return password;
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