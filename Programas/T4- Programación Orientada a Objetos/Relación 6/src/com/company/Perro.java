package com.company;

import java.time.LocalDate;
    //Enumerado de razas
    enum RazaPerro{HuskySiberiano, Bodeguero, Dalmata, PastorAleman}

    public class Perro extends Animal
    {
        //Atributos
        private RazaPerro raza;
        private String microchip;

        //Constructor

        public Perro(String nombre, RazaPerro raza, LocalDate fechaNacimiento, double peso, String microchip)
        {
            this.nombre = nombre;
            this.raza = raza;
            this.fechaNacimiento = fechaNacimiento;
            this.peso = peso;
            this.microchip = microchip;
        }

        //Métodos

        public RazaPerro getRaza()
        {
            return raza;
        }

        public String getMicrochip()
        {
            return microchip;
        }
        public String toString()
        {
            String s = "Ficha de Perro\n";
            s = s + "Nombre: " + this.nombre +"\n";
            s = s +"Raza: " + this.raza+"\n";
            s = s +"Fecha Nacimiento: " + this.fechaNacimiento+"\n";
            s = s +"Peso: "+ this.peso+"\n";
            s = s +"Microchip: " + this.microchip+"\n";
            s = s +"Comentarios: " + this.comentarios+"\n";
            return s;
        }
    }
