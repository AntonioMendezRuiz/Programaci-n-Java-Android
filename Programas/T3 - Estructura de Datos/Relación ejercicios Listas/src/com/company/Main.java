package com.company;
import java.lang.reflect.Array;
import java.util.*;

public class Main
{
    //1. Escribe la función leeLista que va leyendo enteros desde el teclado y los va metiendo en
    //una lista. La función ira leyendo valores hasta que escribamos un -1. La lista la pasamos
    //por parámetro.

    public static void leeLista (List<Integer> ls)
    {
        Scanner sc = new Scanner(System.in);
        int numero;

        numero =  sc.nextInt();
        ls.add(numero);

        while (numero != -1)
        {
            numero =  sc.nextInt();
            ls.add(numero);
        }
    }

    //2. Escribe la función leeListaN que lee desde el teclado el número de enteros que le
    //digamos. Para ello, le pasaremos dos parámetros: la lista y un entero.

    public static void leeListaN (List<Integer> ls , int a)
    {
        Scanner sc = new Scanner(System.in);
        int numero, i;

        for (i = 0; i < a; i++)
        {
            numero = sc.nextInt();
            ls.add(numero);
        }
    }

    //3. Escribe la función escribeLista a la que le pasas una lista y te escribe su contenido por
    //pantalla. Para diferenciarla de los arrays, usaremos angulos para delimitarla.

    public static void escribleLista ( List<Integer> ls)
    {
        int i;
        System.out.print("<");
        for (i = 0; i < ls .size(); i++)
        {
            if ( i == ls.size() - 1)
            {
                System.out.print( ls.get(i));
            }
            else
            {
                System.out.print( ls.get(i) + ", ");
            }
        }
        System.out.print(">");
    }

    //4. Escribe la función eliminaNegativos que elimine todos los números negativos de una
    //lista de enteros.

    public static void eliminaNegativos (List<Integer> ls)
    {
        int i;
        for (i = 0; i < ls.size(); i++)
        {
            if (ls.get(i) < 0)
            {
                ls.remove(i);
                i--;
            }
        }

    }
    //5. Escribe la función clasificaNumeros a la que le pasamos tres listas. La primera contiene
    //un montón de números positivos y negativos. Habrá que copiar los positivos en la
    //primera lista y los negativos en la segunda lista, y después ordenar las dos listas.

    public static void clasificaNumeros (List<Integer> ls, List<Integer> pos, List<Integer> neg)
    {
        int i;

        for (i = 0; i < ls.size(); i++)
        {
            if (ls.get(i) < 0)
            {
                neg.add(ls.get(i));
            }
            else
            {
             pos.add(ls.get(i));
            }
        }
    }

    //6. Escribe la función eliminaRepetidos a la que le pasas una lista y te elimina los elementos
    //repetidos, dejando sólo uno de cada (ej.: <1,2,3,1> = <1,2,3>). La forma más fácil es ir
    //copiando de una lista a otra sólo los elementos que no estén ya introducidos (p.ej.,
    //usando contains).

    public static void eliminaRepetidos ( List<Integer> ls)
    {
        int i, j;

        for (i = 0; i < ls.size(); i++)
        {
            for (j = i + 1; j < ls.size(); j++)
            {
                if (ls.get(j) == ls.get(i))
                {
                    ls.remove(ls.get(j));
                }
            }
        }
    }

    //7. Escribe la función ordenaListaSeleccion a la que le pasas una lista de enteros
    //desordenada y te la ordena mediante el algoritmo de selección.
    //La ordenación por selección funciona de la siguiente forma:
    //- Buscamos el elemento más pequeño de nuestra lista.
    //- Lo metemos en otra lista resultado.
    //- Lo eliminamos de nuestra lista.
    //- Repetimos hasta que nuestra lista se quede vacía y todos los elementos hayan
    //pasado a la lista resultado en orden.

    public static List ordenaListaSeleccion (List<Integer> ls)
    {
        List<Integer> lista = new ArrayList<>();

        int i, j;
        int size = ls.size();
        for (i = 0; i < size; i++)
        {
            int menor = ls.get(0);
            int indice = 0;
            for (j = 0; j < ls.size(); j++)
            {
                if(ls.get(j)<menor){
                    menor = ls.get(j);
                    indice = j;
                }
            }
            lista.add(ls.get(indice));
            ls.remove(indice);
        }
        return lista;
    }

    //8. Escribe la función ordenaListaInsercion a la que le pasas una lista de enteros
    //desordenada y te la ordena mediante el algoritmo de inserción.
    //La ordenación por inserción funciona de la siguiente forma:
    //- Cogemos cada elemento en orden de nuestra lista.
    //- A la hora de meterlo en la lista resultado lo metemos de manera que la lista
    //resultado se quede ordenada. Para ello, vamos pasando por la lista resultado hasta
    //que encontremos un valor mayor e insertamos nuestro número delante.
    //- Repetimos hasta que nuestra lista se quede vacía y todos los elementos hayan
    //pasado a la lista resultado en orden.

    // no funciona

    public static List ordenaListaInsercion (List<Integer> ls)
    {
        List<Integer> lista = new ArrayList<>();

        int i, indice = 0;
        int size = ls.size();
        lista.add(ls.get(0));


        for (i = 0; i < size; i++)
        {

            if(ls.get(i) < lista.get(0))
            {
                lista.add( indice ,ls.get(i));
                indice++;
                ls.remove(i);
            }

        }
        return lista;
    }

    //9. Escribe la función ordenaListaPalabras a la que le pasas una lista de cadenas que
    //contiene palabras y te las ordena alfabéticamente.

    public static void ordenaListaPalabras (List<String> ls)
    {
        Collections.sort(ls);
    }

    //10. Escribe la función ordenaListaPalabras2 a la que le pasas una lista de cadenas que
    //contiene palabras y te las ordena por tamaño (la más pequeña el principio).

    public static void ordenaListaPalabras2 (List<String> ls)
    {
        int i, j;
        for (j = 0; j < ls.size(); j++)
        {
            for (i = 0; i < ls.size() - 1; i++)
            {
                if (ls.get(i).length() > ls.get(i + 1).length())
                {
                   Collections.swap(ls, i , i + 1);

                }
            }
        }
    }
    //11. Escribe la función insertaArrayEnArrayPro a la que le pasamos tres parámetros: un
    //array de enteros, una posición en ese array y otro array de enteros. La función insertará
    //en el primer array, a partir de la posición indicada, todo el contenido del segundo array,
    //y nos devolverá otro array con el resultado. Para ello, usaremos una lista como paso
    //intermedio: copiamos el array a la lista, realizamos la inserción en la lista y luego
    //convertiremos la lista en un array y lo devolveremos.

    public static List insertaArrayEnArrayPro (List<Integer> ls, List<Integer> lis, int a)
    {
        int i, j;
        for(i = 0; i < ls.size() + lis.size(); i++)
        {
            if (i == a)
            {
                for(j = 0; j < lis.size(); j++)
                {
                    ls.add(i, lis.get(j));
                    i++;
                }
            }
        }
           return ls;
    }

    //  12. Escribe la función sorteoBonoloto que nos da los 6 números que van a tocar en el
    //próximo sorteo. Para ello, meteremos en una lista los 49 números, elegiremos una
    //posición al azar, guardaremos el número en otra lista y lo eliminaremos de la primera
    //(para que no pueda volver a salir). Al terminar de sortear los 6 números, devolveremos
    //una lista que contenga el resultado.

    public static List<Integer> sorteoBonoloto ()
    {
        List<Integer> ls = new ArrayList<>();
        List<Integer> lista = new ArrayList<>();
        Random r = new Random(49);
        int i;

        for (i = 0; i < 50 ; i++)
        {
            ls.add(i);
        }
        for (i = 0; i < 6; i++)
        {
            int aleatorio = r.nextInt(ls.size());
            lista.add(ls.get(aleatorio));
            ls.remove(aleatorio);
        }
        return lista;
    }

    //13. Escribe la función eliminaRepetidos a la que le pasamos un array (en el que puede que
    //aparezcan elementos repetidos) y nos devuelve otro array en el que no hay repetidos.
    //Podemos usar listas para que sea más sencillo

    public static int[] eliminaRepetidos (int[] a)
    {
        List<Integer> lista = new ArrayList<>();

        int i;

        for (i = 0; i < a.length; i++)
        {
            if (!lista.contains(a[i]))
            {
                lista.add(a[i]);
            }
        }

        int [] res = new int[lista.size()];

        for (i = 0; i < lista.size(); i++)
        {
            res[i] = lista.get(i);
        }
        return res;
    }

    //14. Escribe la función unionListas a la que le pasas dos listas (que representan conjuntos) y
    //que te devuelve otra lista que representará la unión de ambos conjuntos. Esto es, los
    //elementos que estén o en la primera lista o en la segunda (si están en las dos, sólo hay
    //que meterlos una vez).

    public static List unionListas (List<Integer> ls, List<Integer> lis)
    {
        int i;
        List<Integer> lista = new ArrayList<>();

        lista.addAll(ls);

        for (i = 0; i < lis.size(); i++)
        {
            if (!lista.contains(lis.get(i)))
            {
                lista.add(lis.get(i));
            }
        }
        return lista;
    }

    //15. Escribe la función interseccionListas a la que le pasas dos listas (que representan
    //conjuntos) y que te devuelve otra lista que representará la intersección de ambos
    //conjuntos. Esto es, los elementos que estén tanto en la primera lista como en la
    //segunda.

    public static List interseccionListas (List<Integer> ls, List<Integer> lis)
    {
        List<Integer> lista = new ArrayList<>();
        int i;

        for (i = 0; i < lis.size(); i++)
        {
            if (ls.contains(lis.get(i)))
            {
                lista.add(lis.get(i));
            }
        }
        return lista;
    }

    //16. Escribe la función desordenaLista a la que le pasas una lista y te la desordena. Para ello,
    //iremos cogiendo al azar elementos de la lista y poniéndolos en otra lista (quitándolos de
    //la primera). La segunda lista, contendrá los elementos al azar.

    public static List desordenaLista (List<Integer> ls)
    {
        List<Integer> lista = new ArrayList<>();
        int i;
        Random r = new Random(ls.size());

        while (!ls.isEmpty())
        {
            i = r.nextInt(ls.size());

            lista.add(ls.get(i));
            ls.remove(i);
        }
            return lista;
    }
    //17. Escribe la función modaLista que nos devuelva la moda (el valor que más veces se repite)
    //de una lista de enteros.

    public static int modaLista (List<Integer> ls)
    {
        int i, j, num = 0, cont = 0, max = 0;

        for (i = 0; i < ls.size(); i++)
        {
            for (j = 0; j < ls.size(); j++)
            {
                if (ls.get(j) == ls.get(i))
                {
                    cont++;
                }
            }
            if (cont > max)
            {
                max = cont;
                num = ls.get(i);
            }
            cont = 0;
        }
        return  num;
    }

    //18. Escribe la función puntuacionesTrampolin. La función recibirá una lista con siete
    //números reales que se corresponderán a las notas obtenidas por un saltador de
    //trampolín de 3 metros. En este deporte, para calcular la nota final, se eliminan las dos
    //notas más altas y las dos más bajas, sumándose las tres que quedan. Por tanto, nuestra
    //función eliminará los dos valores más altos y los dos más bajos del la lista y, además,
    //devolverá un real que será la suma de los tres valores que quedan.

    public static double puntuacionesTrampolin ( List<Double> ls)
    {
        double suma = 0;
        int i;
        List<Double> lista = new ArrayList<>();

        for (i = 0; i < ls.size() - 1; i++)
        {
            if (ls.get(i) < ls.get(i + 1))
            {
                lista.add(ls.get(i + 1));
            }
            else
            {
                lista.add(ls.get(i));
            }
        }

        for (i = 0; i < lista.size(); i++)
        {
            suma = suma + lista.get(i);
        }

        return suma;

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


        System.out.println("Elige una opción");

        opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                List<Integer> lista = new ArrayList<>();
                leeLista(lista);
                System.out.println(lista);
            }
            break;

            case 2:
            {
                int a = 4;
                List<Integer> lista = new ArrayList<>();
                leeListaN(lista, a);
                System.out.println(lista);
            }
            break;

            case 3:
            {
                List<Integer> lista = new ArrayList<>();
                lista.add(1);
                lista.add(2);
                lista.add(3);
                lista.add(4);
                lista.add(5);
                lista.add(6);
                lista.add(7);
                lista.add(8);

                escribleLista(lista);
            }
            break;

            case 4:
            {
                List<Integer> lista = new ArrayList<>();
                lista.add(1);
                lista.add(2);
                lista.add(3);
                lista.add(-3);
                lista.add(5);
                lista.add(6);
                lista.add(-1);
                lista.add(8);

                eliminaNegativos(lista);

                System.out.println(lista);
            }
            break;

            case 5:
            {
                List<Integer> ls = new ArrayList<>();
                List<Integer> lst = new ArrayList<>();
                List<Integer> lista = new ArrayList<>();
                lista.add(1);
                lista.add(2);
                lista.add(3);
                lista.add(-3);
                lista.add(5);
                lista.add(6);
                lista.add(-1);
                lista.add(8);

                clasificaNumeros(lista, ls, lst);

                System.out.println(lista);
                System.out.println(ls);
                System.out.println(lst);
            }
            break;

            case 6:
            {
                List<Integer> lista = new ArrayList<>();
                lista.add(-1);
                lista.add(2);
                lista.add(3);
                lista.add(-3);
                lista.add(5);
                lista.add(5);
                lista.add(-1);
                lista.add(8);

                System.out.println(lista);

                eliminaRepetidos(lista);

                System.out.println(lista);
            }
            break;

            case 7:
            {
                List<Integer> lista = new ArrayList<>();
                lista.add(78);
                lista.add(5);
                lista.add(3);
                lista.add(-3);
                lista.add(4);
                lista.add(9);
                lista.add(-1);
                lista.add(18);
                System.out.println(lista);
                System.out.println(ordenaListaSeleccion(lista));


            }
            break;

            case 8:
            {
                List<Integer> lista = new ArrayList<>();
                lista.add(78);
                lista.add(5);
                lista.add(3);
                lista.add(-3);
                lista.add(4);
                lista.add(9);
                lista.add(-1);
                lista.add(18);
                System.out.println(lista);
                System.out.println(ordenaListaInsercion(lista));
            }
            break;

            case 9:
            {
                List<String> lista = new ArrayList<>();
                lista.add("Hola");
                lista.add("Antonio");
                lista.add("Programacion");
                lista.add("Resultado");
                lista.add("LOL");

                System.out.println(lista);

                ordenaListaPalabras(lista);

                System.out.println(lista);

            }
            break;

            case 10:
            {
                List<String> lista = new ArrayList<>();
                lista.add("Hola");
                lista.add("Antonio");
                lista.add("Programacion");
                lista.add("Resultado");
                lista.add("LOL");
                System.out.println(lista);

                ordenaListaPalabras2(lista);

                System.out.println(lista);
            }
            break;

            case 11:
            {
                List<Integer> lista = new ArrayList<>();
                List<Integer> lista1 = new ArrayList<>();
                lista.add(1);
                lista.add(2);
                lista.add(3);
                lista.add(4);
                lista.add(5);
                lista1.add(11);
                lista1.add(22);
                lista1.add(33);
                lista1.add(44);
                lista1.add(55);

                System.out.println(insertaArrayEnArrayPro(lista, lista1, 3));
            }
            break;

            case 12:
            {

                System.out.println(sorteoBonoloto());
            }
            break;

            case 13:
            {
                int [] a = {1, 2, 3, 4, 5, 1, 2, 8};

                System.out.println(Arrays.toString(a));
                System.out.println(Arrays.toString(eliminaRepetidos(a)));
            }
            break;

            case 14:
            {
                List<Integer> lista = new ArrayList<>();
                List<Integer> lista1 = new ArrayList<>();
                lista.add(1);
                lista.add(2);
                lista.add(3);
                lista.add(4);
                lista.add(5);
                lista1.add(11);
                lista1.add(2);
                lista1.add(33);
                lista1.add(4);
                lista1.add(55);
                System.out.println(lista);
                System.out.println(lista1);
                System.out.println(unionListas(lista, lista1));
            }
            break;

            case 15:
            {
                List<Integer> lista = new ArrayList<>();
                List<Integer> lista1 = new ArrayList<>();
                lista.add(1);
                lista.add(2);
                lista.add(3);
                lista.add(4);
                lista.add(5);
                lista1.add(11);
                lista1.add(2);
                lista1.add(33);
                lista1.add(4);
                lista1.add(55);
                System.out.println(lista);
                System.out.println(lista1);

                System.out.println(interseccionListas(lista, lista1));
            }
            break;

            case 16:
            {
                List<Integer> lista = new ArrayList<>();
                lista.add(1);
                lista.add(2);
                lista.add(3);
                lista.add(4);
                lista.add(5);

                System.out.println(desordenaLista(lista));
            }
            break;

            case 17:
            {
                List<Integer> lista = new ArrayList<>();
                lista.add(1);
                lista.add(2);
                lista.add(3);
                lista.add(3);
                lista.add(3);
                lista.add(3);
                lista.add(3);
                lista.add(3);
                lista.add(4);
                lista.add(5);
                lista.add(5);
                lista.add(5);
                lista.add(5);

                System.out.println(modaLista(lista));
            }
            break;

            case 18:
            {
                List<Double> lista = new ArrayList<>();
                lista.add(8.3);
                lista.add(5.1);
                lista.add(3.0);
                lista.add(1.9);
                lista.add(4.4);
                lista.add(9.8);
                lista.add(0.0);

                System.out.println(puntuacionesTrampolin(lista));
            }
            break;
        }
    }
}
