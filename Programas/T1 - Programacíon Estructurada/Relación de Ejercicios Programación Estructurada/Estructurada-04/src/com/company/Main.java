package com.company;

import java.util.Scanner;

public class Main {

    //Leer tres números por teclado, X, Y y Z, y decidir si están ordenados de menor a mayor.

    public static void main(String[] args)
    {
        int x, y, z;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime 3 números y te digo si están ordenados de menor a mayor");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        if((x < y) && (y < z))
        {
            System.out.println("Los números están ordenados");
        }
        else
        {
            System.out.println("Los números no están ordenados");
        }
    }
}