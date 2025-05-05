package com.reservas.modelo;

public class Direccion {
    private String ciudad;
    private String calle;
    private String numero;

    public Direccion(String ciudad, String calle, String numero) {
        this.ciudad = ciudad;
        this.calle = calle;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return calle + " #" + numero + ", " + ciudad;
    }
}