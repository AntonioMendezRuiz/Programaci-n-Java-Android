package com.company;

import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int opcion;
        Baraja jugador;
        String respuesta;

        System.out.println("--------------Juego de la 7 y media--------------");
        System.out.println("¿Quieres baraja doble(2) o baraja simple(1)");
        opcion = sc.nextInt();

        while ((opcion != 1) && (opcion != 2))
        {
            System.out.println("La opción introducida no es válida. Vuelve a intentarlo.");
            opcion = sc.nextInt();
        }

        jugador = new Baraja(opcion, true);



            double valor = 0;

            Carta a = jugador.robar();
            valor = valor + a.valor7ymedia(a.getNumero());
            System.out.println("Tu primera carta es: " + a.nombreCarta());
            System.out.println("¿Quieres seguir robando?(Y/N)");
            respuesta = sc.next();

            while (respuesta.equals("Y"))
            {
                a = jugador.robar();
                valor = valor + a.valor7ymedia(a.getNumero());
                System.out.println("Tu carta es: " + a.nombreCarta());
                if (valor > 7.5)
                {
                    System.out.println("Te has pasado.");
                    System.out.println("Tu puntuación es: " + valor);
                    System.out.println("Fin del juego.");
                    break;
                }
                System.out.println("¿Quieres seguir robando?(Y/N)");
                respuesta = sc.next();
            }

            while ((!respuesta.equals("Y")) && (!respuesta.equals("N")))
            {
                System.out.println("La respues no es correct. Vuelve a introducirlo.");

                a = jugador.robar();
                valor = valor + a.valor7ymedia(a.getNumero());
                System.out.println("Tu primera carta es: " + a.nombreCarta());
                System.out.println("¿Quieres seguir robando?(Y/N)");
                respuesta = sc.next();

                while (respuesta.equals("Y"))
                {
                    a = jugador.robar();
                    valor = valor + a.valor7ymedia(a.getNumero());
                    System.out.println("Tu carta es: " + a.nombreCarta());
                    if (valor > 7.5)
                    {
                        System.out.println("Te has pasado.");
                        System.out.println("Tu puntuación es: " + valor);
                        System.out.println("Fin del juego.");
                        break;
                    }
                    System.out.println("¿Quieres seguir robando?(Y/N)");
                    respuesta = sc.next();
                }
            }

            if (respuesta.equals("N"))
            {
                System.out.println("Te has plantado. Tu puntuación es: " + valor);
            }

        System.out.println("--------------Ahora me toca a mi--------------");

             double IA = 0;
             Carta b = jugador.robar();
            IA = IA + b.valor7ymedia(b.getNumero());
             System.out.println(b.nombreCarta());

            while((IA < valor) && !jugador.vacio())
            {
                b = jugador.robar();
                IA = IA + b.valor7ymedia(b.getNumero());
                if(((IA < 7.5) && (valor > IA)))
                {
                    b = jugador.robar();
                    IA = IA + b.valor7ymedia(b.getNumero());
                    System.out.println(b.nombreCarta());
                    System.out.println("Me planto. Yo gano.");
                    System.out.println("Mi puntuación es: " + IA);
                    break;
                }
                if (valor < 7.5 && IA > 7.5)
                {
                    System.out.println("Mi puntuación es: " + IA);
                    System.out.println("Has ganado");
                }
            }
    }
}
