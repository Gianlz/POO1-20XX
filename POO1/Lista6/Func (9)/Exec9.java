package funcao9;

import funcao6.FuncaoEx6;

import java.util.Scanner;

public class Exec9 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int n1 = entrada.nextInt();

        System.out.println(FuncaoEx9.reverter(n1));

        entrada.close();
    }
}
