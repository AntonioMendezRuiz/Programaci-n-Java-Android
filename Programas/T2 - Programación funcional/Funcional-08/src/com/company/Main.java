package com.company;

import java.util.Scanner;

public class Main
{
    //Escribe una función que nos calcule el “mcd” de dos números.

    public static  int mcd (int a, int b)
    {
        int i;
        int max = 0;

        for (i = a; i >= 1; i--)
        {
            if (a % i == 0 && b % i == 0)
            {
                max = i;
                i = 0;
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe dos números");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.println(mcd(num1,num2));

    }
}
