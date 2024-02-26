package Eventos_Deportivos.clases;

import Eventos_Deportivos.Ganador;

public class Participante {
    //  ATRIBUTOS
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    //  MÉTODOS


    //  CONSTRUCTOR
    public Participante(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        setDni(dni);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    //  GETTERS Y SETTERS
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    //  Cadena de información
    @Override
    public String toString() {
        return "\nDni: " + this.dni + "\nNombre: " + this.nombre + "\nApellidos: " + this.apellidos + "\nEdad: " + this.edad;
    }

    //  Comprobación de dos participantes con el mismo dni
    @Override
    public boolean equals(Object part) {
        if (part instanceof Participante participante) {
            return this.dni.equalsIgnoreCase(participante.dni);
        } else {
            return false;
        }

    }


}
