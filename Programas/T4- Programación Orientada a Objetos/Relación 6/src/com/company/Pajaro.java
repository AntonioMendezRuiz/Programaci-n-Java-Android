package com.company;

import java.time.LocalDate;

enum TipoPajaro{Cacatua, Periquito, gorrion}

public class Pajaro extends Animal
{
    //Atributos
    private TipoPajaro especie;
    private boolean cantor;

    //constructor
    public Pajaro(String nombre, TipoPajaro especie, LocalDate fechaNacimiento, double peso, boolean cantor)
    {
        this.nombre = nombre;
        this.especie = especie;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.cantor = cantor;
    }

    //Métodos
    public TipoPajaro getEspecie() {
        return especie;
    }
    public boolean getCantor(){
        return cantor;
    }

    public String toString() {
        String s = "Ficha de Pajaro\n";
        s = s + "Nombre: " + this.nombre +"\n";
        s = s +"Especie: " + this.especie+"\n";
        s = s +"Fecha Nacimiento: " + this.fechaNacimiento+"\n";
        s = s +"Peso: "+ this.peso+"\n";
        s = s +"Cantor: " + this.cantor+"\n";
        s = s +"Comentarios: " + this.comentarios+"\n";
        return s;
    }

}