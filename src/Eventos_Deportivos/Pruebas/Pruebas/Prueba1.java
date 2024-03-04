package Eventos_Deportivos.Pruebas;

import Eventos_Deportivos.clases.Carrera;
import Eventos_Deportivos.clases.TorneoDeFutbol;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class Prueba1 {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void main() {
        Carrera edCarrera = new Carrera("Desafío en Las Nubes",
                LocalDateTime.of(2024, 2, 16, 15, 0),
                "Xicotepec de Juárez", 3500.0);
        TorneoDeFutbol edTorneoFutbol = new TorneoDeFutbol("Campeonato Regional Sur",
                LocalDateTime.of(1915, 11, 15, 17, 30),
                "Andalucía");
    }
}