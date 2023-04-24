package funcao13;

public class FuncaoEx13 {

    public static void desenho (int n1, int n2){

        for (int linha = 0; linha < n1; linha++)
        {
            if (linha == 0)
            {
                System.out.print("+");
            }
            else if (linha == n1 - 1)
            {
                System.out.println("+");
            }
            else
            {
                System.out.print("-");
            }
        }

        for (int coluna = 0; coluna < n2; coluna++)
        {
            if (coluna == 0)
            {
                System.out.print("|");
            }
            else if (coluna == n2 - 1)
            {
                System.out.println("|");
            }
            else
            {
                System.out.print(" ");
            }
        }

        for (int linha = 0; linha < n1; linha++)
        {
            if (linha == 0)
            {
                System.out.print("+");
            }
            else if (linha == n1 - 1)
            {
                System.out.println("+");
            }
            else
            {
                System.out.print("-");
            }
        }

    }
}
