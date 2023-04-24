package funcao8;

import funcao6.FuncaoEx6;

import java.util.Scanner;

public class Exec8 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int num = entrada.nextInt();

        System.out.println("Número de digitos: " + FuncaoEx8.tamanho(num));



        entrada.close();
    }
}
