package Eventos_Deportivos;

import Eventos_Deportivos.clases.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //  Eventos Deportivos

        Carrera edCarrera = new Carrera("Desafío en Las Nubes",
                LocalDateTime.of(2024, 2, 16, 15, 0),
                "Xicotepec de Juárez", 3500.0);
        TorneoDeFutbol edTorneoFutbol = new TorneoDeFutbol("Campeonato Regional Sur",
                LocalDateTime.of(1915, 11, 15, 17, 30),
                "Andalucía");

        //  Equipos
        Equipo eq1 = new Equipo("Sevilla", 38);
        Equipo eq2 = new Equipo("Málaga", 40);

        //  Participantes
        Participante p1 = new Participante("231243A", "Jose", "Pérez", 24);
        Participante p2 = new Participante("4325425A", "Luis", "Ramírez", 40);
        Participante p3 = new Participante("4323243245A", "Jorge", "Sánchez", 32);

        edCarrera.inscribirParticipante(p1);
        edTorneoFutbol.inscribirEquipo(eq1);
        edTorneoFutbol.inscribirEquipo(eq2);


        Scanner scan = new Scanner(System.in);
        int boton = 0;
        while (boton != 9) {
            System.out.println("""
                                        
                    1.  Añadir jugador.
                    2.  Eliminar jugador.
                    3.  Mostrar información de los participantes.
                    4.  Mostrar información de los equipos
                                        
                                        
                    """);
            boton = scan.nextInt();

            switch (boton) {
                case 1:
                    eq1.anadirJugador(p1);
                    eq2.anadirJugador(p2);
                    eq2.anadirJugador(p3);
                    break;
                case 2:
                    eq2.eliminarJugador(p3);
                    break;
                case 3:
                    System.out.println(p1.toString());
                    System.out.println(p2.toString());
                    System.out.println(p3.toString());
                    break;
                case 4:
                    System.out.println(eq1.toString());
                    System.out.println(eq2.toString());
                case 5:

            }
        }



/*
        eq1.anadirJugador(p2);
        eq2.anadirJugador(p3);


        edCarrera.inscribirParticipante(p1);
        edTorneoFutbol.inscribirEquipo(eq1);
        edTorneoFutbol.inscribirEquipo(eq2);


        //  Añadir jugadores
        if (eq1.anadirJugador(p3)) {
            System.out.println("jugador añadido correctamente");
        }
        //  Eliminar jugadores
        if (eq1.eliminarJugador(p2)) {
            System.out.println("jugador eliminado correctamente");
        }


        //  Mostrar informacion de participantes
        p1.toString();
        p2.toString();
        p3.toString();

        //  Mostrar informacion de equipos
        eq1.toString();

        //  Mostrar informacion del ganador del Evento
        edTorneoFutbol.obtenerGanador().toString();
        edCarrera.obtenerGanador().toString();


        ArrayList<Equipo> equipos = edTorneoFutbol.getEquipos();
        while (equipos.size() > 0) {
            int pos = 0;
            int maximoPuntos = 0;
            for (int i = 0; i < equipos.size(); i++) {
                if (equipos.get(i).getPuntos() > maximoPuntos) {
                    maximoPuntos = equipos.get(i).getPuntos();
                    pos = i;
                }
            }
            equipos.get(pos).toString();
            equipos.remove(pos);
        }
        */

    }
}
