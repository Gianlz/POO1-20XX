package funcao5;

import java.util.Scanner;

public class Exec5 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int imposto = entrada.nextInt();
        float total = entrada.nextFloat();

        System.out.println(FuncaoEx5.somaImposto(total,imposto));


        entrada.close();
    }
}
