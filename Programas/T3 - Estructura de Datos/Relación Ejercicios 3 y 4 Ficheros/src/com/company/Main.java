package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    //1. Escribe una función leeAlumnoLista a la que le pasas la lista de alumnos y te pide un
    //nuevo alumno desde el teclado, cuyos datos se añadirán a la lista.
    public static void leeAlumnoLista(List<FichaAlumno> a)
    {
        Scanner sc = new Scanner(System.in);
        int edad;
        double calificacion;
        String nombre, cont = "y";

        while (cont.equals("y"))
        {
            System.out.println("Introduce datos sobbre los alumnos: ");
            System.out.println("Introduce nombre: ");
            nombre = sc.next();
            System.out.println("Introduce edad: ");
            edad = sc.nextInt();
            System.out.println("Introduce calificacion: ");
            calificacion = sc.nextDouble();
            System.out.println("¿Quieres continuar introducioendo datos?(y/n)");
            cont = sc.next();

            FichaAlumno f = new FichaAlumno();
            f.nombre = nombre;
            f.edad = edad;
            f.calificacion = calificacion;
            a.add(f);
        }
    }

    //2. Escribe una función imprimeListaAlumnos a la que la pasas la lista de alumnos y te la
    //imprime por pantalla.


        public static void imprimeListaAlumnos ( List<FichaAlumno> a)
        {
            int i;
            for (i = 0; i < a.size(); i++)
            {
                if ( i == a.size() - 1)
                {
                    System.out.println("Nombre: " + a.get(i).nombre);
                    System.out.println("Edad: " + a.get(i).edad);
                    System.out.println("Calificación: " + a.get(i).calificacion);
                }
                else
                {
                    System.out.println("Nombre: " + a.get(i).nombre);
                    System.out.println("Edad: " + a.get(i).edad);
                    System.out.println("Calificación: " + a.get(i).calificacion);
                    System.out.println("-------------------------------------");
                }
            }
        }

    //3. Escribe una función escribeFicheroAlumnosBinario a la que le pasas la lista y el
    //nombre del fichero y te escribe la lista en el fichero. La estructura del fichero será la
    //siguiente:
    //- Al principio habrá un entero que será el número de alumnos que hay en la
    //lista.
    //- Después irán los registros, escribiéndose un String para el nombre, un int
    //para la edad y un double para la nota.
    //- Iremos escribiendo todos los registros uno a uno hasta el final.

    public static void escribeFicheroAlumnosBinario (List<FichaAlumno> a, String nombre)
    {
        int i;
        try
        {
            FileOutputStream fos = new FileOutputStream(nombre);
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeInt(a.size());

            for (i = 0; i < a.size(); i++)
            {
                dos.writeUTF(a.get(i).nombre);
                dos.writeInt(a.get(i).edad);
                dos.writeDouble(a.get(i).calificacion);
            }

            dos.close();
            fos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    //4. Escribe una función leeFicheroAlumnosBinario a la que le pasas una lista y el nombre
    //del fichero y leerá la lista desde el fichero. El fichero tendrá la misma estructura que el
    //del ejercicio anterior (evidentemente). La lista que nos pasen la borraremos antes de
    //leer los datos del fichero.

    public static void leeFicheroAlumnosBinario (List<FichaAlumno> a, String nombre)
    {

        FichaAlumno f = new FichaAlumno();
        int i, cont;
        try
        {
            FileInputStream fis = new FileInputStream(nombre);
            DataInputStream dis = new DataInputStream(fis);

            while(dis.available() > 0)
            {
                cont = dis.readInt();

                for(i = 0; i < cont; i++)
                {
                    f.nombre = dis.readUTF();
                    f.edad = dis.readInt();
                    f.calificacion = dis.readDouble();
                    a.add(f);
                }
            }

            dis.close();
            fis.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        imprimeListaAlumnos(a);
    }

    //5. Escribe la función escribeFicheroAlumnosTexto similar a la función del ejercicio 3 pero
    //usando un fichero de texto. La estructura del fichero será similar, pero ahora
    //guardaremos un valor en cada línea.

    public static void escribeFicheroAlumnosTexto (List<FichaAlumno> a, String  nombre)
    {
        int i;
        try
        {
            FileWriter fw = new FileWriter(nombre);
            BufferedWriter bw = new BufferedWriter(fw);

            for(i = 0; i <a.size(); i++)
            {
                bw.write(a.get(i).nombre);
                bw.newLine();
                bw.write(a.get(i).edad);
                bw.newLine();
                bw.write(String.valueOf(a.get(i).calificacion));
                bw.newLine();
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

    //6. Escribe la función leeFicheroAlumnosTexto similar a la función del ejercicio 4 pero que
    //funciona con los ficheros de texto del ejercicio anterior.
    //Los ficheros CSV (Comma Separated Values) (Valores Separados por Comas) son la
    //forma más simple de guardar una tabla de una base de datos. Cada registro va en una línea y
    //los valores de cada registro van separados por comas u otro valor de separación (por ejemplo,
    //punto y coma).

    public static void leeFicheroAlumnosTexto (List<FichaAlumno> a, String nombre)
    {
        int i;
        try
        {
            FileWriter fw = new FileWriter(nombre);
            BufferedWriter bw = new BufferedWriter(fw);

            for(i = 0; i <a.size(); i++)
            {
                bw.write(a.get(i).nombre);
                bw.newLine();
                bw.write(a.get(i).edad);
                bw.newLine();
                bw.write(String.valueOf(a.get(i).calificacion));
                bw.newLine();
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

    //7. Escribe la función escribeFicheroAlumnosCSV. En este caso, no vamos a guardar el
    //número de registros en la primera línea, ya que los ficheros CSV estándar no lo hacen.
    //Como carácter separador usaremos el punto y coma, ya que uno de los datos que
    //usamos ya contiene comas.

    public static void escribeFicheroAlumnosCSV (List<FichaAlumno> a, String nombre)
    {
        int i;
        try
        {
            FileWriter fw = new FileWriter(nombre);
            BufferedWriter bw = new BufferedWriter(fw);

            for(i = 0; i <a.size(); i++)
            {
                bw.write(a.get(i).nombre + ", ");
                bw.write(a.get(i).edad + ", ");
                bw.write(String.valueOf(a.get(i).calificacion) + ";");
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

    //8. Escribe la función leeFicheroAlumnosCSV que lee los datos del fichero anterior en una
    //lista. Para separar los datos, lo más fácil es usar la función Split de las cadenas. Con
    //esto conseguiremos un array de cadenas compuesto por tres cadenas: “Nombre”,
    //“Edad”, “Calificación”, que tendremos que convertir al tipo de dato adecuado y meter
    //en un registro FichaAlumno y luego en la lista.

    public static void leeFicheroAlumnosCSV (List<FichaAlumno> a, String nombre)
    {
        String s;
        FichaAlumno f = new FichaAlumno();
        try
        {
            FileReader fr = new FileReader(nombre);
            BufferedReader br = new BufferedReader(fr);

            s = br.readLine();

            while (s != null)
            {
                String[] parts = s.split(",");
                f.nombre = parts[0];
                f.edad = Integer.parseInt(parts[1]);
                f.calificacion = Double.parseDouble(parts[2]);
                a.add(f);
                s = br.readLine();
            }

            br.close();
            fr.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        imprimeListaAlumnos(a);
    }

    //1. Escribe la función cuantosFicheros a la que le pasas una extensión de archivo y te
    //devuelve un entero que nos dice cuántos ficheros con esa extensión hay en el
    //directorio actual.

    public static int cuantosFicheros (String extension)
    {
        int num = 0 , i;
        String s;
        File directorio = new File("E:\\DAW-1\\PROG\\Programas\\T3 - Estructura de Datos\\Relación Ejercicios 3 y 4 Ficheros");
        File[] fichero = directorio.listFiles();

        for(i = 0; i < fichero.length; i++)
        {
            if(fichero[i].isFile())
            {
                s = fichero[i].getName();
                //System.out.println(s);
                if(s.contains("."))
                {
                    String[] parts = s.split("\\.");

                    if (parts[parts.length - 1].equals(extension))
                    {
                        num++;
                    }
                }
            }
        }

        return num;
    }

    //2. Escribe la función cuantosFicherosPro a la que le pasas una extensión de archivo y una
    //carpeta y te dice cuántos archivos con esa extensión hay en esa carpeta.
    //Ej.: CuantosFicherosPro(“txt”, “C:\\Windows”) nos dirá cuántos ficheros .txt
    //hay en la carpeta C:\Windows.

    public static int cuantosFicherosPro (String extension, String carpeta)
    {
        int num = 0 , i;
        String s;
        File directorio = new File(carpeta);
        File[] fichero = directorio.listFiles();

        for(i = 0; i < fichero.length; i++)
        {
            if(fichero[i].isFile())
            {
                s = fichero[i].getName();
                //System.out.println(s);
                if(s.contains("."))
                {
                    String[] parts = s.split("\\.");

                    if (parts[parts.length - 1].equals(extension))
                    {
                        num++;
                    }
                }
            }
        }

        return num;
    }

    //3. Escribe la función creaBackup a la que le pasas un nombre de fichero. La función
    //copiará ese fichero en otro al que le añadiremos la extensión “.bak” (para tener una
    //copia de seguridad). Si el nuevo fichero existe, le añadiremos otra vez “.bak” hasta que
    //encontremos un nombre de fichero disponible.
    //Ej.: CreaBackup(“texto.txt”) copiará el fichero texto.txt a texto.txt.bak. Si este
    //nombre existe, lo copiará a texto.txt.bak.bak, etc.

    public static void creaBackup (String nombre)
    {
        File directorio = new File("E:\\DAW-1\\PROG\\Programas\\T3 - Estructura de Datos\\Relación Ejercicios 3 y 4 Ficheros");
        File[] fichero = directorio.listFiles();

        try
        {
            //Files.copy(Path.of(nombre), Path.of("copia.bak"));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    //4. Escribe la función renombraMasivo a la que le pasas dos extensiones de fichero. La
    //función te renombrará todos los ficheros que haya en el directorio actual con la
    //primera extensión y les pondrá la segunda extensión.
    //Ej.: RenombraMasivo(“txt”, “texto”) renombrará todos los ficheros *.txt a
    //*.texto.

    public static void renombraMasivo (String extension)
    {
        File directorio = new File(".");


        if(directorio.getName().contains(extension))
        {
            directorio.renameTo(new File("otronombre.txt"));

        }
    }

    //5. Escribe la función cuentaLineasFicheros a la que le pasas una extensión y te cuenta el
    //total de líneas que hay entre todos los ficheros con esa extensión que hay en la
    //carpeta actual (esos ficheros deberían ser de texto, que si no va a contar poco). El
    //resultado te lo devolverá en un entero.
    //Ej.: CuentaLineasFicheros(“txt”) te suma las líneas que tienen todos los
    //ficheros .txt de la carpeta actual.

    public static int cuentaLineasFicheros (String extension)
    {
        File directorio = new File(".");
        int lineas = 0;

        try
        {
            if(directorio.getName().contains(extension))
            {


            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return lineas;
    }

    // NO FUNCIONA

    //6. Escribe la función ficheroMasGrande que nos devuelve una cadena con el nombre del
    //fichero de mayor tamaño que haya en la carpeta actual

    public static double ficheroMasGrande ()
    {
        File fichero = new File(".");
        String nombre = "";
        double tam;
        tam = fichero.length();

        while (fichero.isAbsolute())
        {
            if (fichero.length() > tam)
            {
                tam = fichero.length();
            }
        }
        return tam;
    }

    //NO FUNCIONA

    //7. Escribe la función clasificaFicheros que te clasifica todos los ficheros que hay en la
    //carpeta actual de acuerdo a su extensión.
    //Ej.: Si en la carpeta actual están los ficheros: uno.txt, dos.txt, tres.exe, la función nos
    //escribirá: txt => 2, exe => 1.
    //La función no devolverá nada, sino que lo escribirá por pantalla con println
    //directamente.

    public static void clasificaFicheros ()
    {
        File fichero = new File(".");
        int txt = 0;

        if(fichero.isDirectory())
        {

            if (fichero.getName().contains(".txt"))
            {
                txt++;
            }
        }

        System.out.printf(".txt= " + txt);

    }

    public static void main(String[] args)
    {
        List<FichaAlumno> listaAlumnos = new ArrayList<FichaAlumno>();

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
        System.out.println("-----Relación Ejercicios 4-----");
        System.out.println("9. Ejercicio 1");
        System.out.println("10. Ejercicio 2");
        System.out.println("11. Ejercicio 3");
        System.out.println("12. Ejercicio 4");
        System.out.println("13. Ejercicio 5");
        System.out.println("15. Ejercicio 6");
        System.out.println("16. Ejercicio 7");
        System.out.println("Escribe una de las opciones (Para salir del programa introduce el número 0)");
        opcion = sc.nextInt();

        while (opcion != 0)
        {
            switch (opcion)
            {
                case 1:
                {
                    leeAlumnoLista(listaAlumnos);
                    System.out.println("Escribe una de las opciones (Para salir del programa introduce el número 0)");
                    System.out.println();
                    opcion = sc.nextInt();
                }
                break;
                case 2:
                {
                    imprimeListaAlumnos(listaAlumnos);
                    System.out.println("Escribe una de las opciones (Para salir del programa introduce el número 0)");
                    System.out.println();
                    opcion = sc.nextInt();
                }
                break;
                case 3:
                {
                    escribeFicheroAlumnosBinario(listaAlumnos, "NombreAlumnos.bin");
                    System.out.println("Escribe una de las opciones (Para salir del programa introduce el número 0)");
                    System.out.println();
                    opcion = sc.nextInt();
                }
                break;
                case 4:
                {
                    leeFicheroAlumnosBinario(listaAlumnos, "NombreAlumnos.bin");
                    System.out.println("Escribe una de las opciones (Para salir del programa introduce el número 0)");
                    System.out.println();
                    opcion = sc.nextInt();
                }
                break;
                case 5:
                {
                    escribeFicheroAlumnosTexto(listaAlumnos, "NombresAlumnos.txt");
                    System.out.println("Escribe una de las opciones (Para salir del programa introduce el número 0)");
                    System.out.println();
                    opcion = sc.nextInt();
                }
                break;
                case 6:
                {
                    System.out.println("Escribe una de las opciones (Para salir del programa introduce el número 0)");
                    System.out.println();
                    opcion = sc.nextInt();
                }
                break;
                case 7:
                {
                    escribeFicheroAlumnosCSV(listaAlumnos, "AlumnosCSV.txt");
                    System.out.println("Escribe una de las opciones (Para salir del programa introduce el número 0)");
                    System.out.println();
                    opcion = sc.nextInt();
                }
                break;
                case 8:
                {
                    leeFicheroAlumnosCSV(listaAlumnos, "AlumnosCSV.txt");
                    System.out.println("Escribe una de las opciones (Para salir del programa introduce el número 0)");
                    System.out.println();
                    opcion = sc.nextInt();
                }
                break;
                case 9:
                {
                    System.out.println(cuantosFicheros("txt"));
                    System.out.println("Escribe una de las opciones (Para salir del programa introduce el número 0)");
                    System.out.println();
                    opcion = sc.nextInt();
                }
                break;
                case 10:
                {
                    System.out.println(cuantosFicherosPro("txt", "E:\\DAW-1\\PROG\\Programas\\T3 - Estructura de Datos\\Relación Ejercicios 3 y 4 Ficheros"));
                    System.out.println("Escribe una de las opciones (Para salir del programa introduce el número 0)");
                    System.out.println();
                    opcion = sc.nextInt();
                }
                break;
                case 11:
                {
                    creaBackup("AlumnosCSV.txt");
                    System.out.println("Escribe una de las opciones (Para salir del programa introduce el número 0)");
                    System.out.println();
                    opcion = sc.nextInt();
                }
                break;
                case 12:
                {
                    renombraMasivo(".txt");
                    System.out.println("Escribe una de las opciones (Para salir del programa introduce el número 0)");
                    System.out.println();
                    opcion = sc.nextInt();
                }
                break;
                case 13:
                {
                    cuentaLineasFicheros(".txt");
                    System.out.println("Escribe una de las opciones (Para salir del programa introduce el número 0)");
                    System.out.println();
                    opcion = sc.nextInt();
                }
                break;
                case 14:
                {
                    ficheroMasGrande();
                    System.out.println("Escribe una de las opciones (Para salir del programa introduce el número 0)");
                    System.out.println();
                    opcion = sc.nextInt();
                }
                break;
                case 15:
                {
                    clasificaFicheros();
                    System.out.println("Escribe una de las opciones (Para salir del programa introduce el número 0)");
                    System.out.println();
                    opcion = sc.nextInt();
                }

            }
        }
    }
}

