package funcao11;

import java.util.Scanner;

public class Exec11 {

    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        String data = entrada.nextLine();

        if (!FuncaoEx11.eValido(data))
        {
            System.out.println("Data Invalida !");
        }
        else
        {
            FuncaoEx11.getDia(data);
        }

        entrada.close();
    }
}
