package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double euros;
	double peseta;
    Scanner sc = new Scanner(System.in);

        System.out.println("Cantidad de Euros a convertir ");
        euros = sc.nextDouble();

        peseta = euros * 166.386;

        System.out.println( euros + " Euros son " + peseta + " Pesetas");


    }
}
