package com.company;

public class Main
{
    //Calcular la suma de todos los números pares entre 1 y 1000. Es decir, 2 + 4 + 6 + ... + 998
    //+ 1000.

    public static void main(String[] args)
    {
        int cont = 1, pares = 0;

        while (cont <= 500)
        {
            pares = cont*(cont + 1);
            cont++;
        }
        System.out.println(pares);
    }
}
