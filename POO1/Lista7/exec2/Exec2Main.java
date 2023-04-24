package lista7.exec2;

import java.util.Scanner;

public class Exec2Main {

    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        int num2 = entrada.nextInt();

        Exec2 reverter = new Exec2(num, num2);

        entrada.close();
    }
}
