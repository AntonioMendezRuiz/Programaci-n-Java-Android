package com.company;

import java.util.Scanner;

public class Main
{
    //Funciones Auxiliares

    public static boolean bisiesto(int a)
    {
        boolean b;

        if ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0))
        {
            b = true;
        } else
        {
            b = false;
        }

        return b;
    }

    public static int diasMes(int a)
    {
        if ((a == 1) || (a == 3) || (a == 5) || (a == 7) || (a == 8) || (a == 10) || (a == 12))
        {
            return 31;
        } else
        {
            if (a == 2)
            {
                return 28;
            } else
            {
                return 30;
            }
        }
    }

    public static int diasMes2(int a, int b)
    {
        if (a != 2)
        {
            return diasMes(a);
        } else
        {
            if (bisiesto(b))
            {
                return 29;
            } else
            {
                return diasMes(a);
            }
        }
    }

    public static int diasTranscurridos(int dia, int mes, int anno)
        {
        int i, cont = 0, dias1;

        for (i = 1; i < mes; i++)
        {
            cont = cont + diasMes2(i, anno);
        }
        dias1 = cont + dia;

        return dias1;
        }

        public static int diasTranscurridos1980 ( int dia, int mes, int anno)
        {

            int j, i, sumadias = 0, sumatotal, sumadiasanno = 0;

            for (i = 1980; i < anno; i++)
            {
                sumadiasanno = 0;
                for (j = 1; j <= 12; j++)
                {
                    sumadiasanno = sumadiasanno + diasMes2(j, i);
                }
                sumadias = sumadias + sumadiasanno;

                // sumadias = sumadias + 365; y si es bisiesto ponesmo un "if"
            }

            sumatotal = sumadias + diasTranscurridos(dia, mes, anno);

            return sumatotal;
        }

        public static int diaSemanaFecha ( int dia, int mes, int año)
        {

            if (diasTranscurridos1980(dia, mes, año) % 7 == 0)
            {
                return 2 - 1;
            } else if (diasTranscurridos1980(dia, mes, año) % 7 == 6)
            {
                return 7;
            } else if (diasTranscurridos1980(dia, mes, año) % 7 == 5)
            {
                return 7 - 1;
            } else if (diasTranscurridos1980(dia, mes, año) % 7 == 4)
            {
                return 6 - 1;
            } else if (diasTranscurridos1980(dia, mes, año) % 7 == 3)
            {
                return 5 - 1;
            } else if (diasTranscurridos1980(dia, mes, año) % 7 == 2)
            {
                return 4 - 1;
            } else
            {
                return 3 - 1;
            }
        }

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------


        //Escribe una función primosRelativos a la que le pasas dos números enteros y te dice si
        //son primos relativos, es decir, si no tienen ningún divisor común además del 1.

        public static boolean primosRelativos ( int a, int b)
        {
            boolean primos = true;
            int i, j;

            for (i = 2; i <= a; i++)
            {
                if (a % i == 0)
                {
                    for (j = 2; j <= b; j++)
                    {
                        if (b % j == 0)
                        {
                            if (j == i)
                            {
                                primos = false;
                            }
                        }
                    }
                }
            }
            return primos;
        }

        //Escribe la función calendarioGrafico a la que le pasas dos parámetros: el mes y el año.
        //La función nos escribirá por pantalla un calendario del mes indicado.

        public static void calendarioGrafico ( int mes, int anno)
        {
            int i;
            int diasemana = diaSemanaFecha(1, mes, anno);

            System.out.println("L   M   X   J   V   S   D");
            if (diaSemanaFecha(1, mes, anno) == 1)
            {
                System.out.print("    ");
            }
            else if (diaSemanaFecha(1, mes, anno) == 2)
            {
                System.out.print("        ");
            }
            else if (diaSemanaFecha(1, mes, anno) == 3)
            {
                System.out.print("            ");
            }
            else if (diaSemanaFecha(1, mes, anno) == 4)
            {
                System.out.print("                ");
            }
            else if (diaSemanaFecha(1, mes, anno) == 5)
            {
                System.out.print("                    ");
            }
            else if (diaSemanaFecha(1, mes, anno) == 6)
            {
                System.out.print("                          ");
            }
            else
            {
                System.out.print("                              ");
            }

            for (i = 1; i <= diasMes2(mes, anno); i++)
            {

                if (diasemana % 7 == 1)
                {
                    System.out.println("");
                }

                if (i < 10)
                {
                    System.out.print(i + "   ");
                } else
                {
                    System.out.print(i + "  ");
                }
                diasemana++;
            }
        }

        //Escribe la función cuadradoEstrellitas que te pinta un cuadrado realizado con
        //estrellitas. El tamaño máximo será 20. Si escribes más de 20 o menos de 1, dará
        //un mensaje de error en lugar de pintar el cuadrado.

        public static void cuadradoEstrellitas (int lado)
        {
            int i, j;
            if ((lado > 20)||(lado < 1))
            {
                System.out.println("ERROR. La longitud del lado no es correcta");
            }
            else
            {
                for (i = 1; i <= lado; i++)
                {
                    for (j = 1; j <= lado; j++)
                    {
                        if (i == 1 || i == lado || j == 1 || j == lado)
                        {
                            System.out.print("*");
                        }
                        else
                            {
                            System.out.print(" ");
                            }
                        }
                    System.out.println();
                }

            }
        }
        //Escribe una función escribeSerieNumeros3 que nos pide tres números. El primero
    //tendrá que ser un número entre 1 y 100; si el número no es correcto, lo vuelve a pedir.
    //El segundo tendrá que ser un número entre 1 y 100 pero con la condición de que sea
    //mayor que el primero; lo volverá a pedir mientras no sea correcto. El tercero tendrá que
    //ser un número entre 1 y 100 con la condición de que sea mayor que el primero y menor
    //que el segundo; también lo volverá a pedir hasta que sea correcto.
    //Una vez que tengamos los tres números, nos escribirá por pantalla los números
    //comprendidos entre el primero y el tercero y en otra línea los números comprendidos
    //entre el tercero y el segundo.

        public static void escribeSerieNumeros3 (int a, int b, int c)
        {
            int i;
            Scanner sc = new Scanner(System.in);

            while (a < 1 || a > 100)
            {
                System.out.println("El numero debe estar entre 1 y 100. Prueba de nuevo");
                a = sc.nextInt();
            }
            while (b < a || b > 100)
            {
                System.out.println("El numero debe estar entre " + a + " y 100. Prueba de nuevo");
                b = sc.nextInt();
            }
            while (c < b || c > 100)
            {
                System.out.println("El numero debe estar entre " + b + " y 100. Prueba de nuevo");
                c = sc.nextInt();
            }

            for (i = a; i <= b; i++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
            for (i = b; i <= c; i++)
            {
                System.out.print(i + " ");
            }
        }

        //Escribe tres funciones que se llamarán maximo, medio y minimo. A cada una de las
    //funciones le pasaremos tres valores enteros (a, b, c). La función maximo nos devolverá
    //el mayor de los tres, la función minimo el menor de los tres y la función medio el del
    //medio.

        public static int maximo (int a, int b, int c)
        {
            if (a > b && a > c )
            {
                return a;
            }
            else if (b > a && b > c)
            {
                return b;
            }
            else
                return c;
        }

        public static int minimo (int a, int b, int c)
        {
            if (a < b && a < c )
            {
                return a;
            }
            else if (b < a && b < c)
            {
                return b;
            }
            else
                return c;
        }

        public static int medio (int a, int b, int c)
        {
            if (a != maximo(a, b, c) && a != minimo(a, b, c))
            {
                return a;
            }
            else if (b != maximo(a, b, c) && b != minimo(a, b, c))
            {
                return b;
            }
            else
                return c;
        }

        //Escribe la función trianguloEstrellitas. La función te pedirá un número que deberá ser
    //como mínimo el número 3 y como máximo el 20. Si el número no es correcto, escribirá
    //“ERROR”. La función escribirá por pantalla una pirámide a base de estrellitas como la
    //del ejemplo. La función deberá funcionar para cualquier número entre 3 y 20 (o sea,
    //nada de escribir las estrellitas a mano)

        public static void trianguloEstrellitas (int a)
        {
            int i, j;

            for (i = 1 ;i <= a; i++)
            {
                for (j = 1; j <= i; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        //Escribe dos funciones:
    //• A la función cuadradoPerfecto le pasaremos un entero por parámetro y nos
    //devolverá un boolean, que será true si el entero es un cuadrado perfecto y false si
    //no lo es.
    //Un número A es un cuadrado perfecto si existe otro número B que multiplicado por
    //sí mismo nos da A. O, dicho de otra forma, un número es un cuadrado perfecto si su
    //raíz cuadrada sale exacta. Ej.: 4, 9, 16, 25, etc.
    //• A la función listaCuadradosPerfectos le pasaremos dos enteros min y max y nos
    //escribirá por pantalla todos los cuadrados perfectos que existen entre esos dos
    //números. No devuelve nada porque escribe el resultado directamente por pantalla.
    //Esta función usará la función anterior para el cálculo.
    //Por ejemplo: listaCuadradosPerfectos(10, 20) nos escribirá el 9 y el 16.

        public static boolean cuadradoPerfecto (int a)
        {
            int i;
            boolean perfecto = false;
            for (i = 1; i < a; i++)
            {
                if (i * i == a)
                {
                    perfecto = true;
                }
            }
            return perfecto;
        }

        public static void listaCuadradosPerfectos (int min, int max)
        {
            int i;

            for (i = min; i <= max; i++)
            {
                if(cuadradoPerfecto(i))
                {
                    System.out.print(i + " ");
                }
            }
        }
        //. Escribe la función descomponerFactoresPrimos a la que le pasamos un entero y nos
    //escribe por pantalla sus factores primos. No devuelve nada porque escribe los datos por
    //pantalla.
    //Ejemplo: Si le pasamos el número 24, nos debería escribir: 2 2 2 3

        public static void descomponerFactoresPrimos (int a)
        {
            int i;

            for(i = 2; i <= a; i++)
            {
                while(a % i == 0)
                {
                    a = a / i;
                    System.out.print(i + "  ");
                }
            }
        }

        public static void main (String[]args)
        {

        }
}



