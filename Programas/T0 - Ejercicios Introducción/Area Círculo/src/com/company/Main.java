package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double  radio;
        double area;
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuanto vale el radio?");

        radio = sc.nextDouble();
        area = Math.PI * radio * radio;

        System.out.println("El area del círculo es " + area);
    }
}
