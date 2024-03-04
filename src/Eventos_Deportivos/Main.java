package Eventos_Deportivos;

import Eventos_Deportivos.clases.*;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //  Eventos Deportivos

        EventoDeportivo edCarrera = new Carrera("Desafío en Las Nubes",
                LocalDateTime.of(2024, 2, 16, 15, 0),
                "Xicotepec de Juárez", 3500.0);
        EventoDeportivo edTorneoFutbol = new TorneoDeFutbol("Campeonato Regional Sur",
                LocalDateTime.of(1915, 11, 15, 17, 30),
                "Andalucia");

        //  Participantes

        Participante p1 = new Participante("", "", "","" );


        //  Menú
        System.out.println("""
                
                1.  Añadir jugador
                2.  Eliminar jugador
                
                
                """);

        int boton = scan.nextInt();

        switch (boton){
            case 1:

                break;
            case 2:
                break;
        }

    }
}
