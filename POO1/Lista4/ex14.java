//meio funcionando
import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final int TAM = 30;
		
		int idade[] = new int[TAM];
		float altura[] = new float[TAM];
		int maior = 0;
		float media = 0;

		for(int i = 0; i < TAM; i++)
		{
			idade[i] = entrada.nextInt();
			altura[i] = entrada.nextFloat();
			media = media + idade[i];
		}
		media = media/TAM;
		
		for(int i = 0; i< TAM; i++)
		{
			if (idade[i] > 13 && altura[i] < media)
			{
				maior += 1;
			}
		}
		System.out.println("\n");
		System.out.println("Pessoas: " + maior);
		entrada.close();
	}

}
