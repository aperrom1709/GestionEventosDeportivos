package Eventos_Deportivos.Pruebas;

import Eventos_Deportivos.clases.Equipo;
import Eventos_Deportivos.clases.Participante;
import Eventos_Deportivos.clases.ParticipanteCarrera;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Prueba4 {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void main() {
        ParticipanteCarrera pc1 = new ParticipanteCarrera("27183928L", "Jose", "Pérez", 24, 15000.00);
        ParticipanteCarrera pc2 = new ParticipanteCarrera("27384028P", "Carlos", "Sainz", 30, 20000.00);
        Participante p1 = new Participante("45293784D", "Francisco", "López", 27);
        Participante p2 = new Participante("27364781H", "Luis", "Ramírez", 40);
        Participante p3 = new Participante("29102781F", "Jorge", "Sánchez", 32);
        Participante p4 = new Participante("34583029J", "Jorge", "Sánchez", 42);
        Equipo eq1 = new Equipo("Sevilla FC", 38);
        Equipo eq2 = new Equipo("Málaga FC", 40);
        Equipo eq3 = new Equipo("Huelva RD", 39);
        Equipo eq4 = new Equipo("Cádiz CF", 45);


        eq1.anadirJugador(p1);
        eq1.anadirJugador(p2);
        eq2.anadirJugador(p3);
        eq2.anadirJugador(p4);

        if (eq2.eliminarJugador(p3)) {
            System.out.println("jugador eliminado correctamente");
        }

    }
}