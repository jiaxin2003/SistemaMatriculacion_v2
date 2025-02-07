package org.iesalandalus.programacion.matriculacion;

import org.iesalandalus.programacion.matriculacion.controlador.Controlador;
import org.iesalandalus.programacion.matriculacion.modelo.Modelo;

import org.iesalandalus.programacion.matriculacion.vista.Vista;


public class MainApp {

    public static void main(String[] args) {

        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(vista, modelo);
        modelo.comenzar();
        controlador.comenzar();
        vista.comenzar();
    }
}

