package com.company;

import java.util.Scanner;

public class Main
{
    //Escribe una función “resolucionCamara” a la que le pasas el número de MegaPixels
    //que tiene una cámara digital (puede ser un double) y nos dice cuál es la resolución
    //máxima de las fotos que hace la cámara. Como no podemos devolver dos valores (la
    //altura y la anchura de la imagen), los escribiremos por pantalla.

    public static void resolucionCamara (double a)
    {
        double pixel, x, y;

         pixel = a * 1000000;

        //x * y = a;
        //x = (4 * y )/ 3;
        //y * (4 * y) / 3 = a;
        //y ^ 2 = (3 * a) / 4;

        y = Math.sqrt((3 * pixel)/ 4);
        System.out.println("La anchura es "+ y);

        x = pixel / (Math.sqrt((3 * pixel)/ 4));
        System.out.println("La altura es " + x);

    }
    public static void main(String[] args)
    {
        double pixel;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce cuando MegaPíxeles tiene la cámara");
        pixel = sc.nextDouble();

        while (pixel <= 0)
        {
            System.out.println("Tiene que ser un número positivo mayor que cero. Prueba otra vez.");
            pixel = sc.nextDouble();
        }
        resolucionCamara(pixel);

    }
}
