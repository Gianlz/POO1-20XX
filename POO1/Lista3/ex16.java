import java.util.Scanner;
public class ex16 {

	public static void main(String[] args) {
		System.out.println("Quantas vezes deseja repetir a op? ");
		
		Scanner entrada = new Scanner(System.in);
		
		int vezes = entrada.nextInt();
		double num = 0;
		double soma = 0;
		double maior = 0;
		double menor = 0;
		
		for(int i = 0; i < vezes; i++)
		{
			num = entrada.nextDouble();
			soma = soma + num;
			if (num > maior)
			{
				maior = num;
			}
			else if (num < menor){
				menor = num;
			}
			
		}
		
		System.out.println(maior);
		System.out.println(menor);
		System.out.println(soma);
		
		
		
		entrada.close();

	}

}
