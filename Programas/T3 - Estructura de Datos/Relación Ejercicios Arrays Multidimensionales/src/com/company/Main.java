package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main
{

    //1. Escribe la función escribeArray3x3 a la que le pasas un array bidimensional de tamaño
    //3x3 y te lo imprime por pantalla (que quede bonito)

    public static void escribeArray3x3(int[][] a)
    {
        int i, k;

        for (i = 0; i < 3; i++)
        {
            for (k = 0; k < 3; k++)
            {
                System.out.print(a[i][k] + " ");
            }
            System.out.println();
        }
    }

    //2. Escribe la función rellena3x3 a la que le pasas un array bidimensional de 3x3 y te lo
    //rellena con los números del 1 al 9.

    public static void rellena3x3(int[][] a)
    {
        int i, j, cont = 1;

        for (i = 0; i < 3; i++)
        {
            for (j = 0; j < 3; j++)
            {
                a[i][j] = cont;
                cont++;
            }
        }
    }

    //3. Escribe la función RellenaAleatorio3x3 a la que le pasas un array bidimensional de
    //tamaño 3x3 y te lo rellena con números aleatorios.

    public static void RellenaAleatorio3x3(int[][] a)
    {
        int i, j;
        Random r = new Random();

        for (i = 0; i < 3; i++)
        {
            for (j = 0; j < 3; j++)
            {
                int aleatorio = r.nextInt(99);
                a[i][j] = aleatorio;
            }
        }
    }
    //4. Escribe la función sumaArray3x3 a la que le pasas un array de 3x3 y te suma todos los
    //números. Te devuelve un entero con el resultado.

    public static int sumaArray3x3(int[][] a)
    {
        int i, j, suma = 0;

        for (i = 0; i < 3; i++)
        {
            for (j = 0; j < 3; j++)
            {
                suma = suma + a[i][j];
            }
        }
        return suma;
    }

    //5. Escribe la función escribeArrayBi a la que le pasas un array bidimensional de cualquier
    //tamaño y te lo imprime por pantalla

    public static void escribeArrayBi(int[][] a)
    {
        int i, k;

        for (i = 0; i < a.length; i++)
        {
            for (k = 0; k < a.length; k++)
            {
                System.out.print(a[i][k] + " ");
            }
            System.out.println();
        }
    }

    //6. Escribe la función rellenaAleatorioBi a la que le pasas un array bidimensional de
    //cualquier tamaño y te lo rellena con números aleatorios.

    public static void RellenaAleatorioBi(int[][] a)
    {
        int i, j;
        Random r = new Random();

        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a.length; j++)
            {
                int aleatorio = r.nextInt(99);
                a[i][j] = aleatorio;
            }
        }
    }
    //7. Escribe la función rellenaEnordenBi a la que le pasas un array bidimensional de
    //cualquier tamaño y te lo rellena con los números a partir del 1 en orden.

    public static void rellenaEnOrdenBi(int[][] a)
    {
        int i, j, cont = 1;

        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a.length; j++)
            {
                a[i][j] = cont;
                cont++;
            }
        }
    }

    //8. Escribe la función sumaArrayBi a la que le pasas un array bidimensional y te suma
    //todos los números. Te devuelve un entero con el resultado.

    public static int sumaArrayBi(int[][] a)
    {
        int i, j, suma = 0;

        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a.length; j++)
            {
                suma = suma + a[i][j];
            }
        }
        return suma;
    }

    //9. Escribe la función suma2ArraysBi que hace lo mismo, pero con tres arrays
    //bidimensionales de cualquier tamaño (siempre y cuando todos tengan las mismas
    //dimensiones).

    public static void suma2ArraysBi(int[][] a, int[][] b, int[][] c)
    {
        int i, j;

        if ((a.length != b.length || b.length != c.length) || (a[0].length != b[0].length || b[0].length != c[0].length))
        {
            System.out.println("¡¡¡ERROR!!!");
        } else
        {
            for (i = 0; i < a.length; i++)
            {
                for (j = 0; j < a.length; j++)
                {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }
        }
    }
    //10. Escribe la función copiaArrayBi a la que le pasas dos arrays, uno con datos y otro
    //vacío, y te copia el contenido del primero al segundo.

    public static void copiaArrayBi(int[][] a, int[][] b)
    {
        int i, j;
        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a.length; j++)
            {
                b[i][j] = a[i][j];
            }
        }
    }

    //11. Escribe la función copiaArrayBiPro a la que le pasas un array y te devuelve otro del
    //mismo tamaño y con los mismos datos.

    public static int[][] copiaArrayBiPro(int[][] a)
    {
        int i, j;
        int[][] b = new int[a.length][a[0].length];
        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a.length; j++)
            {
                b[i][j] = a[i][j];
            }
        }
        return b;
    }

    //12. Escribe la función rellenaArrayAjedrez que te rellena un array de 8x8 con la forma de
    //un tablero de ajedrez, usando el valor 1 para las casillas blancas y 0 para las negras

    public static void rellenaArrayAjedrez(int[][] a)
    {
        int i, j;
        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a.length; j++)
            {
                if (((i % 2 == 0) && (j % 2 == 0)) || ((j % 2 != 0) && (i % 2 != 0)))
                {
                    a[i][j] = 1;
                } else
                {
                    a[i][j] = 0;
                }
            }
        }
    }

    //13. Escribe la función rellenaDiagonal que te rellena un array cuadrado con el número ‘1’
    //en la diagonal principal, el número ‘2’ en el triángulo que queda por encima y el ‘3’ en
    //el triángulo que queda por debajo.

    public static void rellenaDiagonal(int[][] a)
    {
        int i, j;

        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a.length; j++)
            {
                if (j > i)
                {
                    a[i][j] = 2;
                } else if (j == i)
                {
                    a[i][j] = 1;
                } else
                {
                    a[i][j] = 3;
                }
            }
        }
    }

    //14. Escribe la función rellenaX que te rellena un array cuadrado con el número ‘1’ en las
    //dos diagonales y el ‘2’ en el resto.

    public static void rellenaX(int[][] a)
    {
        int i, j, cont = a.length - 1;


        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a.length; j++)
            {

                if ((j == i) || (j == cont))
                {
                    a[i][j] = 1;

                } else
                {
                    a[i][j] = 2;
                }

            }
            cont--;
        }
    }

    //15. Escribe la función rellenaCuadros que te rellena un array cuadrado de lado par (o sea,
    //2x2, 4x4, 6x6, etc.) en cuatro cuadros. El cuadro superior izquierdo lo rellena con ‘1’, el
    //superior derecho, con ‘2’, el inferior izquierdo con ‘3’ y el inferior derecho con ‘4’.

    public static void rellenaCuadros(int[][] a)
    {
        int i, j;
        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a.length; j++)
            {
                if ((i < a.length / 2) && (j < a.length / 2))
                {
                    a[i][j] = 1;
                } else if ((i >= a.length / 2) && (j >= a.length / 2))
                {
                    a[i][j] = 4;
                } else if ((i < a.length / 2) && (j >= a.length / 2))
                {
                    a[i][j] = 2;
                } else
                {
                    a[i][j] = 3;
                }
            }
        }
    }
    //---------------------------------------------ADICIONALES------------------------------------------------------

    //1. Escribe la función invierteBi a la que le pasas un array bidimensional cuadrado (es
    //decir, igual de alto que de ancho) y te lo invierte.

    public static void invierteBi(int[][] a)
    {
        int i, j;
        int[][] b = new int[a.length][a[0].length];

        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a.length; j++)
            {
                b[j][i] = a[i][j];
            }
        }
        for (i = 0; i < a.length; i++)
        {
            for (j = 0; j < a.length; j++)
            {
                a[i][j] = b[i][j];
            }
        }
    }
    //2. Escribe la función calculaDeterminante que te calcule el valor de un determinante de
    //3x3 y te lo devuelva. Si no sabéis cómo se calcula un determinante de 3x3, lo buscáis
    //en el internete


        public static void main (String[]args)
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
            System.out.println();
            System.out.println("----Adicionales----");
            System.out.println();
            System.out.println("16- Ejercicio 1 ");
            System.out.println("17- Ejercicio 2 ");


            System.out.println("Elige una opción");

            opcion = sc.nextInt();

            switch (opcion)
            {
                case 1:
                {
                    int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

                    escribeArray3x3(a);
                }
                break;

                case 2:
                {
                    int[][] a = new int[3][3];
                    rellena3x3(a);
                    escribeArray3x3(a);
                }
                break;

                case 3:
                {
                    int[][] a = new int[3][3];
                    RellenaAleatorio3x3(a);
                    escribeArray3x3(a);
                }
                break;

                case 4:
                {
                    int[][] a = new int[3][3];
                    RellenaAleatorio3x3(a);
                    escribeArray3x3(a);
                    System.out.println(sumaArray3x3(a));
                }
                break;

                case 5:
                {
                    int[][] a = {{1, 2, 3, 9}, {4, 5, 6, 1}, {7, 8, 9, 3}, {0, 1, 3, 3}};
                    escribeArrayBi(a);
                }
                break;

                case 6:
                {
                    int[][] a = new int[7][9];
                    RellenaAleatorioBi(a);
                    escribeArrayBi(a);
                }
                break;

                case 7:
                {
                    int[][] a = new int[7][9];
                    rellenaEnOrdenBi(a);
                    escribeArrayBi(a);

                }
                break;

                case 8:
                {
                    int[][] a = new int[8][8];
                    RellenaAleatorioBi(a);
                    escribeArrayBi(a);
                    System.out.println(sumaArrayBi(a));
                }
                break;

                case 9:
                {
                    int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
                    int[][] b = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
                    int[][] c = new int[3][6];
                    suma2ArraysBi(a, b, c);
                    escribeArrayBi(c);
                }
                break;

                case 10:
                {
                    int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
                    int[][] b = new int[3][3];
                    copiaArrayBi(a, b);
                    escribeArrayBi(b);
                }
                break;

                case 11:
                {
                    int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
                    escribeArrayBi(copiaArrayBiPro(a));
                }
                break;

                case 12:
                {
                    int[][] a = new int[8][8];
                    rellenaArrayAjedrez(a);
                    escribeArrayBi(a);
                }
                break;

                case 13:
                {
                    int[][] a = new int[8][8];
                    rellenaDiagonal(a);
                    escribeArrayBi(a);
                }
                break;

                case 14:
                {
                    int[][] a = new int[8][8];
                    rellenaX(a);
                    escribeArrayBi(a);
                }
                break;

                case 15:
                {
                    int[][] a = new int[42][42];
                    rellenaCuadros(a);
                    escribeArrayBi(a);
                }
                break;
                case 16:
                {
                    int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
                    invierteBi(a);
                    escribeArrayBi(a);
                }
                break;
                case 17:
                {

                }
                break;

            }
        }
    }

