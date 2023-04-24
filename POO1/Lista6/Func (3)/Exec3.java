package funcao3;

import java.util.Scanner;

public class Exec3 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        int n3 = entrada.nextInt();

        System.out.println(FuncaoEx3.soma(n1,n2,n3));

        entrada.close();
    }
}
