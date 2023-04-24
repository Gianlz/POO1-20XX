package lista7.Exec8;

import java.util.Scanner;

public class Exec8Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = input.nextLine();

        Exec8 conta = new Exec8(nome);

        System.out.print("Informe seu deposito inicial: ");
        System.out.println(conta.depositar(input.nextFloat()));

        System.out.print("Informe seu saque: ");
        System.out.println(conta.sacar(input.nextFloat()));

        System.out.print("Deseja alterar nome? ");
        boolean alterarNome = input.nextBoolean();
        input.nextLine();
        if (alterarNome) {
            System.out.print("Informe seu novo nome: ");
            System.out.println(conta.alterarNome(input.nextLine()));
        }

        System.out.println(conta.toString());

        input.close();
    }

}
