package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double numero;
	    Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero");

        numero = sc.nextDouble();

        if (numero <= 0)
        {
            if (numero == 0)
                System.out.println("El numero 0 no es positivo ni negativo");
            else
                System.out.println("El numero es negativo");
        }
        else
            System.out.println("El numero es Positivo");
    }
}
