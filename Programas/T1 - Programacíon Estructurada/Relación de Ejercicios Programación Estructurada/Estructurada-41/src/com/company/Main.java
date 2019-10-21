package com.company;

public class Main
{
    //Generalizar el algoritmo anterior para averiguar todos los números primos que existen
    //entre 2 y 1000.

    public static void main(String[] args)
    {
        int  i, j;
        boolean primo;

        for(i = 2; i <= 1000; i++)
        {
            primo = true;

           for(j = 2; j < i; j++)
           {
            if(i % j == 0)
            {
                primo = false;
            }
           }
           if(primo)
           {
               System.out.println(i);
           }
        }
    }
}


