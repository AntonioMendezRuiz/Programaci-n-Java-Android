package com.company;

public class Pelicula
{
    public int id;
    public String titulo;
    public int anno;
    public boolean tieneOscar;
    public double valoracion;

    public String toString()
    {
        String s = "Ficha película";
        s = s + "ID: " + this.id;
        s = s + "Título: " + this.titulo;
        s = s + "Año: " + this.anno;
        s = s + "Tiene Oscar:" + this.tieneOscar;
        s = s + "Valoración: " + this.valoracion;
        return s;
    }
}
