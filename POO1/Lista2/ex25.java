import java.util.Scanner;

public class ex25 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.print("Digite o valor do numero: ");
        numero = entrada.nextInt();
        entrada.nextLine();
        if(numero%2==0)
            System.out.println("O numero par");
        else
            System.out.println("O numero é Ímpar");
        
        entrada.close();
    }

}