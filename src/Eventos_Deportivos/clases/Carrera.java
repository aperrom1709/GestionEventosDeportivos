package Eventos_Deportivos.clases;

import java.security.PublicKey;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Carrera extends EventoDeportivo {
    private double distancia;


    public Carrera(String nombre, LocalDateTime fecha, String lugar,double distancia) {
        super(nombre, fecha, lugar);
        this.distancia = distancia;
    }

    @Override
    public ArrayList<Participante> obtenerGanador() {
        double t = 1000;
        int aux = 0;
        ArrayList<Participante> participantes = getParticipantes();
        for (int i = 0; i < participantes.size(); i++) {
            if (participantes.get(i) instanceof ParticipanteCarrera) {
                if (((ParticipanteCarrera) participantes.get(i)).getTiempo() < t) {
                    t = ((ParticipanteCarrera) participantes.get(i)).getTiempo();
                    aux = i;
                }
            }
        }

        ArrayList<Participante> part = new ArrayList<Participante>();
        part.add(participantes.get(aux));
        return part;
    }
}
