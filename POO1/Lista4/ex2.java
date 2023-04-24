import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int TAM = 10;
		float [] vet = new float[TAM];
		
		for(int i = 0; i < TAM; i++)
		{
			vet[i] = entrada.nextFloat();
		}
		System.out.println(" ");
		
		for(int i = 9; i > -1; i--)
		{
			System.out.println(vet[i]);
		}
		entrada.close();
	}

}
