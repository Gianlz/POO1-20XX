import java.util.Scanner;
public class ex20 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		
		float soma = 0f;
		System.out.print("Digite quantas notas são: ");
		int num_n = entrada.nextInt();
		System.out.println("Digite suas "+ num_n + " notas: ");
		
		
		
		for (int i = 1; i <= num_n; i++)
		{
			float nota = entrada.nextFloat();
			soma = soma + nota;
		}
		System.out.println("A média áritmetica das " + num_n + " notas é de " + (soma/num_n));
		
		
		
		entrada.close();

	}

}
