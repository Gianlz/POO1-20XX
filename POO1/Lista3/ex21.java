import java.util.Scanner;
public class ex21 {

	public static void main(String[] args) {
		/*
		 * 21. Faça um programa que peça para n pessoas a sua idade, ao final o programa devera
verificar se a média de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; e então,
dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.
		 */
		Scanner entrada = new Scanner(System.in);
		
		int n_pessoas = entrada.nextInt();
		double cont_idade = 0;
		
		System.out.println("Digite a idade das "+ n_pessoas +" : ");
		for(int i = 1; i <= n_pessoas; i++)
		{
			int idade = entrada.nextInt();
			cont_idade = cont_idade + idade;
		}
		
		cont_idade = (cont_idade)/n_pessoas;
		// Years > 0
		if (cont_idade >= 0 && cont_idade <= 25)
		{
			System.out.println("Jovem");
		}
		else if (cont_idade >= 26 && cont_idade <= 60)
		{
			System.out.println("Adulta");
		}
		else
		{
			System.out.println("Idosa");
		}
		
		
		
		entrada.close();

	}

}
