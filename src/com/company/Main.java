package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        System.out.print("Número: ");
        int numero = sc.nextInt();

        System.out.println(numero);

        Pelicula pelicula = new Pelicula();

        pelicula.getTitulo();

    }
}
