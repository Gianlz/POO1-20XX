import java.util.Scanner;

public class Exec2 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int mercado[][] = new int[5][5];
        int media[] = new int[5];
        int total[] = new int[5];
        int maior = 0;
        int menor = 1000;

        for(int i = 0; i < 5; i++)
        {
            media[i] = 0;
            total[i] = 0;
        }

        for (int i = 0;i < 5; i++)
        {
            for (int j = 0; j < 5; j++){
                mercado[i][j] = entrada.nextInt();
                media[0] = media[0] + mercado[i][0];
                media[1] = media[1] + mercado[i][1];
                media[2] = media[2] + mercado[i][2];
                media[3] = media[3] + mercado[i][3];
                media[4] = media[4] + mercado[i][4];
                total[0] = total[0] + mercado[0][j];
                total[1] = total[1] + mercado[1][j];
                total[2] = total[2] + mercado[2][j];
                total[3] = total[3] + mercado[3][j];
                total[4] = total[4] + mercado[4][j];

            }
        }

        for (int i = 0;i < 5; i++)
        {
            if (total[i] > maior)
            {
                maior = total[i];
            }

            if (total[i] < menor)
            {
                menor = total[i];
            }

            for (int j = 0; j < 5; j++)
            {
                System.out.println("Preços: " + i + ": " + mercado[i][j]);
            }
        }

        for (int i = 0; i < 5; i++)
        {
            System.out.println("Média de preços por produto: " + i + ": " + media[i] / 5);
        }

        for (int i = 0; i < 5; i++)
        {
            System.out.println("Total do preço dos mercados: " + i + ": " + total[i]);
        }

        System.out.println("Valor total no mercado mais barato: " + menor);
        System.out.println("Valor total no mercado mais caro: " + maior);
    }
}
