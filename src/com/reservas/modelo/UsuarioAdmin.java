package com.reservas.modelo;

import java.util.ArrayList;

public class UsuarioAdmin extends Usuario {
    private ArrayList<Negocio> negocios;

    public UsuarioAdmin(String nombre, String correo, String contrasena) {
        super(nombre, correo, contrasena);
        this.negocios = new ArrayList<>();
    }

    public void agregarNegocio(Negocio negocio) {
        negocios.add(negocio);
    }

    public ArrayList<Negocio> getNegocios() {
        return negocios;
    }

    @Override
    public String getTipoUsuario() {
        return "Administrador";
    }
}