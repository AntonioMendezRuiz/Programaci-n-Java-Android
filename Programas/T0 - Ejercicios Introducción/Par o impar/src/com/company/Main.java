package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int num;
	Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero");
        num = sc.nextInt();

        if (num % 2 == 0)
        {
            System.out.println("El número es par");
        }
        else
            System.out.println("El numero es impar");
    }
}
