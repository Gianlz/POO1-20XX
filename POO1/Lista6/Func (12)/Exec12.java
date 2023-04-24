package funcao12;

import java.util.Scanner;

public class Exec12 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        String palavra = entrada.nextLine();

        System.out.println(FuncaoEx12.Embaralhar(palavra));

        entrada.close();
    }
}
