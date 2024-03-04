package Eventos_Deportivos.clases;

import Eventos_Deportivos.interfaz.Ganador;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class EventoDeportivo implements Ganador {

    //  ATRIBUTOS
    private String nombre;
    private LocalDateTime fecha;
    private String lugar;
    private ArrayList<Participante> participantes;

    //  MÉTODOS
    public EventoDeportivo(String nombre, LocalDateTime fecha, String lugar) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
       this.participantes = new ArrayList<Participante>();
    }

    //  GETTERS Y SETTERS


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Participante> participantes) {
        this.participantes = participantes;
    }

    public boolean inscribirParticipante(Participante participante) {
        if (participantes.add(participante)) {
            return true;
        }
        return false;
    }

    public abstract ArrayList<Participante> obtenerGanador();


}
