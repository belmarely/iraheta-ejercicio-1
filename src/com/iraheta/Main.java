package com.iraheta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("*******************************************");
        System.out.println("\tBenvenido a Operaciones Matemáticas");
        System.out.println("*******************************************");
        boolean continuar = true;
        while (continuar) {
            System.out.println("1. Elevar un número");
            System.out.println("2. Raíz cuadrada");
            System.out.println("3. Determinar si el número es primo");
            System.out.println("4. Salir del Sistema");
            System.out.println(" ");
            int opcion = LectorDeDatos.solicitarEntero("Ingrese una opción: ");
            switch (opcion){
                case 1:
                    System.out.println("Elevar un número");
                    int num= LectorDeDatos.solicitarEntero("Ingrese el número: ");
                    int exponente= LectorDeDatos.solicitarEntero("Ingrese el número a elevar: ");
                    Matematica.elevarNumero(num, exponente);
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Raíz Cuadrada");
                    int nume= LectorDeDatos.solicitarEntero("Ingrese el número: ");
                    Matematica.raizCuadrada(nume);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Determine si es un número primo");
                    int numero= LectorDeDatos.solicitarEntero("Ingrese el número: ");
                    Matematica.numeroPrimo(numero);
                    System.out.println(" ");
                    break;
                case 4:
                    continuar =false;
                    System.out.println("Salio del Sistema de Operaciones Matemáticas");
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        }
    }
}
