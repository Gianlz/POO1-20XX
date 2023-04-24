package Funcao7;

import funcao6.FuncaoEx6;

import java.util.Scanner;

public class Exec7 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        float presta = entrada.nextFloat();
        int dias = entrada.nextInt();

        presta = FuncaoEx7.valorPagamento(presta,dias);
        System.out.println("Total a ser pago: " + presta);


        entrada.close();
    }
}
