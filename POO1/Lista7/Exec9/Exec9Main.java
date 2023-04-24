package lista7.Exec9;

import java.util.Scanner;

public class Exec9Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Exec9 tv = new Exec9();

        System.out.println(tv.toString());

        System.out.println("Aumentando volume: ");
        for (int i = 0; i < 11; i++) {
            System.out.println(tv.aumentarVolume());
        }

        System.out.println("Diminuindo volume: ");
        for (int i = 0; i < 11; i++) {
            System.out.println(tv.diminuirVolume());
        }

        System.out.println("Alterando canal: ");
        for (int i = 0; i < 11; i++) {
            System.out.println(tv.alterarCanal(i));
        }

        input.close();
    }

}