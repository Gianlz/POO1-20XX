package funcao6;

import java.util.Scanner;

public class Exec6 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int horas;
        int minutos;
        char daytime;
        boolean fin = false;

        while (!fin)
        {
            horas = entrada.nextInt();
            minutos = entrada.nextInt();
            daytime = entrada.next().charAt(0);

            if (horas == 0)
            {
                fin = true;
            }

            FuncaoEx6.convertor(horas,minutos);
            FuncaoEx6_2.daytimer(daytime);
        }



        entrada.close();
    }
}
