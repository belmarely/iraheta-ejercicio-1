package com.iraheta;

public class Matematica {
    public static int elevarNumero(int num, int exponente){
        int resultado =(int)Math.pow(num,exponente);
        System.out.println("El resultado es: " + resultado);
        return resultado;
    }

    public static double raizCuadrada(int num){
        double resultado= Math.sqrt(num);
        System.out.println("El resultado es: " + resultado);
        return resultado;
    }

    public static int numeroPrimo(int num){
        int cont = 0;
        for(int i = 1; i <= num; i++)
        {
            if((num % i) == 0)
            {
                cont++;
            }
        }
        if(cont <= 2)
        {
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
        return num;
    }
}
