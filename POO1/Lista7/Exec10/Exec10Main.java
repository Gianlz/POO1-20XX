package lista7.Exec10;

import java.util.Scanner;

public class Exec10Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Exec10 bomba = new Exec10(0, 7);

        float litros, dinheiro;

        System.out.print("Digite a quantidade de litros que quer abastecer: ");
        litros = input.nextFloat();
        System.out.println(bomba.abastercerPorLitro(litros));

        System.out.print("Entre com o valor em dinheiro: ");
        dinheiro = input.nextFloat();
        System.out.println(bomba.abastercerPorValor(dinheiro));

        input.close();
    }

}
