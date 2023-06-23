package com.example.app9;

import java.io.Serializable;

public class Heroe implements Serializable {

    String nombre;
    String poder;

    String categoria;

    public Heroe(String nombre, String poder, String categoria) {
        this.nombre = nombre;
        this.poder = poder;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
