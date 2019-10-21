package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args)
    {
        Perro dogo = new Perro("PEPE",RazaPerro.PastorAleman, LocalDate.now(),35,"A321");
        Gato cat = new Gato("JUAN",RazaCat.Normal, LocalDate.now(),4,"85921");
        Pajaro pajarraco = new Pajaro("JOSE CARLOS",TipoPajaro.Cacatua, LocalDate.now(),2.5,true);
        Reptil lagarto = new Reptil("ALBERTO",TipoReptil.DragonBarbudo, LocalDate.now(),0.7,false);
        ClinicaVeterinaria c = new ClinicaVeterinaria();


        c.insertaAnimal(dogo);
        c.insertaAnimal(cat);
        c.insertaAnimal(pajarraco);
        c.insertaAnimal(lagarto);

        
        System.out.println(dogo.toString());
        System.out.println(lagarto.toString());
        System.out.println(pajarraco.toString());
        System.out.println(lagarto.toString());

    }
}
