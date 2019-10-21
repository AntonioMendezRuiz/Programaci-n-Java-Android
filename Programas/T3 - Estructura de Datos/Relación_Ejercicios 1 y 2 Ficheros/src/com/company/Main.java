package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    //1. Escribe una función escribeFicheroNumRandom10 a la que le pasas un nombre de
    //fichero y te crea un fichero con ese nombre que contiene 10 números aleatorios en
    //diferentes líneas

    public static void escribeFicheroNumRandom10 (String nombre)
    {
        Random r = new Random();
        int i;

        try
        {
            FileWriter fw = new FileWriter(nombre);
            BufferedWriter bw = new BufferedWriter(fw);

            for(i = 0; i < 10; i++)
            {
                int aleatorio = r.nextInt(10);

                bw.write(String.valueOf(aleatorio));
                bw.newLine();
            }

            bw.close();
            fw.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    //2. Escribe una función sumaFicheroInt10 a la que le pasas un fichero con 10 líneas (que
    //debe contener enteros en diferentes líneas, como el del ejercicio anterior) y te
    //devuelve la suma de todos los números contenidos en el fichero

    public static int sumaFicheroInt10 (String nombre)
    {
        int res = 0;
        String s;
        try
        {
            FileReader fr = new FileReader(nombre);
            BufferedReader br = new BufferedReader(fr);

            s = br.readLine();
            while(s != null)
            {
                res += Integer.valueOf(s);
                s = br.readLine();
            }

            br.close();
            fr.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return res;
    }

    //3. Escribe una función escribeFicheroNumRandom a la que le pasas un nombre de
    //fichero y un entero y te escribe tantos números aleatorios como le hayas dicho en un
    //fichero de texto.

    public static void escribeFicheroNumRandom (String nombre , int a)
    {
        Random r = new Random();
        int i;
        try
        {
            FileWriter fw = new FileWriter(nombre);
            BufferedWriter bw = new BufferedWriter(fw);

            for(i = 0; i < a; i++)
            {
                int aleatorio = r.nextInt(10);

                bw.write(String.valueOf(aleatorio));
                bw.newLine();
            }

            bw.close();
            fw.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    //4. Escribe una función sumaFicheroInt a la que le pasas un nombre de fichero y te
    //devuelve un entero resultante de sumar todos los números contenidos en el fichero
    //(que puede tener tantas líneas como haga falta).

    public static int sumaFicheroInt (String nombre)
    {
        int res = 0;
        String s;
        try
        {
            FileReader fr = new FileReader(nombre);
            BufferedReader br = new BufferedReader(fr);

            s = br.readLine();
            while(s != null)
            {
                res += Integer.valueOf(s);
                s = br.readLine();
            }

            br.close();
            fr.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return res;
    }

    //5. Escribe una función escribeFicheroTexto a la que le pasas un nombre de fichero. La
    //función ira pidiendo al usuario que escriba líneas de texto, que se irán guardando en el
    //fichero, hasta que introduzca una línea en blanco (“”).

    public static void escribeFicheroTexto (String nombre)
    {

        String  a;
        Scanner sc = new Scanner(System.in);
        try
        {
            FileWriter fw = new FileWriter(nombre);
            BufferedWriter bw = new BufferedWriter(fw);

            a = sc.nextLine();
            while (!a.isEmpty())
            {
                bw.write(a);
                bw.newLine();
                a = sc.nextLine();
            }
            bw.close();
            fw.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    // 6. Escribe la función leeFicheroTexto a la que le pasas un nombre de fichero y te pone el
    //contenido de fichero por pantalla.

    public static void leeFicheroTexto (String nombre)
    {
        String s;
        try
        {
            FileReader fr = new FileReader(nombre);
            BufferedReader br = new BufferedReader(fr);


            s = br.readLine();
            while(s != null)
            {
                System.out.println(s);
                s = br.readLine();
            }

            br.close();
            fr.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }


    //7. Escribe la función copiaFicheroTexto a la que le pasas dos nombres de fichero y copias
    //el contenido del primer fichero en el segundo.

    public static void copiaFicheroTexto (String nombre, String copia)
    {
        String s;
        try
        {
            FileReader fr = new FileReader(nombre);
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter(copia);
            BufferedWriter bw = new BufferedWriter(fw);

            s = br.readLine();
            while(s != null)
            {
                bw.write(s);
                s = br.readLine();
                bw.newLine();
            }

            bw.close();
            fw.close();

            br.close();
            fr.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    //8. Escribe la función invierteLineasFichero a las que la pasas dos nombres de fichero y te
    //copia las líneas del primer fichero al segundo fichero, pero invertidas (con el primer
    //carácter al final y el último al principio, etc.). Podéis usar la función de invertir cadenas
    //que ya tenéis hecha

    //Función auxiliar para invertir la cadena

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
    public static void invierteLineasFichero (String nombre, String copia)
    {
        String s;
        try
        {
            FileReader fr = new FileReader(nombre);
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter(copia);
            BufferedWriter bw = new BufferedWriter(fw);

            s = br.readLine();
            while (s != null)
            {
                bw.write(invierteCadena(s));
                s = br.readLine();
                bw.newLine();
            }

            bw.close();
            fw.close();

            br.close();
            fr.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    //9. Escribe la función invierteFicheroTexto a la que le pasas un nombre de fichero y te
    //invierte el contenido del fichero, es decir, la primera línea la pone la última, la segunda
    //la pone la penúltima, etc. Hay varias formas de hacerlo; la más fácil es con una lista de
    //cadenas.

    public static void invierteFicheroTexto (String nombre)
    {
        List<String> lista = new ArrayList<>();
        String s;
        int  i;
        try
        {
            FileReader fr = new FileReader(nombre);
            BufferedReader br = new BufferedReader(fr);

            s = br.readLine();
            while (s != null)
            {
                lista.add(s);
                s = br.readLine();

            }
            br.close();
            fr.close();

            FileWriter fw = new FileWriter(nombre);
            BufferedWriter bw = new BufferedWriter(fw);

            for(i = lista.size() - 1; i >= 0; i--)
            {
                bw.write(lista.get(i));
                bw.newLine();
            }

            bw.close();
            fw.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    //10. Escribe la función separaPalabrasFichero a la que le pasas dos nombres de fichero. Te
    //cogerá el primer fichero (que contendrá frases) y te separará las palabras, que
    //escribirá en el segundo fichero (que tendrá una palabra en cada línea)

    public static void separaPalabrasFichero (String nombre, String nombre2)
    {
        List<String> lista = new ArrayList<>();
        String s, a;
        int  i;

        try
        {
            FileReader fr = new FileReader(nombre);
            BufferedReader br = new BufferedReader(fr);

            s = br.readLine();
            while (s != null)
            {
                lista.add(s);
                s = br.readLine();

            }
            br.close();
            fr.close();

            FileWriter fw = new FileWriter(nombre2);
            BufferedWriter bw = new BufferedWriter(fw);

            for(i = lista.size() - 1; i >= 0; i--)
            {
                if(lista.get(i).contains(" "))
                {
                    a = lista.get(i);
                    a.split(" ");
                    bw.write(a);
                    bw.newLine();
                }
            }

            bw.close();
            fw.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    //11. Escribe una función escribeFichero1_100 que te escriba en un fichero binario cuyo
    //nombre le pasas por parámetro (p.ej.: “datos01.bin”) los valores enteros desde 1 hasta
    //100.

    public static void escribeFichero1_100 (String nombre)
    {
        int i;
        try
        {
            FileOutputStream fos = new FileOutputStream(nombre);
            DataOutputStream dos = new DataOutputStream(fos);

            for(i = 1; i <= 100; i++)
            {
                dos.write(i);
            }
            dos.close();
            fos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    //12. Escribe una función leeFicheroInt100 que te lea del fichero que le pasas por
    //parámetro los 100 primeros valores enteros.

    public static void leeFicheroInt100 (String nombre)
    {
        try
        {
            FileInputStream fis = new FileInputStream(nombre);
            DataInputStream dis = new DataInputStream(fis);

            while(dis.available() > 0)
            {
                System.out.println(dis.read());
            }

            dis.close();
            fis.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    //13. Escribe una función escribeFicheroIntAleatorio a la que le pasas el nombre del fichero
    //y cuántos números aleatorios queremos escribir en el mismo. Los números aleatorios
    //serán entre 1 y 100 y serán de tipo int.

    public static void escribeFicheroIntAleatorio (String nombre , int a)
    {
        Random r = new Random(100);
        int i;
        try
        {
            FileOutputStream fos = new FileOutputStream(nombre);
            DataOutputStream dos = new DataOutputStream(fos);

            for(i = 1; i <= a; i++)
            {
                int aleatorio = r.nextInt(100);
                dos.write(aleatorio);
            }
            dos.close();
            fos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    //14. Escribe una función escribeFicheroIntAleatorioPro a la que le pasas lo siguiente: el
    //nombre del fichero, número de valores que se van a generar, el valor mínimo y el valor
    //máximo. Así, escribeFicheroIntAleatorioPro(“datos.bin”, 10, -5, 5) nos escribirá diez
    //valores aleatorios entre -5 y 5 en el fichero datos.bin.

    public static void escribeFicheroIntAleatorioPro (String nombre, int val, int min, int max)
    {
        Random r = new Random();
        int i;
        try
        {
            FileOutputStream fos = new FileOutputStream(nombre);
            DataOutputStream dos = new DataOutputStream(fos);

            for(i = 1; i <= val; i++)
            {
                int aleatorio = r.nextInt(max - min) + min;
                dos.write(aleatorio);
            }
            dos.close();
            fos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    //15. Escribe una función leeFicheroInt que te lea del fichero que le pasas por parámetro
    //todos los valores enteros que haya en él.

    public static void leeFicheroInt (String nombre)
    {
        try
        {
            FileInputStream fis = new FileInputStream(nombre);
            DataInputStream dis = new DataInputStream(fis);

            while(dis.available() > 0)
            {
                System.out.println(dis.read());
            }

            dis.close();
            fis.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    //16. Escribe una función sumaFicheroInt que te lea de un fichero todos los valores enteros,
    //los sume y te devuelva el resultado.

    public static int sumaFicheroIntBinario (String nombre)
    {
        int suma = 0;
        try
        {
            FileInputStream fis = new FileInputStream(nombre);
            DataInputStream dis = new DataInputStream(fis);

            while(dis.available() > 0)
            {
                suma = suma + dis.read();
            }

            dis.close();
            fis.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return suma;
    }

    //17. Escribe una función leeFicheroIntLista que te lea de un fichero todos los valores
    //enteros. Los valores los irá almacenando en una lista de enteros que devolverá. El
    //prototipo de la función será: List<Integer> LeeFicheroIntLista(String nombre_fichero).

    public static List leeFicheroIntLista (String nombre)
    {
        List<Integer> lista = new ArrayList<>();

        try
        {
            FileInputStream fis = new FileInputStream(nombre);
            DataInputStream dis = new DataInputStream(fis);

            while(dis.available() > 0)
            {
               lista.add(dis.read());
            }

            dis.close();
            fis.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return lista;
    }

    //18. Escribe una función escribeFicheroIntLista que te escriba en un fichero todos los
    //valores enteros de la lista que le pasamos por parámetro. El prototipo de la función
    //será: void LeeFicheroIntLista(String nombre_fichero, List<Integer> lista).

    public static void escribeFicheroIntLista (String nombre, List<Integer> lista)
    {
        int i;
        try
        {
            FileOutputStream fos = new FileOutputStream(nombre);
            DataOutputStream dos = new DataOutputStream(fos);

            for(i = 0; i < lista.size(); i++)
            {
                dos.write(lista.get(i));
            }
            dos.close();
            fos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    //19. Escribe una función ordenaFicheroInt que te lea de un fichero los valores enteros que
    //haya, los ordene y vuelva a escribir en el mismo fichero los valores ya ordenados.

    //Función auxiliar para ordenar la lista

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

    public static void ordenaFicheroInt (String nombre)
    {
        List<Integer> lista = new ArrayList<>();

        try
        {
            FileInputStream fis = new FileInputStream(nombre);
            DataInputStream dis = new DataInputStream(fis);

            while(dis.available() > 0)
            {
                lista.add(dis.readInt());
            }
            dis.close();
            fis.close();
            ordenaListaSeleccion(lista);

            escribeFicheroIntLista(nombre, lista);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    //20. Escribe una función separaFicheroInt a la que le pasaremos el nombre del fichero que
    //queremos separar. La función nos creará dos ficheros que tendrán el mismo nombre
    //que el de origen pero añadiéndole “positivos” o “negativos” detrás (ej.: “datos.bin” ->
    //“datos.binpositivos”, “datos.binnegativos”). En un fichero guardaremos todos los
    //números positivos que haya en el primer fichero y en el otro los negativos.

    public static void separaFicheroInt (String nombre)
    {
        List<Integer> listapos = new ArrayList<>();
        List<Integer> listaneg = new ArrayList<>();
        int i;

        try
        {
            FileInputStream fis = new FileInputStream(nombre);
            DataInputStream dis = new DataInputStream(fis);

            while(dis.available() > 0)
            {
                if(dis.read() < 0)
                {
                    listaneg.add(dis.read());
                }
                else
                {
                    listapos.add(dis.read());
                }
            }
            dis.close();
            fis.close();

            FileOutputStream fos = new FileOutputStream("datos.binpositivos");
            DataOutputStream dos = new DataOutputStream(fos);

            for(i = 0; i < listapos.size(); i++)
            {
                dos.write(listapos.get(i));
            }

            dos.close();
            fos.close();

            FileOutputStream fos1 = new FileOutputStream("datos.binnegativos");
            DataOutputStream dos1 = new DataOutputStream(fos);

            for(i = 0; i < listaneg.size(); i++)
            {
                dos1.write(listaneg .get(i));
            }

            dos1.close();
            fos1.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    //21. Escribe una función invierteFicheroInt a la que le pasaremos un fichero que contiene
    //enteros e invertirá la posición de los valores dentro del fichero, es decir, lo escribirá de
    //atrás para delante.

    public static void invierteFicheroInt (String nombre)
    {
        List<Integer> lista = new ArrayList<>();
        List<Integer> listaInversa = new ArrayList<>();
        int i, cont;
        try
        {
            FileInputStream fis = new FileInputStream(nombre);
            DataInputStream dis = new DataInputStream(fis);

            while(dis.available() > 0)
            {
                lista.add(dis.readInt());
            }
            dis.close();
            fis.close();
            cont = lista.size();
            for(i=0; i < lista.size(); i++)
            {
                listaInversa.add(cont, lista.get(i));
                cont--;
            }

            escribeFicheroIntLista(nombre, lista);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Ejercicio 4");
        System.out.println("5. Ejercicio 5");
        System.out.println("6. Ejercicio 6");
        System.out.println("7. Ejercicio 7");
        System.out.println("8. Ejercicio 8");
        System.out.println("9. Ejercicio 9");
        System.out.println("10. Ejercicio 10");
        System.out.println("11. Ejercicio 11");
        System.out.println("12. Ejercicio 12");
        System.out.println("13. Ejercicio 14");
        System.out.println("15. Ejercicio 15");
        System.out.println("16. Ejercicio 16");
        System.out.println("17. Ejercicio 17");
        System.out.println("18. Ejercicio 18");
        System.out.println("19. Ejercicio 19");
        System.out.println("20. Ejercicio 20");
        System.out.println("21. Ejercicio 21");
        System.out.println("Escribe una de las opciones");
        opcion = sc.nextInt();

        switch(opcion){
            case 1:
            {
                String nombre = "Fichero Ejercicio 1.txt";
                escribeFicheroNumRandom10(nombre);
            }
            break;
            case 2:
            {
                String nombre = "Fichero Ejercicio 1.txt";
                System.out.println(sumaFicheroInt10(nombre));
            }
            break;
            case 3:
            {
                String nombre = "Fichero Ejercicio 3.txt";
                escribeFicheroNumRandom(nombre, 33);
            }
            break;
            case 4:
            {
                String nombre = "Fichero Ejercicio 3.txt";
                System.out.println(sumaFicheroInt(nombre));
            }
            break;
            case 5:
            {
                String nombre = "Fichero Ejercicio 5.txt";
                escribeFicheroTexto(nombre);
            }
            break;
            case 6:
            {
                String nombre = "Fichero Ejercicio 5.txt";
                leeFicheroTexto(nombre);
            }
            break;
            case 7:
            {
                String nombre = "Fichero Ejercicio 7 copia.txt";
                copiaFicheroTexto("Fichero Ejercicio 7.txt", nombre);
            }
            break;
            case 8:
            {
                String nombre = "Fichero Ejercicio 8 copia invertida.txt";
                invierteLineasFichero("Fichero Ejercicio 7.txt", nombre);
            }
            break;
            case 9:
            {
                invierteFicheroTexto("Fichero Ejercicio 9.txt");
            }
            break;
            case 10:
            {
                String nombre = "Fichero Ejercicio 10.txt";
                separaPalabrasFichero("Fichero Ejercicio 9.txt" , nombre);
            }
            break;
            case 11:
            {
                String nombre = "Fichero Ejercicio 11.bin";
                escribeFichero1_100(nombre);
            }
            break;
            case 12:
            {
                String nombre = "Fichero Ejercicio 11.bin";
                leeFicheroInt100(nombre);
            }
            break;
            case 13:
            {
                String nombre = "Fichero Ejercicio 13.bin";
                escribeFicheroIntAleatorio(nombre, 10);
            }
            break;
            case 14:
            {
                String nombre = "Fichero Ejercicio 14.bin";
                escribeFicheroIntAleatorioPro(nombre, 10,10, 60);
            }
            break;
            case 15:
            {
                String nombre = "Fichero Ejercicio 14.bin";
                leeFicheroInt(nombre);
            }
            break;
            case 16:
            {
                String nombre = "Fichero Ejercicio 14.bin";
                System.out.println(sumaFicheroIntBinario(nombre));
            }
            break;
            case 17:
            {
                String nombre = "Fichero Ejercicio 14.bin";
                System.out.println(leeFicheroIntLista(nombre));
            }
            break;
            case 18:
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

                String nombre = "Fichero Ejercicio 18.bin";
                escribeFicheroIntLista(nombre, lista);
            }
            break;
            case 19:
            {
                String nombre = "Fichero Ejercicio 18.bin";
                ordenaFicheroInt(nombre);
            }
            break;
            case 20:
            {
                String nombre = "Fichero Ejercicio 14.bin";
                separaFicheroInt(nombre);
            }
            break;
            case 21:
            {
                String nombre = "Fichero Ejercicio 14.bin";
                invierteFicheroTexto(nombre);
            }
            break;


        }
    }
}
