package com.company;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        CineDB c = new CineDB("cine.db");
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("MENU");
        System.out.println("1- Inserta película.");
        System.out.println("2- Inserta Actor.");
        System.out.println("3- Busca Actor.");
        System.out.println("4- Busca Películas.");
        System.out.println("5- Lista de películas.");
        System.out.println("6- Lista de Actores.");
        System.out.println("7- Lista de películas por actores.");
        System.out.println("8- Lista de actores por películas.");


        System.out.println("Elige una opción");

        opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                String nombre = "";
                int anno;
                double  valoracion;
                boolean oscar = false;
                String option;

                Scanner m = new Scanner(System.in);
                System.out.println("Inserta nombre: ");
                nombre = m.next();

                System.out.println("Año: ");
                anno = m.nextInt();

                System.out.println("¿Tiene oscar?(SI/NO): ");
                option = m.next();
                if (option.equals("SI"))
                    oscar = true;

                System.out.println("Valoración: ");
                valoracion = m.nextDouble();


                c.insertaPelicula(nombre, anno, oscar, valoracion);
            }
            break;

            case 2:
            {
                String nombre = "";
                LocalDate fecha;
                int dia, mes, anno;

                Scanner m = new Scanner(System.in);
                System.out.println("Inserta nombre: ");
                nombre = m.next();

                System.out.println("FechaNacimiento: ");
                dia = m.nextInt();
                mes = m.nextInt();
                anno = m.nextInt();
                fecha = LocalDate.of(anno, mes, dia);

                c.insertaActor(nombre, fecha);
            }
            break;

            case 3:
            {
                String nombre = "";

                Scanner m = new Scanner(System.in);
                System.out.println("Introduce el nombre a buscar: ");
                nombre = m.next();

                c.buscaActor(nombre);
            }
            break;

            case 4:
            {
                String nombre = "";

                Scanner m = new Scanner(System.in);
                System.out.println("Introduce el nombre a buscar: ");
                nombre = m.next();

                c.buscaPelicula(nombre);
            }
            break;

            case 5:
            {
                c.listadoPeliculas();
            }
            break;

            case 6:
            {
                c.listadoActores();
            }
            break;

            case 7:
            {
                Scanner scan = new Scanner(System.in);
                System.out.println("Titulo de la película: ");
                String titulo = scan.nextLine();
                Pelicula p = c.datosPelicula(c.buscaPelicula(titulo));
                System.out.println(p);
            }
            break;
            case 8:
            {
                Scanner scan = new Scanner(System.in);
                System.out.println("Titulo de la película: ");
                String titulo = scan.nextLine();
                System.out.println(c.listadoActoresPorPelicula(c.buscaPelicula(titulo)));
            }
            break;
        }
    }
}
