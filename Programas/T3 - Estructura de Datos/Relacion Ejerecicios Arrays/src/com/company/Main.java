package com.company;

import java.util.Scanner;

public class Main
{
    // 1. Escribe una función “escribeArray5” a la que le pasamos un array de tipo entero de
    //cinco elementos y lo escribe por pantalla de la siguiente forma: [23, 43, 1, -3, 6]

    public static void escribeArray5(int[] a)
    {
        int i;

        System.out.print("[" + a[0]);

        for (i = 1; i < 5; i++)
        {
            System.out.print(", " + a[i]);
        }
        System.out.print("]");
    }

    // 2. Escribe una función “escribeArray” a la que le pasamos un array de enteros del tamaño
    //que sea y lo escribe por pantalla de la misma forma. Tendremos que usar la función
    //“length” para saber el tamaño del array desde dentro de la función.

    public static void escribeArray(int[] a)
    {
        int i;

        System.out.print("[" + a[0]);

        for (i = 1; i < a.length; i++)
        {
            System.out.print(", " + a[i]);
        }
        System.out.println("]");

    }

    // 3. Escribe una función “leeArray5” que lea un array de enteros de 5 elementos. Habrá
    //que pasarle el array ya definido y él lo rellenará pidiéndole los valores al usuario por
    //consola.

    public static void leeArray5(int[] a)
    {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Rellena los datos");

        for (i = 0; i < 5; i++)
        {
            System.out.println("Elemento " + (i + 1));
            a[i] = sc.nextInt();
        }

        escribeArray(a);

    }

    // 4.Escribe una función “leeArray” que lea un array de enteros de cualquier tamaño. El
    //array lo crearemos fuera de la función y dentro de la función usaremos la función
    //“length” para saber cuál es el tamaño y cuántos datos debemos leer.

    public static int leeArray(int[] a)
    {
        int i, cont = 0;

        for (i = 0; i < a.length; i++)
        {
            cont++;
        }

        return cont;
    }

    // 5.Escribe una función “ponCeros5” que modifique el contenido de un array de enteros
    //de cinco elementos y ponga en todas las posiciones un 0

    public static void ponCeros5(int[] a)
    {
        int i;

        for (i = 0; i < 5; i++)
        {
            a[i] = 0;
        }

        //escribeArray5(a);
    }

    // 6.Escribe una función “ponCero” que haga lo mismo para un array de enteros de
    //cualquier tamaño.

    public static void ponCeros(int[] a)
    {
        int i;

        for (i = 0; i < a.length; i++)
        {
            a[i] = 0;
        }

        //escribeArray(a);
    }

    // 7.Escribe una función “sumaArray5” que sume todas las posiciones de un array de
    //enteros de cinco elementos y nos devuelva el resultado.

    public static int sumaArray5(int[] a)
    {
        int i, suma = 0;


        for (i = 0; i < 5; i++)
        {
            suma = suma + a[i];
        }

        return suma;
    }

    // 8.Escriba una función “sumaArray” que haga lo mismo para un array de enteros de
    //cualquier tamaño.

    public static int sumaArray(int[] a)
    {
        int i, suma = 0;


        for (i = 0; i < a.length; i++)
        {
            suma = suma + a[i];
        }

        return suma;
    }

    // 9.Escribe una función “mediaArray5” que nos calcule el valor medio de los elementos de
    //un array de enteros de tamaño 5.

    public static double mediaArray5(int[] a)
    {
        double total;

        total = sumaArray5(a) / leeArray(a);

        return total;
    }

    // 10. Escribe una función “mediaArray” que haga lo mismo para un array de enteros de
    //cualquier tamaño.

    public static double mediaArray(int[] a)
    {
        double total;

        total = sumaArray(a) / leeArray(a);

        return total;
    }

    // 11.Escribe una función “rellenaEnOrden” que nos rellena un array de enteros con los
    //números desde el 1 en adelante (1, 2, 3, 4... hasta el tamaño del array).

    public static void rellenaEnOrden(int[] a)
    {
        int i, cont = 1;

        for (i = 0; i < a.length; i++)
        {
            a[i] = cont;
            cont++;
        }
    }

    // 12.Escribe una función “rellenaEnOrdenDesc” que nos rellena un array con los valores
    //siguientes: tamaño del array, tamaño del array-1, etc., 3, 2, 1.

    public static void rellenaEnOrdenDesc(int[] a)
    {
        int i;
        int cont = a.length;

        for (i = 0; i < a.length; i++)
        {
            a[i] = cont;
            cont = cont - 1;
        }
    }

    // 13.Escribe una función “rellenaAleatorio” a la que le pasamos un array de enteros y nos lo
    //rellena de valores aleatorios entre 1 y 10.

    public static void rellenaAleatorio(int[] a)
    {
        int i, num = (int) (Math.random() * 10 + 1);

        for (i = 0; i < a.length; i++)
        {
            a[i] = num;
        }
    }

    // 14. Escribe una función “estaOrdenado” a la que le pasas un array de enteros y te
    //devuelve un booleano que será verdadero si los elementos del array se encuentran en
    //orden ascendente

    public static boolean estaOrdenado(int[] a)
    {
        boolean ordenado = true;
        int i;

        for (i = 0; i < a.length - 1; i++)
        {
            if (a[i] > a[i + 1])
            {
                ordenado = false;
            }
        }
        return ordenado;
    }

    // 15.Escribe una función “numeroImpares” a la que le pasas un array de enteros y te
    //devuelve un entero que corresponde a la cantidad de números impares que tenemos
    //en el array.

    public static int numerosImpares(int[] a)
    {
        int cont = 0, i;

        for (i = 1; i <= a.length; i++)
        {
            if (i % 2 != 0)
            {
                cont++;
            }
        }

        return cont;
    }

    //16. Escribe una función “minArray” a la que le pasas un array y te devuelve el valor más
    //pequeño de los contenidos en dicho array.

    public static int minArray(int[] a)
    {
        int i, min = a[0];

        for (i = 1; i < a.length; i++)
        {
            if (a[i] < min)
            {
                min = a[i];
            }
        }
        return min;
    }

    // 17.Escribe una función “maxArray” que te devuelve el más grande.

    public static int maxArray(int[] a)
    {
        int i, max = a[0];

        for (i = 1; i < a.length; i++)
        {
            if (a[i] > max)
            {
                max = a[i];
            }
        }
        return max;
    }

    //18. Escribe una función “numeroAprobados” a la que se le pasa un array de enteros y,
    //suponiendo que son notas, nos devuelve el número de aprobados (valores entre 5 y
    //10).

    public static int numeroAprobados(int[] a)
    {
        int i, cont = 0;

        for (i = 0; i < a.length; i++)
        {
            if (a[i] >= 5 && a[i] <= 10)
            {
                cont++;
            }
        }
        return cont;
    }

    // 19. Escribe una función “porEncimaDe” a la que le pasamos un valor “limite” y nos
    //devuelve cuántos elementos del array son iguales o mayores que ese límite. Por
    //ejemplo, le pasamos el valor 10 y nos dice cuántos elementos son 10 o más.

    public static int porEncimaDe(int[] a, int lim)
    {
        int i, cont = 0;

        for (i = 0; i < a.length; i++)
        {
            if (a[i] >= lim)
            {
                cont++;
            }
        }
        return cont;
    }

    //20. Escribe una función “cuantosCeros” a la que le pasamos un array y nos devuelve un
    //entero que nos dice cuántos elementos tienen el valor 0.

    public static int cuantosCeros(int[] a)
    {
        int i, cont = 0;

        for (i = 0; i < a.length; i++)
        {
            if (a[i] == 0)
            {
                cont++;
            }
        }
        return cont;
    }

    // 21. Escribe una función “copiaArray” a la que le pasas dos arrays por parámetro (array1 y
    //array2, por ejemplo) del mismo tamaño (se debería comprobar dentro de la función).
    //La función copiara el contenido del primer array al segundo array.

    public static void copiaArray(int[] a, int[] b)
    {
        int i;

        if (a.length != b.length)
        {
            System.out.println("ERROR");
        } else
        {
            for (i = 0; i < a.length; i++)
            {
                b[i] = a[i];
            }
        }
    }

    // 22. Escribe una función “copiaArrayInvertido” a la que le pasas dos arrays por parámetro y
    //te copia el contenido del primer array al segundo array pero en orden inverso (Ej.: si el
    //primero es [5,6,7,8,9], en el segundo se copiará [9,8,7,6,5]).

    public static void copiaArrayInvertido(int[] a, int[] b)
    {
        int i, j = b.length - 1;

        if (a.length != b.length)
        {
            System.out.println("ERROR");
        } else
        {
            for (i = 0; i < a.length; i++)
            {
                b[j] = a[i];
                j--;
            }
        }
    }

    // 23. Escribe una función “sumaArrays” a la que le pasamos tres arrays. Los dos primeros
    //contendrán los datos que hay que sumar y en el tercero guardaremos el resultado (Ej.:
    //[1,2,3] + [8, 6, 8] = [9, 8, 11]).

    public static void sumaArrays (int[] a, int[] b, int[] c)
    {
        int i;


        if (a.length != b.length || a.length != c.length)
        {
            System.out.println("ERROR");
        } else
        {
            for (i = 0; i < a.length; i++)
            {
                c[i] = a[i] + b[i];
            }
        }
    }

    // 24. Escribe también las funciones “restaArrays”, “multiplicaArrays” y “divideArrays”.

    public static void restaArrays (int[] a, int[] b, int[] c)
    {
        int i;


        if (a.length != b.length || a.length != c.length)
        {
            System.out.println("ERROR");
        } else
        {
            for (i = 0; i < a.length; i++)
            {
                c[i] = a[i] - b[i];
            }
        }
    }

    public static void multiplicaArrays (int[] a, int[] b, int[] c)
    {
        int i;


        if (a.length != b.length || a.length != c.length)
        {
            System.out.println("ERROR");
        } else
        {
            for (i = 0; i < a.length; i++)
            {
                c[i] = a[i] * b[i];
            }
        }
    }

    public static void divideArrays (int[] a, int[] b, int[] c)
    {
        int i;


        if (a.length != b.length || a.length != c.length)
        {
            System.out.println("ERROR");
        } else
        {
            for (i = 0; i < a.length; i++)
            {
                c[i] = a[i] / b[i];
            }
        }
    }

    // 25. Escribe una función “invierteArray” a la que le pasamos un array de enteros y modifica
    //su contenido invirtiendo la posición de sus elementos (Ej.: [1,2,3] -> [3,2,1]).

    public static void invierteArray (int[] a)
    {
        int[] b = new int[a.length];

        copiaArrayInvertido(a, b);
        copiaArray(b, a);
    }

    // 26. Escribe una función “comparaArrays” a la que le pasamos dos arrays y nos devuelve un
    //boolean que será verdadero si los dos arrays tienen el mismo tamaño y contienen los
    //mismos datos.

    public static boolean comparaArrays (int[] a, int[] b)
    {
        int i;
        boolean comp = true;
        for(i = 0; i < a.length; i++)
        {
            if (a[i] != b[i])
            {
                comp = false;
            }
        }
        return comp;
    }

    //27. Escribe una función “ponNotasArray” a la que le pasamos dos arrays del mismo
    //tamaño. El primero será un array de reales (double) y contendrá las notas de los
    //alumnos. El segundo será un array de booleanos en el que deberemos escribir en cada
    //posición “true” si la nota es mayor o igual que 5 (aprobado) y “false” en caso contrario

    public static void ponNotasArray (double[] a, boolean[] b)
    {
        int i;

        if (a.length != b.length)
        {
            System.out.println("Error");
        }
        else
        {
            for(i = 0; i <a.length; i++)
            {
                if (a[i] >= 5)
                {
                    b[i] = true;
                }
            }
        }
    }

    //28. Escribe una función “concatenaArrays55” a la que le pasamos tres arrays de enteros.
    //Los dos primeros tendrán un tamaño de 5 y contendrán los datos que hay que copiar.
    //El tercero tendrá un tamaño de 10 y en él copiaremos los datos del primer array y
    //después los datos del segundo (Ej.: [4,5,6,7,8] & [1,1,2,2,3] = [4,5,6,7,8,1,1,2,2,3]).

    public static void concatenaArrays55 (int[] a, int[] b, int[] c)
    {
        int i;

        for (i = 0; i < 5 ; i++)
        {
            c[i] = a[i];
        }

        for (i = 5; i < 10; i++)
        {
            c[i] = b[i - 5];
        }
    }

    //29. Escribe una función “concatenaArrays” a la que pasamos tres arrays con la condición
    //de que el tamaño del tercero sea igual a la suma del tamaño de los dos primeros. Hará
    //lo mismo que la función anterior.

    public static void concatenaArrays(int[] a, int[] b, int[] c)
    {
        int i;

        for(i = 0; i < a.length; i++)
        {
            c[i] = a[i];
        }

        for (i = a.length; i < a.length + b.length; i++)
        {
            c[i] = b[i - a.length ];
        }
    }

    //30. Escribe una función “contiene” a la que le pasamos un array y un valor entero. La
    //función nos devolverá “true” si el array contiene el número y “false” si no lo contiene.

    public static boolean contiene (int[] a, int num)
    {
        int i;
        boolean b = false;

        for(i = 0; i < a.length; i++)
        {
            if (a[i] == num)
            {
                b = true;
            }
        }
        return b;
    }

    //31. Escribe una función “concatenaArraysPro” a la que le pasas dos arrays de enteros y te
    //devuelve un array cuyo tamaño es la suma del tamaño de ambos y que contiene todos
    //los elementos del primero y a continuación los del segundo. Esta función devolverá un
    //array de enteros (int[]) el cuál se creará dentro de la propia función.

    public static int[] concatenaArraysPro (int[] a, int[] b)
    {
        int [] c = new int[a.length + b.length];
        concatenaArrays(a, b, c);
        return c;
    }

    //32. Escribe una función “copiaArrayPro” a la que le pasas un array y te devuelve un array
    //del mismo tamaño y con los mismos datos.

    public static int[] copiaArrayPro (int[] a)
    {
        int i;
        int[] b = new int[a.length];

        for (i = 0; i < a.length; i++)
        {
            b[i] = a[i];
        }
        return b;
    }

    //33. Escribe una función “insertaEnArray” a la que le pasas tres parámetros: un array de
    //enteros, un valor entero y una posición. La función insertará el valor en la posición
    //indicada, desplazando el resto de valores para hacerle hueco. La función nos devolverá
    //un array con el resultado. Ej.: Si tenemos el array [1,2,3,4,5] y queremos insertar el
    //valor “26” en la posición “2”, el resultado será: [1,2,26,3,4,5].


    public static int[] insertaEnArray (int[] a, int b, int pos)
    {
        int[] res = new int[a.length + 1];
        int i;

        for (i = 0; i < res.length -1; i++)
        {
            if(i < pos)
            {
                res[i] = a[i];
            }
            if (i == pos)
            {
                res[i] = b;
            }
            if (i > pos)
            {
                res[i + 1] = a[i];
            }
        }
        return res;
    }

    //34. Escribe una función “borraDeArray” a la que le pasas dos parámetros: un array de
    //enteros y una posición. La función eliminará el elemento colocado en la posición
    //indicada. La función nos devolverá un array con el resultado. Ej.: Si tenemos el array
    //[5,7,2,8,1] y queremos eliminar la posición 1, el resultado será: [5,2,8,1].

    public static int[] borradeArray (int[] a, int pos)
    {
        int [] res = new int[a.length - 1];
        int i;

        for(i = 0; i < res.length; i++)
        {
            res[i] = a[i];

            if (i >= pos)
            {
                res[i] = a[i+1];
            }
        }
        return res;
    }

    //35. Escribe una función “elimina1ElementoArray” a la que le pasas dos parámetros: un
    //array de enteros y un valor entero. La función eliminará del array el valor entero
    //independientemente de la posición en la que se encuentre. Si el valor se repite, se
    //eliminará sólo la primera vez que aparece el valor. La función nos devolverá un array
    //con el resultado.

    public static int[] elimina1ElementoArray (int [] a, int b)
    {
        int [] res = new int [a.length - 1];
        int i, j = 0, cont = 0;

        for(i = 0; i < a.length - 1; i++)
        {
           if((a [i] == b) && (cont == 0))
           {
               j++;
               cont++;
           }
           res[i] = a[j];
           j++;
        }
        return res;
    }

    //36. Escribe una función “eliminaElementosArray” a la que le pasas dos parámetros: un
    //array de enteros y un valor entero. La función eliminará del array el valor entero
    //independientemente de la posición en la que se encuentre. Si el valor se repite, se
    //eliminarán todas las veces que se repite. La función nos devolverá un array con el
    //resultado.

    public static int[] eliminaElementosArray (int [] a, int b)
    {
        //No funciona
        int i, j = 0, cont = 0;

        for(i = 0; i < a.length - 1; i++)
        {
            if(a [i] == b)
            {
                cont++;
            }
        }
        int [] res = new int [a.length - cont];

        for(i = 0; i < a.length - 1; i++)
        {
            if(a [i] == b)
            {
                j++;
            }
            res[i] = a[j];
            j++;
        }
        return res;
    }

    //37. Escribe una función “insertaArrayEnArray” a la que le pasas tres parámetros: un array
    //de enteros, una posición de ese array, y otro array de enteros. La función insertará en
    //el primer array, a partir de la posición indicada, todo el contenido del segundo array.
    //La función nos devolverá un array con el resultado. Ej.: [6, 2, 1, 3], posición: 2, insertar:
    //[12, 13], resultado = [6, 2, 12, 13, 1, 3].

    public static int[] insertaArrayenArray (int[] a, int pos, int[] b)
    {

        //funciona

        int[] resultado = new int[a.length + b.length];

        int i, j=0;

        for (i = 0; i < resultado.length; i++)
        {
            if ((i == pos))
            {
                for (j = 0; j < b.length; j++)
                {
                    resultado[i + j] = b[j];
                }
                i = i + j;
                resultado[i] = a[i - j];
            }
            else
            {
                resultado[i] = a[i - j];
            }
        }
        return resultado;
    }

    //38. Escribe una función “subArray” a la que le pasas un array y dos posiciones. La función
    //te devuelve otro array que contiene los datos comprendidos entre ambas posiciones
    //(incluidas ambas dos). Ej.: [3, 6, 2, 8, 9], posiciones, 1 y 3, resultado = [6, 2, 8].

    public static int[] subArray ( int[] a, int pos1, int pos2)
    {
        int[] res = new int [(pos2 - pos1) + 1];
        int i , j = 0;

        for (i = 0; i < a.length; i++)
        {
            if((i >= pos1) && (i <= pos2))
            {
                res[j] = a[i];
                j++;
            }
        }
        return res;
    }

    //39. Escribe una función “recortaArray” a la que le pasas un array y dos posiciones. La
    //función te devuelve otro array que contiene los todos los datos menos los
    //comprendidos entre ambas posiciones (incluidas ambas dos). Ej.: [3, 6, 2, 8, 9],
    //posiciones, 1 y 3, resultado = [3, 9].

    public static int[] recortaArray (int[] a, int pos1, int pos2)
    {
        int res[] = new int [a.length - (pos2 - pos1+1)];
        int i, j;
        j=0;
        for(i = 0; i < pos1; i++)
        {
            res[j] = a[i];
            j++;
        }

        for(i = pos2 +1; i < a.length; i++)
        {
            res[j] = a[i];
            j++;
        }
        return res;
    }

    //40. Escribe la función “ordenaBurbuja” a la que le pasaremos un array de enteros y lo
    //ordenará mediante la ordenación de la burbuja. La ordenación de la burbuja funciona
    //de la siguiente forma:
    //• Si el array tiene N elementos, se realizarán N-1 pasadas (por ejemplo, para un
    //array de 5 elementos tendremos que realizar 4 pasadas para que quede
    //ordenado).
    //• En cada pasada, iremos recorriendo el array de principio a fin comprobando los
    //números por parejas (por ejemplo: el primer y segundo número, el segundo y el
    //tercero, etc.).
    //• Si la pareja de números está en orden (o sea, el primero es menor que el segundo)
    //la dejamos como está y si está desordenada, los intercambiamos.

    public static void ordenaBurbuja (int [] a)
    {
        int i, tmp, j;

        for (j = 0; j < a.length - 1; j++)
        {
            for (i = 0; i < a.length - 1; i++)
            {
                if (a[i] > a[i + 1])
                {
                    tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("MENU");
        System.out.println("1- Ejercicio 1 ");
        System.out.println("2- Ejercicio 2 ");
        System.out.println("3- Ejercicio 3 ");
        System.out.println("4- Ejercicio 4 ");
        System.out.println("5- Ejercicio 5 ");
        System.out.println("6- Ejercicio 6 ");
        System.out.println("7- Ejercicio 7 ");
        System.out.println("8- Ejercicio 8 ");
        System.out.println("9- Ejercicio 9 ");
        System.out.println("10- Ejercicio 10 ");
        System.out.println("11- Ejercicio 11 ");
        System.out.println("12- Ejercicio 12 ");
        System.out.println("13- Ejercicio 13 ");
        System.out.println("14- Ejercicio 14 ");
        System.out.println("15- Ejercicio 15 ");
        System.out.println("16- Ejercicio 16 ");
        System.out.println("17- Ejercicio 17 ");
        System.out.println("18- Ejercicio 18 ");
        System.out.println("19- Ejercicio 19 ");
        System.out.println("20- Ejercicio 20 ");
        System.out.println("21- Ejercicio 21 ");
        System.out.println("22- Ejercicio 22 ");
        System.out.println("23- Ejercicio 23 ");
        System.out.println("24- Ejercicio 24 ");
        System.out.println("25- Ejercicio 25 ");
        System.out.println("26- Ejercicio 26 ");
        System.out.println("27- Ejercicio 27 ");
        System.out.println("28- Ejercicio 28 ");
        System.out.println("29- Ejercicio 29 ");
        System.out.println("30- Ejercicio 30 ");
        System.out.println("31- Ejercicio 31 ");
        System.out.println("32- Ejercicio 32 ");
        System.out.println("33- Ejercicio 33 ");
        System.out.println("34- Ejercicio 34 ");
        System.out.println("35- Ejercicio 35 ");
        System.out.println("36- Ejercicio 36 ");
        System.out.println("37- Ejercicio 37 ");
        System.out.println("38- Ejercicio 38 ");
        System.out.println("39- Ejercicio 39 ");
        System.out.println("40- Ejercicio 40 ");

        System.out.println("Elige una opción");

        opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                int a[] = {1, 2, 3, 4, 5};
                escribeArray5(a);
            }
            break;

            case 2:
            {
                int a[] = {1, 2, 3, 4, 5, 3, 54, 33, 12, 3};
                escribeArray(a);
            }
            break;

            case 3:
            {
                int[] a = {0, 0, 0, 0, 0};
                leeArray5(a);
            }
            break;

            case 4:
            {
                int a[] = {1, 2, 3, 4, 5, 3, 54, 33, 12, 3};
                leeArray(a);
            }
            break;

            case 5:
            {
                int a[] = {1, 2, 3, 4, 5};
                ponCeros5(a);
                escribeArray5(a);
            }
            break;

            case 6:
            {
                int a[] = {1, 2, 3, 4, 5, 6, 7, 6, 8, 9, 7, 0};
                ponCeros(a);
            }
            break;

            case 7:
            {
                int a[] = {1, 2, 3, 4, 5};
                System.out.println(sumaArray5(a));
            }
            break;

            case 8:
            {
                int a[] = {1, 2, 3, 4, 5, 6, 7, 6, 8, 9, 7, 0};
                System.out.println(sumaArray(a));
            }
            break;

            case 9:
            {
                int a[] = {1, 2, 3, 4, 5};
                System.out.println(mediaArray5(a));
            }
            break;

            case 10:
            {
                int a[] = {1, 2, 3, 4, 5};
                System.out.println(mediaArray(a));
            }
            break;

            case 11:
            {
                int a[] = {1, 2, 3, 4, 5, 6, 7, 6, 8, 9, 7, 0};
                rellenaEnOrden(a);
                escribeArray(a);
            }
            break;

            case 12:
            {
                int a[] = {1, 2, 3, 4, 5, 6};
                rellenaEnOrdenDesc(a);
                escribeArray(a);
            }
            break;

            case 13:
            {
                int a[] = {1, 2, 3, 4, 5, 6, 7, 6, 8, 9, 7, 0};
                rellenaAleatorio(a);
                escribeArray(a);
            }
            break;

            case 14:
            {
                int a[] = {1, 2, 3, 2, 5, 6};

                if (estaOrdenado(a))
                {
                    System.out.println("El array está ordenado");
                } else
                {
                    System.out.println("El array no está ordendo");
                }
            }
            break;

            case 15:
            {
                int a[] = {1, 2, 3, 4, 5};
                System.out.println(numerosImpares(a));
            }
            break;

            case 16:
            {
                int a[] = {3, 4, 5, 6, 7, 6, 8, 9, 7, 10};
                System.out.println(minArray(a));
            }
            break;

            case 17:
            {
                int a[] = {3, 4, 5, 6, 7, 6, 8, 9, 7, 3250};
                System.out.println(maxArray(a));
            }
            break;

            case 18:
            {
                int a[] = {3, 4, 5, 6, 7, 6, 8, 9, 7, 3250};
                System.out.println(numeroAprobados(a));
            }
            break;

            case 19:
            {
                int a[] = {3, 4, 5, 6, 7, 6, 8, 9, 7, 3250};
                System.out.println(porEncimaDe(a, 5));
            }
            break;

            case 20:
            {
                int a[] = {3, 0, 5, 0, 7, 6, 0, 9, 7, 0};
                System.out.println(cuantosCeros(a));
            }
            break;

            case 21:
            {
                int a[] = {3, 0, 5, 0, 7, 6, 0, 9, 7, 0};
                int b[] = {6, 3, 4, 0, 1, 2, 3, 0, 0, 6};
                copiaArray(a, b);
                escribeArray(b);
            }
            break;

            case 22:
            {
                int a[] = {3, 0, 5, 0, 7, 6, 0, 9, 7, 0};
                int b[] = {6, 3, 4, 0, 1, 2, 3, 0, 0, 6};
                copiaArrayInvertido(a, b);
                escribeArray(b);
            }
            break;

            case 23:
            {
                int a[] = {3, 0, 5, 0, 7, 6, 0, 9, 7, 0};
                int b[] = {6, 3, 4, 0, 1, 2, 3, 0, 0, 6};
                int c[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                sumaArrays(a, b, c);
                escribeArray(c);
            }
            break;

            case 24:
            {
                int m;
                System.out.println("Elige si multiplicar, dividir o restar: ");
                System.out.println("1 - Multiplicar");
                System.out.println("2 - Dividir");
                System.out.println("3 - Restar ");
                m = sc.nextInt();

                switch (m)
                {
                    case 1:
                    {
                        int a[] = {3, 0, 5, 0, 7, 6, 0, 9, 7, 0};
                        int b[] = {6, 3, 4, 0, 1, 2, 3, 0, 0, 6};
                        int c[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                        multiplicaArrays(a, b, c);
                        escribeArray(c);
                    }
                    break;
                    case 2:
                    {
                        int a[] = {3, 0, 5, 0, 7, 6, 0, 9, 7, 0};
                        int b[] = {6, 3, 4, 0, 1, 2, 3, 0, 0, 6};
                        int c[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                        divideArrays(a, b, c);
                        escribeArray(c);
                    }
                    break;
                    case 3:
                    {
                        int a[] = {3, 0, 5, 0, 7, 6, 0, 9, 7, 0};
                        int b[] = {6, 3, 4, 0, 1, 2, 3, 0, 0, 6};
                        int c[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                        restaArrays(a, b, c);
                        escribeArray(c);
                    }
                }

            }
            break;

            case 25:
            {
                int a[] = {3, 0, 5, 0, 7, 6, 0, 9, 7, 0};
                invierteArray(a);
                escribeArray(a);
            }
            break;

            case 26:
            {
                int a[] = {3, 0, 5, 0, 7, 6, 0, 9, 7, 0};
                int b[] = {3, 9, 5, 0, 7, 6, 0, 9, 7, 0};

                if (comparaArrays(a, b))
                {
                    System.out.println("Son iguales");
                }
                else
                {
                    System.out.println("no son iguales");
                }
            }
            break;

            case 27:
            {
                double a[] = {3, 8, 5, 0};
                boolean b[] ={true, true, false, false};
                ponNotasArray(a, b);
            }
            break;

            case 28:
            {
                int a[] = {6, 7, 1, 3, 9};
                int b[] = {3, 8, 5, 0, 2};
                int c[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

                concatenaArrays55(a, b, c);

                escribeArray(c);
            }
            break;

            case 29:
            {
                int a[] = {6, 7, 1, 3, 9, 9, 4};
                int b[] = {3, 8, 5};
                int c[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

                concatenaArrays(a, b, c);

                escribeArray(c);
            }
            break;

            case 30:
            {
                int a[] = {6, 7, 1, 3, 9, 9, 4};

                if (contiene(a , 9))
                {
                    System.out.println("SI");
                }
                else
                {
                    System.out.println("NO");
                }
            }
            break;

            case 31:
            {
                int[] a = {1,2,3};
                int[] b = {4,5,6,7,2};
                int[] c;

                c = concatenaArraysPro(a, b);

                escribeArray(c);
            }
            break;

            case 32:
            {
                int[] a = {1,2,3,4,5,6};
                escribeArray(copiaArrayPro(a));
            }
            break;

            case 33:
            {
                int a[] = {1,2,3,4,5};

                int b = 26;
                int pos = 2;

                escribeArray(insertaEnArray(a, b, pos));
            }
            break;


            case 34:
            {
                int a[] = {1,2,3,4,5};
                int pos = 2;

                escribeArray(borradeArray( a, pos));
            }
            break;

            case 35:
            {
                int a[] = {1,2,4,3,4,5,4};
                int num = 4;
                escribeArray(a);
                escribeArray(elimina1ElementoArray( a, num));
            }
            break;

            case 36:
            {
                int a[] = {1,2,4,3,4,5};
                int num = 4;

                escribeArray(eliminaElementosArray( a, num));
            }
            break;

            case 37:
            {
                int a[] = {1,2,4,3,4,5};
                int b[] = {5, 8};
                int pos = 3;

                escribeArray(insertaArrayenArray( a, pos, b));
            }
            break;

            case 38:
            {
                int a[] = {1,2,4,3,4,5};
                int pos1 = 1, pos2 =4;

                escribeArray(subArray( a, pos1, pos2));
            }
            break;

            case 39:
            {
                int a[] = {1,2,4,3,4,5};
                int pos1 = 1, pos2 =4;
                escribeArray(a);
                escribeArray(recortaArray( a, pos1, pos2));
            }
            break;

            case 40:
            {
                int a[] = {12,2,10,35,45,1};

                escribeArray(a);

                ordenaBurbuja(a);

                escribeArray(a);
            }
            break;
        }
    }
}

