package com.company;

import java.util.Scanner;

public class Main {

    //Leer tres números por teclado, X, Y y Z, y decidir si están ordenados de menor a mayor.

    public static void main(String[] args)
    {
        int x, y, z;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime 3 números y te digo si son consecutivos");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        if((y == x + 1) && (z == y + 1))
        {
            System.out.println("Los números son consecutivos");
        }
        else
        {
            System.out.println("Los números no son consecutivos");
        }
    }
}