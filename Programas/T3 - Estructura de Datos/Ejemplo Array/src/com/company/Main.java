package com.company;

public class Main {

    public static void main(String[] args)
    {
	    // Definición de una variable de tipo array
    int[] arrayEnteros;
    double[] arrayDoubles;
    char [] arrayChars;
    boolean [] arrayBooleanos;

        // Creación/Inicialización de un array vacío

        arrayEnteros = new int[10];
        arrayDoubles = new double[5];
        arrayChars = new char[15];
        arrayBooleanos = new boolean[100];


        // Normalemente esto se hace en un solo paso

        int[] a = new int[5];

        // Guardando valores en un array

        a[0] = 10;
        a[1] = 15;
        a[2] = 20;
        a[3] = 25;
        a[4] = 30;

        // Leyendo calores de un array

        System.out.println(a[4]);

        // Recorriendo un array con un bucle (for)

        int i;

        for(i = 0; i < 5; i++)
        {
            System.out.println(a[i]);
        }

    }
    //Funciones con arrays
        public static void EscribeArrayChungo (int[] a)
        {
            int i;

            for(i = 0; i < a.length; i++)
            {
                System.out.println(a[i]);
            }
        }

        public static void ModificaArray(int[]a)
        {
            a[0] = -1;
        }
}
