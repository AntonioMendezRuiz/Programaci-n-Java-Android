package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        MusicaDB musicaDB = new MusicaDB("192.168.60.130", "musica", "usuario", "usuario");
        ClasificaMP3 mp3 = new ClasificaMP3(musicaDB);

        int opciones;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menú:");
        System.out.println("------------------------------------");
        System.out.println("1. Nueva Cancion");
        System.out.println("2. Busca canciones");
        System.out.println("3. Busca canciones recursivamente");
        System.out.println("4. Lista de reproduccion");
        System.out.println("5. Lista de reproduccion aleatoria");
        System.out.println("6. Lista de reproduccion por artista");
        System.out.println("7. Lista de reproduccion por estilo");
        System.out.println("8. Lista de reproduccion por estrellas");
        System.out.println("9. Lista de reproduccion por año");
        opciones = sc.nextInt();
        switch (opciones)
        {
            case 1:
            {
                Scanner scn = new Scanner(System.in);
                System.out.println("Ruta de la cancion: ");
                String ruta = scn.nextLine();
                mp3.nuevaCancion(ruta);
            }
            break;
            case 2:
            {
                Scanner scn = new Scanner(System.in);
                System.out.println("Ruta del directorio de musica: ");
                String ruta = scn.nextLine();
                mp3.buscaCanciones(ruta);
            }
            break;
            case 3:
            {
                Scanner scn = new Scanner(System.in);
                System.out.println("Ruta del directorio de musica: ");
                String ruta = scn.nextLine();
                mp3.buscaCancionesRecursivo(ruta);
            }
            break;
            case 4:
            {
                Scanner scn = new Scanner(System.in);
                System.out.println("Ruta y nombre del fichero: ");
                String ruta = scn.nextLine();
                mp3.generaListaReproduccion(ruta);
            }
            break;
            case 5:
            {
                Scanner scn = new Scanner(System.in);
                System.out.println("Ruta y nombre del fichero: ");
                String ruta = scn.nextLine();
                mp3.generaListaReproduccionAleatoria(ruta);
            }
            break;
            case 6:
            {
                Scanner scn = new Scanner(System.in);
                System.out.println("Ruta y nombre del fichero: ");
                String ruta = scn.nextLine();
                System.out.println("Artista: ");
                String artista = scn.nextLine();
                System.out.println("Aleatorio: ");
                boolean aleatorio = scn.nextBoolean();
                mp3.generaListaReproduccionArtista(ruta, artista, aleatorio);
            }
            break;
            case 7:
            {
                Scanner scn = new Scanner(System.in);
                System.out.println("Ruta y nombre del fichero: ");
                String ruta = scn.nextLine();
                System.out.println("Estilo: ");
                String estilo = scn.nextLine();
                System.out.println("Aleatorio: ");
                boolean aleatorio = scn.nextBoolean();
                mp3.generaListaReproduccionEstilo(ruta, estilo, aleatorio);
            }
            break;
            case 8:
            {
                Scanner scn = new Scanner(System.in);
                System.out.println("Ruta y nombre del fichero: ");
                String ruta = scn.nextLine();
                System.out.println("Estrelas(min y max): ");
                int min = scn.nextInt();
                int max = scn.nextInt();
                System.out.println("Aleatorio: ");
                boolean aleatorio = scn.nextBoolean();
                mp3.generaListaReproduccionEstrellas(ruta, min, max, aleatorio);
            }
            break;
            case 9:
            {
                Scanner scn = new Scanner(System.in);
                System.out.println("Ruta y nombre del fichero: ");
                String ruta = scn.nextLine();
                System.out.println("Años(min y max): ");
                int min = scn.nextInt();
                int max = scn.nextInt();
                System.out.println("Aleatorio: ");
                boolean aleatorio = scn.nextBoolean();
                mp3.generaListaReproduccionAnno(ruta, min, max, aleatorio);
            }
            break;
        }

    }
}
