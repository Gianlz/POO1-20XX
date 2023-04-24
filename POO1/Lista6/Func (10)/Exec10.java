package funcao10;

import java.util.Random;
import java.util.Scanner;

public class Exec10 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        char resp;
        Random n = new Random();
        boolean fin = false;
        int num;
        int ponto = 0;

        while (!fin)
        {
            resp = entrada.next().charAt(0);

            if (resp == 's')
            {
                fin = true;
            }
            else
            {
                num = n.nextInt(2,12);

                ponto = ponto + FuncaoEx10.craps(num, ponto);
            }
        }

        System.out.println(ponto);

        entrada.close();
    }
}
