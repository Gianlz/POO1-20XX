import java.util.Scanner;
import java.lang.Math;

public class ex22 {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Digite o numero (menor que 1000): ");
        int num1 = number.nextInt();
        int centenas = Math.round(num1 / 100);
        int dezenas = Math.round(num1 % 100) / 10;
        int unidades = Math.round((num1 % 100) % 10);
        if(num1 >= 1000)
        {
            System.out.println("Invalido !");
        }
        else
            if(num1 >= 100)
            {
                System.out.println("Centenas: " + centenas);
                System.out.println("Dezenas: " + dezenas);
                System.out.println("unidades: " + unidades);
            }

        number.close();
    }
}