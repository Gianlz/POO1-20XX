package lista7.Exec7;

import java.util.Scanner;

public class Exec7Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entre com o nome: ");
        String nome = input.next();
        System.out.print("Entre com a idade: ");
        int idade = input.nextInt();
        System.out.print("Entre com o peso: ");
        float peso = input.nextFloat();
        System.out.print("Entre com a altura: ");
        float altura = input.nextFloat();

        Exec7 person = new Exec7(nome, idade, peso, altura);

        System.out.println(person.toString());

        person.engordar();

        System.out.println(person.toString());

        person.envelhecer();

        System.out.println(person.toString());

        input.close();
    }

}