package com.reservas.modelo;

public class Reserva {
    private UsuarioCliente cliente;
    private Negocio negocio;

    public Reserva(UsuarioCliente cliente, Negocio negocio) {
        this.cliente = cliente;
        this.negocio = negocio;
    }

    public UsuarioCliente getCliente() {
        return cliente;
    }

    public Negocio getNegocio() {
        return negocio;
    }

    @Override
    public String toString() {
        return "Reserva en " + negocio.getNombre() + " por " + cliente.getNombre();
    }
}
