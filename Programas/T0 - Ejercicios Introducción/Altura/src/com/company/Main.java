package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int altura;
        String genero;

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Eres hombre o mujer?");
        genero = sc.next();

        System.out.println("¿Cuanto mides?");
        altura = sc.nextInt();

        if (genero.equals("hombre")) // genero == "hombre" no funciona en java
        {
            if (altura < 174)
            {
                System.out.println("Eres bajito");
            }
            else
                System.out.println("Eres alto");
        }
        else
        {
            if (altura < 163)
            {
                System.out.println("Eres bajita");
            }
            else
                System.out.println("Eres alta");
        }

    }
}
