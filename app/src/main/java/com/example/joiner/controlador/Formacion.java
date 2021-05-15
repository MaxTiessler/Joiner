package com.example.joiner.controlador;

import java.util.ArrayList;

public class Formacion {
    private String tipo;
    private String nombre;
    private ArrayList<Centro> centros;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Centro> getCentros() {
        return centros;
    }

    public void setCentros(ArrayList<Centro> centros) {
        this.centros = centros;
    }
}
