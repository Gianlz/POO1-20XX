import java.util.Scanner;

public class ex34 {
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        int num;
        int k = 0;
        int k2 = 0;
        int k3 = 0;
        int k4 = 0;
        boolean fin = false;

        while (!fin)
        {
            num = entrada.nextInt();

            if (num <= 25 && num >= 0)
            {
                k++;
            }

            if (num <= 50 && num >= 26)
            {
                k2++;
            }

            if (num <= 75 && num >= 51)
            {
                k3++;
            }

            if (num <= 100 && num >= 76)
            {
                k4++;
            }

            if (num < 0)
            {
                fin = true;
            }
        }

        System.out.println("Números entre 0 e 25 " + k);
        System.out.println("Números entre 26 e 50 " + k2);
        System.out.println("Números entre 51 e 75 " + k3);
        System.out.println("Números entre 76 e 100 " + k4);

        entrada.close();
    }
}