package Eventos_Deportivos.clases;

import Eventos_Deportivos.clases.Participante;

public class ParticipanteCarrera extends Participante {
    //Atributos
    private double tiempo;








    //metodos
    public ParticipanteCarrera(String dni, String nombre, String apellidos, int edad, double tiempo) {
        super(dni, nombre, apellidos, edad);
        this.tiempo=tiempo;


    }

    @Override
    public String toString() {
        return "Dni "+ this.getDni() +" Nombre: "+this.getNombre()+" Apellidos: "+this.getApellidos()+" Edad: "+this.getEdad()+" tiempo: "+this.tiempo;
    }


    //Getter y Setter

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
}
