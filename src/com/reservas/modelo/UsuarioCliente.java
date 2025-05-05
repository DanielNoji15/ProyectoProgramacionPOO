package com.reservas.modelo;

import java.util.ArrayList;

public class UsuarioCliente extends Usuario {
    private ArrayList<Reserva> reservas;

    public UsuarioCliente(String nombre, String correo, String contrasena) {
        super(nombre, correo, contrasena);
        this.reservas = new ArrayList<>();
    }

    public void realizarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    @Override
    public String getTipoUsuario() {
        return "Cliente";
    }
}
