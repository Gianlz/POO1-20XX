import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		
		int TAM = 5;
		int[] vet = new int[TAM];
		
		
		for(int i = 0; i < TAM; i++)
		{
			vet[i] = entrada.nextInt();
		}

		entrada.close();
	}

}
