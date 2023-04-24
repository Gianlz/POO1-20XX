package funcao2;

import funcao1.Funcao;

import java.util.Scanner;

public class Exec2 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int tabela = entrada.nextInt();

        FuncaoEx2.mostrarDiferente(tabela);
    }
}
