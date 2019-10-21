package com.company;

import java.util.Scanner;

public class Main {

    //Leídos dos números por teclado, A y B, calcular la resta del mayor menos el menor. Por
    //ejemplo, si A = 8 y B = 3, el resultado debe ser A – B, es decir, 5. Pero si A = 4 y B = 7, el
    //resultado debe ser B – A, es decir, 3.

    public static void main(String[] args) {

        int numero1, numero2, resta;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el primer número");
        numero1 = sc.nextInt();

        System.out.println("Dime el segundo número");
        numero2 = sc.nextInt();

        if (numero1 > numero2)
        {
            resta = numero1 - numero2;

            System.out.println("La resta de los numeros es " + resta);
        }
        else
        {
            resta = numero2 - numero1;

            System.out.println("La resta de los numeros es " + resta);

        }
    }
}
