package com.company;

import java.util.Scanner;

public class Main
{
    //1. Escribe la función “numeroEspacios” a la que le pasamos una cadena y nos devuelve el
//número de espacios que contiene esa cadena (tanto al principio y al final como
//intercalados).


    public static int numeroEspacios(String a)
    {
        int espacios = 0, i;


        for (i = 0; i < a.length(); i++)
        {
            if (a.charAt(i) == ' ')
            {
                espacios++;
            }
        }

        return espacios;
    }

    //2. Escribe la función “numeroVocales” a la que le pasamos una cadena y nos devuelve el
    //número de vocales que hay en la cadena.

    public static int numeroVocales (String a)
    {
        int vocales = 0, i;

        for (i = 0; i < a.length(); i++)
        {
            if((a.charAt(i) == 'a') || (a.charAt(i) == 'e') || (a.charAt(i) == 'i') || (a.charAt(i) == 'o') || (a.charAt(i) == 'u'))
            {
                vocales++;
            }
        }

        return vocales;
    }

    //3. Escribe la función “esPalindromo” a la que le pasamos una cadena y nos dice si la cadena
    //es un palíndromo (true) o no (false). Un palíndromo es una palabra o frase que se lee
    //igual al revés que al derecho

    public static boolean esPalindromo (String a)
    {
        boolean pal = true;
        int i, j;

        for (i = 0, j = a.length() - 1; i < a.length()&& j > 0; i++ , j--)
        {
            if (a.charAt(i) != a.charAt(j))
            {
                pal = false;
            }

        }
        return pal;
    }

    //4. Escribe la función “contiene” a la que le pasamos una cadena y un carácter por
    //parámetro y nos dice si el carácter aparece en la cadena o no. Es igual que la función
    //contains. Evidentemente, no podéis usar esta función para hacer la vuestra

    public static boolean contiene (String a , char b)
    {
        boolean solucion = false;
        int i;

        for(i = 0; i < a.length(); i++)
        {
            if (b == a.charAt(i))
            {
                solucion = true;
            }
        }
        return solucion;
    }

    //5. Escribe la función “repiteCaracter” a la que le pasamos dos parámetros: un carácter y
    //un entero. La función nos devolverá una cadena que contendrá el carácter repetido
    //tantas veces como indique el entero. Ej.: repiteCaracter(‘A’, 5) = “AAAAA”.

    public static String repiteCaracter (char a, int b)
    {
        int i;
        String sol = "";

        for(i = 0; i < b; i++)
        {
            sol = sol + a;
        }

        return sol;
    }

    //6. Escribe las funciones “padLeft” y “padRight” a las que le pasaremos una cadena y una
    //longitud final. Ambas funciones nos añadirán espacios delante (padLeft) o detrás
    //(padRight) de nuestra cadena hasta que el tamaño de nuestra cadena llega a la longitud
    //que le hemos pasado.
    //Ejemplo: padLeft(“patata”, 10) nos añadirá 4 espacios delante de “patata” para que la
    //longitud final quede 10. El resultado sería “~~~~patata” (~ = espacio).
    //Estas funciones nos serán muy útiles para cuando queramos escribir por pantalla
    //listados y tablas de manera elegante

    public static String padLeft (String a, int l)
    {
        int i, aux;
        String auxiliar = "";
        String sol;
        aux = l - a.length();

        for (i = 0; i < aux; i++)
        {
            auxiliar = " " + auxiliar;
        }
        sol = auxiliar + a;

        return sol;
    }

    public static String padRight (String a, int l)
    {
        int i, aux;
        String auxiliar = "";
        String sol;
        aux = l - a.length();

        for (i = 0; i < aux; i++)
        {
            auxiliar = " " + auxiliar;
        }
        sol = a + auxiliar;

        return sol;
    }

    //7. Escribe la función “quitaEspacios” a la que le pasamos una cadena y nos devuelve la
    //misma cadena, pero con todos los espacios quitados (tanto los del principio como los
    //del final como los intermedios).

    public static String quitaEspacios (String a)
    {
        int i;
        String sol = "";

        for(i = 0; i < a.length(); i++)
        {
            if (a.charAt(i) != ' ')
            {
                sol = sol + a.charAt(i);
            }
        }
        return sol;
    }

    //8. Escribe la función “quitaEspaciosTrim” a la que le pasamos una cadena y nos devuelve
    //otra cadena igual que la primera en la que se han eliminado los espacios que haya al
    //principio y al final. No se puede utilizar trim, obviamente

    public static String quitaEspaciosTrim (String a)
    {
        int i, iz = 0, dc = 0;
        String solucion = "";

        for (i = 0; i < a.length(); i++)
        {
            if (a.charAt(i) != ' ')
            {
                break;
            }
            iz++;
        }
        for (i = a.length() - 1 ; i > 0; i--)
        {
            if (a.charAt(i) != ' ')
            {
                break;
            }
            dc++;
        }

        for (i = iz; i < a.length() - dc; i++)
        {
            solucion = solucion + a.charAt(i);
        }

        return solucion;
    }

    //9. Escribe la función “sustituyeCaracter” a la que le pasamos una cadena, un carácter y
    //otro carácter y nos devuelve otra cadena igual que la primera en la que se ha sustituido
    //el primer carácter por el segundo carácter. Ojo, en las cadenas, al contrario que en los
    //arrays, no podemos modificar directamente un valor al estilo de cadena[2] = ‘A’ (los
    //corchetes sólo sirven para leer el valor, no para modificarlo).

    public static String sustituyeCaracter (String a, char b, char c)
    {
        int i;
        String solucion = "";

        for (i = 0; i < a.length(); i++)
        {
            if(a.charAt(i) == b)
            {
                solucion = solucion + c;
            }
            else
            {
                solucion = solucion + a.charAt(i);
            }
        }

        return solucion;
    }

    //10. Escribe la función “cuentaPalabras” a la que le pasamos una cadena que contiene una
    //frase y nos devuelve el número de palabras que hay en la misma.

    public static int cuentaPalabras (String a)
    {
        int i, cont = 1;

        for(i = 0; i < a.length(); i++)
        {
            if(a.charAt(i) == ' ')
            {
                cont++;
            }
        }

        return cont;
    }

    //11. Escribe la función “esNumero”, a la que le pasamos una cadena y nos dice si está
    //formada enteramente por números o no. Esta función es muy interesante para
    //evitarnos errores a la hora de hacer un Scanner.nextInt(). Si queremos leer un número
    //del teclado, lo más correcto es leerlo con un Scanner.next() como si fuera una cadena,
    //después comprobar con la función esNumero si está formado completamente por
    //dígitos y después convertirlo a entero con, por ejemplo, un Integer.parseInt().

    public static boolean esNumero (String a)
    {
        boolean solucion = true;
        int i;
        for(i = 0; i < a.length(); i++)
        {
            if((a.charAt(i) != 0) || (a.charAt(i) != 1) ||(a.charAt(i) != 2) ||(a.charAt(i) != 3) ||(a.charAt(i) != 4) ||(a.charAt(i) != 5) ||(a.charAt(i) != 6) ||(a.charAt(i) != 7) ||
                    (a.charAt(i) != 8) ||(a.charAt(i) != 9))
            {
                solucion = false;
                return solucion;
            }
            else
            {
                solucion = true;
            }
        }
        return solucion;
    }

    //12. Escribe la función “quitaCaracter” a la que le pasamos una cadena y un carácter y nos
    //devuelve la cadena, pero con todas las ocurrencias de ese carácter quitadas.

    public static String quitaCaracter (String a, char b)
    {
        int i;
        String solucion = "";
        for(i = 0; i < a.length(); i++)
        {
            if(a.charAt(i) != b)
            {
                solucion = solucion + a.charAt(i);
            }
        }
        return solucion;
    }

    //13. Escribe la función “quitaAcentos” a la que le pasas una cadena con caracteres
    //acentuados y te devuelve la cadena con los acentos quitados (esto se hace para algunos
    //programas que no se enteran de los acentos).

    public static String quitaAcentos (String a)
    {
        int i;
        String solucion = "";
        for(i = 0; i < a.length(); i++)
        {
            if(a.charAt(i) == 'á')
            {
                solucion = solucion + 'a';
            }
            else if (a.charAt(i) == 'é')
            {
                solucion = solucion + 'e';
            }
            else if (a.charAt(i) == 'í')
            {
                solucion = solucion + 'i';
            }
            else if (a.charAt(i) == 'ó')
            {
                solucion = solucion + 'o';
            }
            else if (a.charAt(i) == 'ú')
            {
                solucion = solucion + 'u';
            }
            else
            {
                solucion = solucion + a.charAt(i);
            }
        }
        return solucion;
    }

    //14. Escribe la función “invierteCadena” a la que le pasamos una cadena y nos la devuelve
    //invertida (de detrás para delante, vamos).

    public static String invierteCadena (String a)
    {
        int i;
        String solucion = "";

        for(i = a.length() - 1; i >= 0; i--)
        {
            solucion = solucion + a.charAt(i);
        }
        return solucion;
    }

    //15. Escribe la función “vecesCaracter” a la que le pasamos una cadena y un carácter y nos
    //dice cuántas veces se repite ese carácter.

    public static int vecesCaracter (String a, char b)
    {
        int i, cont = 0;

        for(i = 0; i < a.length(); i++)
        {
            if(a.charAt(i) == b)
            {
                cont++;
            }
        }
        return cont;
    }

    //16. Escribe la función “vecesPalabra” a la que le pasamos una cadena y una palabra (otra
    //cadena) y nos dice cuántas veces se repite esa palabra en la cadena.

    public static int vecesPalabra (String a, String b)
    {
        int i, cont = 0 , palabras = 0;
        String solucion = "";

        for(i = 0; i < a.length(); i++)
        {
            solucion = solucion + a.charAt(i);

            if(a.charAt(i) != ' ')
            {
               for (cont = i; cont <= 0; cont --)
               {
                   if (a.charAt(i) == b.charAt(i))
                   {
                       palabras ++;
                   }
               }
            }
            cont ++;
        }
        return palabras;
    }

    //17. Escribe la función “mayusculasPrimera” a la que le pasas una cadena y te devuelve la
    //cadena con la primera letra de cada palabra puesta en mayúsculas

    public static String mayusculaPrimera (String a)
    {
        int i;
        String solucion = "";

        for(i = 0; i < a.length(); i++)
        {
            solucion = solucion + a.charAt(i);

            if(a.charAt(i) == ' ')
            {
                Character.toUpperCase(a.charAt(i + 1));
            }
        }
        return solucion;
        // no funciona
    }

    //18. Escribe la función “sustituyePalabra” a la que le pasamos una cadena y dos palabras y
    //nos devuelve otra cadena en la que haya que sustituir la primera por la segunda.

    public static String sustituyePalabra (String a, String b, String c)
    {
        String s = "";
        int i;

        for(i = 0; i < a.length(); i++)
        {
            s = s +a.charAt(i);
        }
        s = s.replaceAll(b, c);

        return s;
    }

    //19. Escribe una función “inviertePalabras” a la que la pasamos una cadena y nos devuelve
    //otra en la que están invertidas todas las palabras (no la cadena entera, sino cada palabra
    //independientemente)

    public static String inviertePalabras (String a)
    {
        String solucion = "";
        int i, cont = 0;
        String[] arrayPalabras = a.split(" ");

        for (i = 0; i < a.length(); i++)
        {
            if (a.charAt(i) == ' ')
            {
                cont++;
            }

        }
        return solucion;
        // no funciona
    }

    //20. Escribe la función “quitaEspaciosSobrantes” a la que le pasamos una cadena por
    //parámetro y nos devuelve otra. La cadena que le pasamos podrá tener espacios
    //delante y detrás, además de espacios entre las palabras. Para obtener la cadena
    //resultado, tendremos que quitar los espacios de delante y de detrás y si entre dos
    //palabras hay más de un espacio, deberemos dejar sólo uno.
    //Ej.: “~~~Mi~~mamá~~~~me~mima~~” -> “Mi~mamá~me~mima” (~ = espacio)

    public static String quitaEspaciosSobrantes (String a)
    {
        quitaEspaciosTrim(a);
        int i;
        String solucion = "";

        for (i = 0; i < a.length(); i++)
        {
            solucion = solucion + a.charAt(i);

            if ((a.charAt(i) == ' ') && (a.charAt(i + 1) == ' '))
            {
                i++;
            }
        }

        return solucion;
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

        System.out.println("Elige una opción");

        opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                String ejemplo = "Hola mundo que tal ";
                System.out.println(numeroEspacios(ejemplo));
            }
            break;

            case 2:
            {
                String ejemplo = "Hola mundo que tal ";
                System.out.println(numeroVocales(ejemplo));
            }
            break;

            case 3:
            {
                String ejemplo = "abctedcba";
                        if(esPalindromo(ejemplo))
                        {
                            System.out.println("Es palindromo");
                        }
                        else
                        {
                            System.out.println("No es palindromo");
                        }
            }
            break;

            case 4:
            {
                String ejemplo = "Hola mundo";
                char c = 'w';

                if(contiene(ejemplo, c))
                {
                    System.out.println("La contiene ");
                }
                else
                {
                    System.out.println("No la contiene");
                }
            }
            break;

            case 5:
            {
                int m = 15;
                char a = 'A';

                System.out.println(repiteCaracter(a, m));
            }
            break;

            case 6:
            {
                System.out.println("¿Espacios a la derecha (1) o a la izquierda (2)?");
                opcion = sc.nextInt();
                switch (opcion)
                {
                    case 1:
                    {
                        System.out.println();
                        int m = 15;
                        String ejemplo = "Hola";

                        System.out.println(padLeft(ejemplo, m));
                    }
                    break;

                    case 2:
                    {
                        System.out.println();
                        int m = 15;
                        String ejemplo = "Hola";

                        System.out.println(padRight(ejemplo, m));
                    }
                    break;

                }
            }
            break;

            case 7:
            {
                String ejemplo = "Hola mundo que tal ";
                System.out.println(quitaEspacios(ejemplo));
            }
            break;

            case 8:
            {
                String ejemplo = "           Hola mundo que tal              ";
                System.out.println(quitaEspaciosTrim(ejemplo));
            }
            break;

            case 9:
            {
                String ejemplo = "Hola mundo que tal ";
                char a = 'a';
                char b = 'o';
                System.out.println(sustituyeCaracter(ejemplo, b , a));
            }
            break;

            case 10:
            {
                String ejemplo = "Hola mundo que tal como estas";
                System.out.println(cuentaPalabras(ejemplo));

            }
            break;

            case 11:
            {
                String ejemplo = "12345h";
                if (esNumero(ejemplo))
                {
                    System.out.printf("Tiene alguna letra");
                }
                else
                {
                    System.out.printf("Solo tiene numeros");
                }
            }
            break;

            case 12:
            {
                char a = 'a';
                String ejemplo = "Hola mundo que tal como estas";
                System.out.println(quitaCaracter(ejemplo, a));
            }
            break;

            case 13:
            {
                String ejemplo = "Hola mundo qué tal como estás";
                System.out.println(quitaAcentos(ejemplo));
            }
            break;

            case 14:
            {
                String ejemplo = "Hola mundo qué tal como estás";
                System.out.println(invierteCadena(ejemplo));
            }
            break;

            case 15:
            {
                char a = 'o';
                String ejemplo = "Hola mundo qué tal como estás";
                System.out.println(vecesCaracter(ejemplo, a));
            }
            break;

            case 16:
            {
                String ejemplo1 = "mundo";
                String ejemplo = "Hola mundo qué tal como estás";
                System.out.println(vecesPalabra(ejemplo, ejemplo1));
            }
            break;

            case 17:
            {
                String ejemplo = "Hola mundo qué tal como estás";
                System.out.println(mayusculaPrimera(ejemplo));
            }
            break;

            case 18:
            {
                String a = "mundo";
                String b = "gente";
                String ejemplo = "Hola mundo qué tal como estás";
                System.out.println(sustituyePalabra(ejemplo, a, b));
            }
            break;

            case 19:
            {

            }
            break;

            case 20:
            {
                String ejemplo = "  Hola  mundo  qué tal  como estás  ";
                System.out.println(quitaEspaciosSobrantes(ejemplo));
            }
            break;


        }
    }
}
