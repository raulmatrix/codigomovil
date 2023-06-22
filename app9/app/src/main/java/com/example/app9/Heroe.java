package com.example.app9;

import java.io.Serializable;

public class Heroe implements Serializable {

    String nombre;
    String poder;

    public Heroe(String nombre, String poder) {
        this.nombre = nombre;
        this.poder = poder;
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
}
