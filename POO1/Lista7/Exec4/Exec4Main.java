package lista7.Exec4;

import java.util.Scanner;

public class Exec4Main {

    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        double ganha = entrada.nextDouble();
        double trabalhado = entrada.nextDouble();

        Exec4 calc = new Exec4(ganha,trabalhado);

        calc.salB();
        calc.INSS();
        calc.IR();
        calc.sindicato();
        calc.salL();

        entrada.close();
    }
}
