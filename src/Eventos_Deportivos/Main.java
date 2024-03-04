package Eventos_Deportivos;

import Eventos_Deportivos.clases.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //  Eventos Deportivos

        Carrera edCarrera = new Carrera("Desafío en Las Nubes",
                LocalDateTime.of(2024, 2, 16, 15, 0),
                "Xicotepec de Juárez", 3500.0);
        TorneoDeFutbol edTorneoFutbol = new TorneoDeFutbol("Campeonato Regional Sur",
                LocalDateTime.of(1915, 11, 15, 17, 30),
                "Andalucia");

        //  Participantes
        Equipo eq1 = new Equipo("Sevilla", 38);
        Equipo eq2 = new Equipo("Malaga", 40);

        Participante p1 = new Participante("231243A", "Jose", "Peerez", 24);
        Participante p2 = new Participante("4325425A", "Luis", "Ramires", 40);
        Participante p3 = new Participante("4323243245A", "Jorge", "Sanchez", 32);


        eq1.anadirJugador(p2);


        edCarrera.inscribirParticipante(p1);
        edTorneoFutbol.inscribirEquipo(eq1);
        edTorneoFutbol.inscribirEquipo(eq2);
        if (eq1.anadirJugador(p3)) {
            System.out.println("jugador añadido correctamente");
        }
        if (eq1.eliminarJugador(p3)) {
            System.out.println("jugador eliminado correctamente");
        }


        //  Mostrar informacion
        p1.toString();
        p2.toString();
        p3.toString();

        eq1.toString();

        edTorneoFutbol.obtenerGanador().toString();
        edCarrera.obtenerGanador().toString();


        ArrayList<Equipo> equipos = edTorneoFutbol.getEquipos();
        while (equipos.size() > 0) {
            int pos = 0;
            int maximoPuntos = 0;
            for (int i = 0; i < equipos.size(); i++) {
                if (equipos.get(i).getPuntos() > maximoPuntos){
                    maximoPuntos = equipos.get(i).getPuntos();
                    pos = i;
                }
            }
            equipos.get(pos).toString();
            equipos.remove(pos);
        }

    }
}
