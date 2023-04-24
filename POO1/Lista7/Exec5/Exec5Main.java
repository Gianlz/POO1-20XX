package lista7.Exec5;

import java.util.Scanner;

public class Exec5Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean fin = true;
        Exec5 cardapio = new Exec5();

        System.out.println(cardapio.getCardapio());
        do {
            System.out.print("Digite o código do item: ");
            int id = input.nextInt();
            System.out.print("Digite a quantidade do item: ");
            int qtd = input.nextInt();

            cardapio.setItens(id, qtd);

            System.out.print("Deseja continuar?");
            fin = input.nextBoolean();
        } while (fin);

        for (int id = 0; id < cardapio.getItens().length; id++) {
            System.out.println(id + " R$" + cardapio.getTotalItem(id));
        }

        System.out.println("Total: R$" + cardapio.getTotal());

        input.close();
    }

}