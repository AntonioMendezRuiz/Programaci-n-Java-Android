package com.company;

public class Main {

    //Escribe un programa que nos escriba los números impares comprendidos entre 1 y 10.

    public static void main(String[] args)
    {
	    int i = 1;

	    while (i < 10)
        {
            if (i % 2 != 0)
            {
                System.out.println(i);
            }
         i++;
        }
    }
}
