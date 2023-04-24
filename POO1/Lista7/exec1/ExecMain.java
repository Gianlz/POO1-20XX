package lista7.exec1;

import java.util.Scanner;

public class ExecMain {

    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);

        String nome = entrada.nextLine();
        String sobrenome = entrada.nextLine();

        Exec1 identidade = new Exec1(nome, sobrenome);

        System.out.println(identidade.nomeCompleto());

        entrada.close();
    }
}
