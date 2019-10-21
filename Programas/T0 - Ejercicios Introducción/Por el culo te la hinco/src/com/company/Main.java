package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numero;
        int doble;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero y te digo el doble");

        numero = sc.nextInt();

        if (numero == 5)
        {
            System.out.println("Por el culo de la hinco");
        }
        else
        {
            doble = numero*2;
            System.out.println("El doble del numero es " + doble);
        }
    }
}
