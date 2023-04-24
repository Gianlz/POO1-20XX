import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float vet[] = new float[4];
		float media = 0;
		
		for(int i = 0;i < 4; i++)
		{
			vet[i] = entrada.nextFloat();
			
		}
		System.out.println(" \n");
		
		for(int i = 0;i < 4; i++)
		{
			System.out.print(vet[i] + " |");
			media += vet[i];
		}
		System.out.println(" \n");
		System.out.println("Media = " + (media)/4);
		
		
		
		
		entrada.close();
	}

}
