package funcao13;

import java.util.Scanner;

public class Exec13 {

    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        int linha = entrada.nextInt();
        int coluna = entrada.nextInt();

        if (linha > 20)
        {
            linha = 20;
        }
        else if (linha < 1)
        {
            linha = 1;
        }

        if (coluna > 20)
        {
            coluna = 20;
        }
        else if (coluna < 1)
        {
            coluna = 1;
        }

        FuncaoEx13.desenho(linha,coluna);

        entrada.close();
    }
}
