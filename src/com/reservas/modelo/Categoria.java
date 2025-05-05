package com.reservas.modelo;

import java.util.ArrayList;

public class Categoria {
    private String nombre;
    private ArrayList<Negocio> negocios;

    public Categoria(String nombre) {
        this.nombre = nombre;
        this.negocios = new ArrayList<>();
    }

    public void agregarNegocio(Negocio negocio) {
        negocios.add(negocio);
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Negocio> getNegocios() {
        return negocios;
    }
}