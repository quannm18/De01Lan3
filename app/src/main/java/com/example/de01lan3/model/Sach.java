package com.example.de01lan3.model;

public class Sach {
    private int id;
    private String name;
    private String ma;

    public Sach(int id, String name, String ma) {
        this.id = id;
        this.name = name;
        this.ma = ma;
    }

    public Sach() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    @Override
    public String toString() {
        return id+"-"+name+"-"+ma;
    }
}
