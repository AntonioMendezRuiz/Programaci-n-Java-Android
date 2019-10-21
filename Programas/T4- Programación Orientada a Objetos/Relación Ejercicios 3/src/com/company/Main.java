package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int jugar, elige;
        boolean gana1 = false, gana2 = false;
        TresEnRaya partida = new TresEnRaya();

        System.out.println("--------------Juego del Tres en Raya--------------");
        System.out.println("(1) jugador vs IA || (2) jugador vs jugador");
        elige = sc.nextInt();

        if (elige == 2)
        {
            partida.iniciar();
            partida.dibujaTablero();
            while (!gana1 && !gana2)
            {
                System.out.println("Juega el jugador 1. Elige posición.");
                System.out.println();
                jugar = sc.nextInt();
                partida.mueveJugador1(jugar);
                if (partida.ganaJugador1())
                {
                    gana1 = true;

                    System.out.println("Gana jugador 1");
                    partida.dibujaTablero();
                    break;
                }
                partida.dibujaTablero();
                System.out.println();

                System.out.println("Juega el jugador 2. Elige posición.");
                System.out.println();
                jugar = sc.nextInt();
                partida.mueveJugador2(jugar);
                if (partida.ganaJugador2())
                {
                    gana2 = true;
                }
                partida.dibujaTablero();
            }
        }

        if (elige == 1)
        {
            partida.iniciar();
            partida.dibujaTablero();
            while (!gana1 && !gana2)
            {
                System.out.println("Juega el jugador 1. Elige posición.");
                System.out.println();
                jugar = sc.nextInt();
                partida.mueveJugador1(jugar);
                if (partida.ganaJugador1())
                {
                    gana1 = true;

                    System.out.println("Gana jugador 1");
                    partida.dibujaTablero();
                    break;
                }
                partida.dibujaTablero();
                System.out.println();

                System.out.println("Juega el jugador 2. Elige posición.");
                System.out.println();
                partida.mueveOrdenador2();
                if (partida.ganaJugador2())
                {
                    gana2 = true;
                }
                partida.dibujaTablero();
            }
        }
    }
}
