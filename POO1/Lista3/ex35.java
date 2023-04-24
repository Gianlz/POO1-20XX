import java.util.Scanner;

public class ex35 {
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Especificação      | Código        | Preço");
        System.out.println("Cachorro Quente    | 100           | R$ 1,20");
        System.out.println("Bauru Simples      | 101           | R$ 1,30");
        System.out.println("Bauru com Ovo      | 102           | R$ 1,50");
        System.out.println("Hamburguer         | 103           | R$ 1,20");
        System.out.println("Cheeseburguer      | 104           | R$ 1,30");
        System.out.println("Refrigerante       | 105           | R$ 1,00");
        System.out.println(" ");

        int codigo;
        int quantidade;
        double custo = 0;
        boolean fin = false;

        while(!fin)
        {
            codigo = entrada.nextInt();

            if (codigo == 100)
            {
                quantidade = entrada.nextInt();
                System.out.println("Quantidade a ser paga: " + quantidade * 1.20);
                custo = custo + (quantidade * 1.20);
            }

            else if (codigo == 101)
            {
                quantidade = entrada.nextInt();
                System.out.println("Quantidade a ser paga: " + quantidade * 1.30);
                custo = custo + (quantidade * 1.30);
            }

            else if (codigo == 102)
            {
                quantidade = entrada.nextInt();
                System.out.println("Quantidade a ser paga: " + quantidade * 1.50);
                custo = custo + (quantidade * 1.50);
            }

            else if (codigo == 103)
            {
                quantidade = entrada.nextInt();
                System.out.println("Quantidade a ser paga: " + quantidade * 1.20);
                custo = custo + (quantidade * 1.20);
            }

            else if (codigo == 104)
            {
                quantidade = entrada.nextInt();
                System.out.println("Quantidade a ser paga: " + quantidade * 1.30);
                custo = custo + (quantidade * 1.30);
            }

            else if (codigo == 105)
            {
                quantidade = entrada.nextInt();
                System.out.println("Quantidade a ser paga: " + quantidade * 1.00);
                custo = custo + (quantidade * 1.00);
            }

            if (codigo == 0)
            {
                fin = true;
            }
        }

        System.out.println("Custo Total: " + custo);

        entrada.close();
    }
}