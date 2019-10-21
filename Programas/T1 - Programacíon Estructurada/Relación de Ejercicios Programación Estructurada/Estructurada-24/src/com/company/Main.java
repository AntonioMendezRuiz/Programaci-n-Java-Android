package com.company;

public class Main {
    // Escribe un programa que nos escriba los números impares comprendidos entre 1 y 10.
    public static void main(String[] args)
    {
	    int i;

	    for (i = 1; i <= 10; i++)
        {
            if (i % 2 != 0)
            {
                System.out.println(i);
            }
        }
    }
}
