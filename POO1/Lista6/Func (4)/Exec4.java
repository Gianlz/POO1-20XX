package funcao4;

import funcao3.FuncaoEx3;

import java.util.Scanner;

public class Exec4 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();

        String farinha;

        farinha = FuncaoEx4.resp(n);

        System.out.println(farinha);

        entrada.close();
    }
}
