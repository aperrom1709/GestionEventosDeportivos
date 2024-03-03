package Eventos_Deportivos.clases;

import javax.swing.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class TorneoDeFutbol extends EventoDeportivo {
    private ArrayList<Equipo> equipos;

    public TorneoDeFutbol(String nombre, LocalDateTime fecha, String lugar) {
        super(nombre, fecha, lugar);
        equipos = null;
    }

    @Override
    public ArrayList<Participante> obtenerGanador() {

    }

    public  boolean inscribirEquipo(Equipo e){
        if (equipos.add(e)){
            return true;
        }
        return false;

    }

}
