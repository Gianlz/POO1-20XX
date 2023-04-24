import java.util.Scanner;

public class ex33 {

    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        float divida = entrada.nextFloat();

        System.out.println("Quantidade de Parcelas | % de juros sobre o valor inicial da divida");
        System.out.println("1                      | 0");
        System.out.println("3                      | 10");
        System.out.println("6                      | 15");
        System.out.println("9                      | 20");
        System.out.println("12                     | 25");

        System.out.println("Valor da Dívida | Valor dos Juros | Quantidade de Parcelas | Valor da Parcela");
        for (int i = 0; i < 12; i++)
        {
            System.out.println(divida + (divida * i)/100 + "       |" + (divida * i )/100 );
        }

        entrada.close();
    }
}