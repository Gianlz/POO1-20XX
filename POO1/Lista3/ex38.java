import java.util.Scanner;

public class ex38 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num = entrada.nextInt();
        int i = 0;

        while(num > 0)
        {
            i *= 10;
            i += (num % 10);
            num /= 10;
        }

        System.out.printf("O número invertido: %d. \n",i);


        entrada.close();
    }
}