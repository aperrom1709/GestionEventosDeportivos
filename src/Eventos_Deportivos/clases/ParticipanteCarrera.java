package Eventos_Deportivos.clases;

import Eventos_Deportivos.clases.Participante;

public class ParticipanteCarrera extends Participante {
    //Atributos
    private double tiempo;


    //  MÉTODOS

    //  COSNTRUCTOR
    public ParticipanteCarrera(String dni, String nombre, String apellidos, int edad, double tiempo) {
        super(dni, nombre, apellidos, edad);
        this.tiempo = tiempo;


    }


    //  Cadena de información
    public String toString() {
        return "\nDni: " + this.getDni() + "\nNombre: " + this.getNombre() + "\nApellidos: " + this.getApellidos() + "\nEdad: " + this.getEdad() + "\nTiempo: " + this.tiempo +
                "\n";
    }


    //  GETTERS Y SETTERS

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
}
