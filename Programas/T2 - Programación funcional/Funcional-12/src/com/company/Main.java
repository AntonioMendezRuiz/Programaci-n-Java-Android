package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main
{
    //Escribe una función “pulgadasACentimetros” a la que le pases un valor en pulgadas (de
    //tipo double) y te devuelva el valor en centímetros. Haz también la función
    //“centímetrosAPulgadas”.

    public static double pulgadasACentimetro (int a)
    {
        double conv;

        conv = a * 2.54;

        return conv;
    }

    public static double centimetrosAPulgadas (int a)
    {
        double conv;

        conv = a * 0.393701;

        return conv;
    }
    public static void main(String[] args)
    {
        int x;
        String medidas;
        Scanner sc = new Scanner(System.in);

        System.out.println("Elige un tipo de parámetro para introducir (centímetros/pulgadas)");
        medidas = sc.next();

        System.out.println("Introduce el valor");
        x = sc.nextInt();

        if (medidas.equals("centimetros"))
        {
            System.out.println("Su valor en pulgadas es "+ centimetrosAPulgadas(x) + " pulgadas" );
        }
        else
        {
            System.out.println("Su valor en centímetros es "+ pulgadasACentimetro(x) + " centímetros" );
        }
    }
}
