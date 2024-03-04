package Eventos_Deportivos.Pruebas;

import Eventos_Deportivos.clases.Equipo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Prueba6 {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void main() {

        Equipo eq1 = new Equipo("Sevilla FC", 38);
        Equipo eq2 = new Equipo("Málaga FC", 40);
        Equipo eq3 = new Equipo("Huelva RD", 39);
        Equipo eq4 = new Equipo("Cádiz CF", 45);

        System.out.println("\n" + "<<<<<<<<<<<<< Información equipos >>>>>>>>>>>>>>" + "\n");
        System.out.println(eq1.toString());
        System.out.println(eq2.toString());
        System.out.println(eq3.toString());
        System.out.println(eq4.toString());
    }
}