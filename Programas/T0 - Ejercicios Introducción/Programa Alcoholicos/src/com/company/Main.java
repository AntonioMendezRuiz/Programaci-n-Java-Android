package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int edad;
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuantos años tienes?");

        edad = sc.nextInt();

        if (edad <= 17)
        {
            System.out.println("Tesqui ya pare, tu no puede beber");
        }
        else
        {
            System.out.println("¿Te lo pongo cargao o ere una maricona?");
        }


    }
}
