import java.util.Scanner;

public class ex36 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("1, 2, 3, 4 - votos para os respectivos candidatos.");
        System.out.println("1 - Maria | 2 - Carlos | 3 - João | 4 - David");
        System.out.println("5 - Voto nulo | 6 - Voto em Branco");
        System.out.println("0 - para encerrar a votação");

        int voto;
        int k = 0;
        int k2 = 0;
        int k3 = 0;
        int k4 = 0;
        int k5 = 0;
        int k6 = 0;
        boolean fin = false;

        while(!fin)
        {
            voto = entrada.nextInt();

            if (voto == 1)
            {
                k++;
            }

            if (voto == 2)
            {
                k2++;
            }

            if (voto == 3)
            {
                k3++;
            }

            if (voto == 4)
            {
                k4++;
            }

            if (voto == 5)
            {
                k5++;
            }

            if (voto == 6)
            {
                k6++;
            }

            if (voto == 0)
            {
                fin = true;
            }
        }

        System.out.println("Total de votos para Maria: " + k);
        System.out.println("Total de votos para Carlos: " + k2);
        System.out.println("Total de votos para João: " + k3);
        System.out.println("Total de votos para David: " + k4);
        System.out.println("Total de votos Nulos: " + k5);
        System.out.println("Total de votos em branco: " + k6);
        System.out.println("Percentual de votos nulos sobre o total de votos: " + "%" + ((k + k2 + k3 + k4 + k5 + k6) * k5) / 100);
        System.out.println("Percentual de votos nulos sobre o total de votos: " + "%" + ((k + k2 + k3 + k4 + k5 + k6) * k6) / 100);

        entrada.close();
    }
}