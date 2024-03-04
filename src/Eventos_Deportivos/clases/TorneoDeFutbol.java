package Eventos_Deportivos.clases;

import javax.swing.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class TorneoDeFutbol extends EventoDeportivo {
    private ArrayList<Equipo> equipos;

    public TorneoDeFutbol(String nombre, LocalDateTime fecha, String lugar) {
        super(nombre, fecha, lugar);
        equipos = new ArrayList<Equipo>();
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    @Override
    public ArrayList<Participante> obtenerGanador() {
        int numMayorPuntos = 0;
        int pos = 0;
        for (int i = 0; i < equipos.size(); i++) {
            if (equipos.get(i).getPuntos() > numMayorPuntos) {
                numMayorPuntos = equipos.get(i).getPuntos();
                pos = i;
            }
        }
        ArrayList<Participante> participantes = equipos.get(pos).getJugadores();
        return participantes;
    }

    public boolean inscribirEquipo(Equipo e) {
        if (equipos.add(e)) {
            return true;
        }
        return false;

    }

}
