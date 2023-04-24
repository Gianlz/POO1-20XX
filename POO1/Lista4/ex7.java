import java.util.Scanner;
public class ex7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int vet[] = new int[5];
		float soma = 0;
		float mult = 0;
		float div = 0;
		
		for(int i = 0; i < 5; i++)
		{
			vet[i] = entrada.nextInt();
			soma += vet[i];
		}
		mult = vet[0];
		div = vet[0];
		for(int i = 1; i < 5; i++)
		{
			mult = mult * vet[i];
			div = div / vet[i];
		}
		System.out.println(soma + "\n");
		System.out.println(mult + "\n");
		System.out.println(div + "\n");
		
		
		entrada.close();
	}

}
