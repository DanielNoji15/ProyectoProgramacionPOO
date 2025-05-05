package com.reservas.modelo;

import java.util.ArrayList;

public class Negocio {
    private String nombre;
    private UsuarioAdmin propietario;
    private Direccion direccion;
    private ArrayList<Categoria> categorias;
    private ArrayList<Reserva> reservas;

    public Negocio(String nombre, UsuarioAdmin propietario, Direccion direccion) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.direccion = direccion;
        this.categorias = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void agregarCategoria(Categoria categoria) {
        categorias.add(categoria);
        categoria.agregarNegocio(this); // bidireccional
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public String getNombre() { return nombre; }
    public Direccion getDireccion() { return direccion; }
    public UsuarioAdmin getPropietario() { return propietario; }

    public ArrayList<Categoria> getCategorias() { return categorias; }

    public void mostrarInformacion() {
        System.out.println("Negocio: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Categorías:");
        for (Categoria c : categorias) {
            System.out.println("- " + c.getNombre());
        }
    }
}
