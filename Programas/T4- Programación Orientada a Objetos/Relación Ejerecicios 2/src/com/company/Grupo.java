package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Grupo
{
    //Atributos

    private List<Alumno> listaAlumnos = new ArrayList<>();

    //Constructor

    public void grupo(List listaAlumnos)
    {
        this.listaAlumnos = listaAlumnos;
    }

    //Métodos

    public void insertaAlumnoLista (Alumno a)
    {
        listaAlumnos.add(a);
    }
    public void insertaAlumnoLista ()
    {
        Alumno a = new Alumno();
        a.alumno();
        listaAlumnos.add(a);
    }
    public void toString(List x)
    {
        int i;

        for(i = 0; i < x.size(); i++)
        {
            System.out.println(x.get(i) + "\n");
        }
    }

    public void escribeFicheroBinario (String bin)
    {
        int i;
        try
        {
            FileOutputStream fos = new FileOutputStream(bin);
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeInt(listaAlumnos.size());

            for (i = 0; i < listaAlumnos.size(); i++)
            {
                dos.writeUTF(listaAlumnos.get(i).getNombre());
                dos.writeInt(listaAlumnos.get(i).getEdad());
                dos.writeDouble(listaAlumnos.get(i).getCalificacion());
            }

            dos.close();
            fos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void leeFicheroBinario (String bin)
    {
        Alumno f = new Alumno();
        int i, cont;
        try
        {
            FileInputStream fis = new FileInputStream(bin);
            DataInputStream dis = new DataInputStream(fis);

            while(dis.available() > 0)
            {
                cont = dis.readInt();

                for(i = 0; i < cont; i++)
                {
                    //f.getNombre() = dis.readUTF();
                    //f.getEdad() = dis.readInt();
                    //f.getCalificacion() = dis.readDouble();
                    //listaAlumnos.add(f);
                    //Solucionar luego
                }
            }

            dis.close();
            fis.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void escribeFicheroTexto (String text)
    {
        int i;
        try
        {
            FileWriter fw = new FileWriter(text);
            BufferedWriter bw = new BufferedWriter(fw);

            for(i = 0; i <listaAlumnos.size(); i++)
            {
                bw.write(listaAlumnos.get(i).getNombre());
                bw.newLine();
                bw.write(listaAlumnos.get(i).getEdad());
                bw.newLine();
                bw.write(String.valueOf(listaAlumnos.get(i).getCalificacion()));
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
    public void leeFicheroAlumnosTexto (String text)
    {
        int i;
        try
        {
            FileWriter fw = new FileWriter(text);
            BufferedWriter bw = new BufferedWriter(fw);

            for(i = 0; i <listaAlumnos.size(); i++)
            {
                bw.write(listaAlumnos.get(i).getNombre());
                bw.newLine();
                bw.write(listaAlumnos.get(i).getEdad());
                bw.newLine();
                bw.write(String.valueOf(listaAlumnos.get(i).getCalificacion()));
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
    public void escribeFicheroAlumnosCSV (String nombre)
    {
        int i;
        try
        {
            FileWriter fw = new FileWriter(nombre);
            BufferedWriter bw = new BufferedWriter(fw);

            for(i = 0; i <listaAlumnos.size(); i++)
            {
                bw.write(listaAlumnos.get(i).getNombre() + ", ");
                bw.write(listaAlumnos.get(i).getEdad() + ", ");
                bw.write(String.valueOf(listaAlumnos.get(i).getCalificacion()) + ";");
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
    public void leeFicheroAlumnosCSV (String nombre)
    {
        String s;
        Alumno f = new Alumno();
        try
        {
            FileReader fr = new FileReader(nombre);
            BufferedReader br = new BufferedReader(fr);

            s = br.readLine();

            while (s != null)
            {
                //String[] parts = s.split(",");
                //f.getNombre() = parts[0];
                //f.getEdad() = Integer.parseInt(parts[1]);
                //f.getCalificacion() = Double.parseDouble(parts[2]);
                //a.add(f);
                //s = br.readLine();
            }

            br.close();
            fr.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
