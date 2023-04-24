package Funcao7;

import java.util.Scanner;

public class FuncaoEx7 {

    public static float valorPagamento(float n1, float n2) {

        if (n2 == 0)
        {
            return n1;
        }
        else
        {
            n2 = (float) (n2 * 0.1 + (n1 * 3 / 100));

            return (n1 + n2);
        }
    }
}