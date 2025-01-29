package org.iesalandalus.programacion.matriculacion.modelo.negocio;

import java.util.ArrayList;

import org.iesalandalus.programacion.matriculacion.modelo.dominio.Alumno;

import javax.naming.OperationNotSupportedException;

public class Alumnos {
    private final ArrayList<Alumno> coleccionAlumnos;


    public Alumnos() {
        this.coleccionAlumnos = new ArrayList<>();
    }

    public Alumno[] get() {
        return (copiaProfundaAlumnos());
    }

    private Alumno[] copiaProfundaAlumnos() {
        Alumno[] copia = new Alumno[this.coleccionAlumnos.size()];
        for (int i = 0; i < this.coleccionAlumnos.size(); i++) {
            copia[i] = new Alumno(coleccionAlumnos.get(i));
        }
        return copia;
    }

    public int getTamano() {
        return this.coleccionAlumnos.size();
    }

    public void insertar(Alumno alumno) throws OperationNotSupportedException {
        if (alumno == null) {
            throw new NullPointerException("ERROR: No se puede insertar un alumno nulo.");
        }
        int indice = this.coleccionAlumnos.indexOf(alumno);
        if (indice != -1) {
            throw new OperationNotSupportedException("ERROR: Ya existe un alumno con ese dni.");
        } else {

            this.coleccionAlumnos.add(new Alumno(alumno));
        }
    }

    public void borrar(Alumno alumno) throws OperationNotSupportedException {
        if (alumno == null) {
            throw new NullPointerException("ERROR: No se puede borrar un alumno nulo.");
        }
        int indice = this.coleccionAlumnos.indexOf(alumno);
        if (indice == -1) {
            throw new OperationNotSupportedException("ERROR: No existe ningún alumno como el indicado.");
        }
        this.coleccionAlumnos.remove(indice);
    }

    public Alumno buscar(Alumno alumno) {
        if (alumno == null) {
            throw new NullPointerException("ERROR: El alumno no puede ser nulo.");
        }
        int indice = this.coleccionAlumnos.indexOf(alumno);
        if (indice == -1) {
            return null;
        }
        return new Alumno(this.coleccionAlumnos.get(indice));
    }

}
