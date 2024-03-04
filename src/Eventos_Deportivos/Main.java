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
        Equipo eq1 = new Equipo("Sevilla FC", 38);
        Equipo eq2 = new Equipo("Málaga FC", 40);
        Equipo eq3 = new Equipo("Huelva RD", 39);
        Equipo eq4 = new Equipo("Cádiz CF", 45);

        //  Participantes
        ParticipanteCarrera pc1 = new ParticipanteCarrera("27183928L", "Jose", "Pérez", 24, 15000.00);
        ParticipanteCarrera pc2 = new ParticipanteCarrera("25384028P", "Carlos", "Sainz", 30, 20000.00);
        ParticipanteCarrera pc3 = new ParticipanteCarrera("74850298D", "Rubén", "Díaz", 45, 60000.00);
        ParticipanteCarrera pc4 = new ParticipanteCarrera("94743892Q", "Óscar", "Núñez", 34, 64200.00);
        ParticipanteCarrera pc5 = new ParticipanteCarrera("47394058U", "Ezequiel", "Ávila", 36, 30090.00);
        Participante p1 = new Participante("45293784D", "Francisco", "López", 27);
        Participante p2 = new Participante("27364781H", "Luis", "Ramírez", 40);
        Participante p3 = new Participante("29102781F", "Jorge", "Sánchez", 42);
        Participante p4 = new Participante("34583029J", "Jorge", "Sánchez", 42);    //  La que va a ser eliminada por su nombre y apellidos
        Participante p5 = new Participante("50483945H", "Kevin", "Pazo", 28);
        Participante p6 = new Participante("20483947H", "Lucas", "Alonso", 27);
        Participante p7 = new Participante("94739482H", "Leo", "Messi", 26);
        Participante p8 = new Participante("15895465H", "Sergio", "Ramos", 25);
        Participante p9 = new Participante("03948329H", "Antonio", "Rodríguez", 32);
        Participante p10 = new Participante("1374938H", "Vinicius", "Júnior", 23);
        Participante p11 = new Participante("5738219G", "Alberto", "Suárez", 33);
        Participante p12 = new Participante("5738219G", "Pablo", "Maldini", 45);

        //  Inscripción a cada evento
        edCarrera.inscribirParticipante(pc1);
        edCarrera.inscribirParticipante(pc2);
        edCarrera.inscribirParticipante(pc3);
        edCarrera.inscribirParticipante(pc4);
        edCarrera.inscribirParticipante(pc5);
        edTorneoFutbol.inscribirEquipo(eq1);
        edTorneoFutbol.inscribirEquipo(eq2);
        edTorneoFutbol.inscribirEquipo(eq3);
        edTorneoFutbol.inscribirEquipo(eq4);

        //  Los jugadores que pertenecen a un equipo
        eq1.anadirJugador(p1);
        eq1.anadirJugador(p2);
        eq2.anadirJugador(p3);
        eq2.anadirJugador(p4);
        eq3.anadirJugador(p5);
        eq3.anadirJugador(p6);
        eq4.anadirJugador(p7);
        eq4.anadirJugador(p8);

        eq2.anadirJugador(p9);
        eq1.anadirJugador(p10);
        eq3.anadirJugador(p11);
        eq4.anadirJugador(p12);

        //  Añadir jugadores
        if (eq2.anadirJugador(p2)) {
            System.out.println("jugador añadido correctamente");
        }
        //  Eliminar jugadores
        if (eq2.eliminarJugador(p3)) {
            System.out.println("jugador eliminado correctamente");
        }


        //  Mostrar informacion de participantes
        System.out.println("\n" + "<<<<<<<<<<<<< Información de los participantes >>>>>>>>>>>>>>" + "\n");

        System.out.println(pc1.toString());
        System.out.println(pc2.toString());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

        //  Mostrar informacion de equipos

        System.out.println("\n" + "<<<<<<<<<<<<< Información equipos >>>>>>>>>>>>>>" + "\n");
        System.out.println(eq1.toString());
        System.out.println(eq2.toString());
        System.out.println(eq3.toString());
        System.out.println(eq4.toString());

        //  Mostrar informacion del ganador del Evento

        System.out.println("\n" + "<<<<<<<<<<<<< Información del ganador del torneo de fútbol >>>>>>>>>>>>>>" + "\n");
        System.out.println(edTorneoFutbol.obtenerGanador().toString());

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
            System.out.println(equipos.get(pos).toString());
            equipos.remove(pos);
        }

        System.out.println("\n" + "<<<<<<<<<<<<< Información del ganador de la carrera >>>>>>>>>>>>>>" + "\n");

        System.out.println(edCarrera.obtenerGanador().toString());



    }
}
