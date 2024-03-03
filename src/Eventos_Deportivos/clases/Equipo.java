package Eventos_Deportivos.clases;

import Eventos_Deportivos.Ganador;

import java.util.ArrayList;

public class Equipo implements Comparable<Equipo> {
    //  ATRIBUTOS
    private String nombre;
    private ArrayList<Participante> jugadores;
    private int puntos;

    //  CONSTRUCTOR
    public Equipo(String nombre, int puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
        jugadores = null;

    }

    //  GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Participante> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Participante> jugadores) {
        this.jugadores = jugadores;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    //  Añadir Jugadores
    public boolean anadirJugador(Participante jugador) {
        if (jugadores.add(jugador)) {
            return true;
        }
        return false;
    }

    //  Eliminar Jugadores
    public boolean eliminarJugador(Participante jugador) {
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.remove(i).getNombre().equalsIgnoreCase(jugador.getNombre()) &&
                    jugadores.remove(i).getApellidos().equalsIgnoreCase(jugador.getApellidos())) {
                return true;
            }
        }
        return false;
    }

    //  Cadena de información
    @Override
    public String toString() {
        String infoEquipo = "";
        infoEquipo = "\nNombre de equipo " + nombre + "\nPuntos del equipo " + puntos;
        String jugador = "Jugadores:\n ";
        for (int i = 0; i < jugadores.size(); i++) {
            jugador.concat(jugadores.get(i).getNombre() + jugadores.get(i).getApellidos() + "\n");
        }
        return infoEquipo + jugador;
    }

    //  Comprobación de dos equipos con el mismo nombre

    public boolean equals(Equipo e) {
        if (e.nombre.equalsIgnoreCase(this.nombre)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(Equipo eq) {

        if (eq.puntos < this.puntos) {
            return 3;
        }
        if (eq.puntos > this.puntos) {
            return -1;
        }
        return 0;
    }
}
