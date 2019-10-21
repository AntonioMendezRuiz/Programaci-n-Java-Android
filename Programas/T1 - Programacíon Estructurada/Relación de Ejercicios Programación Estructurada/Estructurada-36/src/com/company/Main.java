package com.company;

public class Main
{
    //Escribe un programa que nos escriba los 10 primeros números que no sean múltiplos ni
    //de 2 ni de 3.
    public static void main(String[] args)
    {
	    int i = 0, j = 0;

	    while (i < 10)
        {
            j = j + 1;

            if((j % 2 != 0) && (j % 3 != 0))
            {
                System.out.println(j);
                i++;
            }
        }
    }
}
