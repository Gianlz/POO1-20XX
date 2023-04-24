import java.util.Scanner;

public class ex37 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        char[] gabarito = new char[10];

        gabarito[0] = 'A';
        gabarito[1] = 'B';
        gabarito[2] = 'C';
        gabarito[3] = 'D';
        gabarito[4] = 'E';
        gabarito[5] = 'E';
        gabarito[6] = 'D';
        gabarito[7] = 'C';
        gabarito[8] = 'B';
        gabarito[9] = 'A';

        int maior = 0;
        int menor = 1000;
        int acertos;
        int acertosG = 0;
        int k = 0;
        int saida;
        char resp;
        boolean fin = false;

        while (!fin)
        {
            k++;
            acertos = 0;

            for (int i = 0; i < 10; i++)
            {
                resp = entrada.next().charAt(0);

                if (resp == gabarito[i])
                {
                    acertos++;
                    acertosG++;
                }
            }

            if (acertos < menor)
            {
                menor = acertos;
            }

            if (acertos > maior)
            {
                maior = acertos;
            }

            System.out.println("Deseja encerrar o programa ? (0 - para encerrar, qualquer outro número para continuar)");
            saida = entrada.nextInt();

            if (saida == 0)
            {
                fin = true;
            }
        }

        System.out.println("Maior número de acertos: " + maior);
        System.out.println("Menor número de acertos: " + menor);
        System.out.println("Total de alunos que utilizaram o sistema: " + k);
        System.out.println("Média de notas da turma: " + acertosG / k);

        entrada.close();
    }
}