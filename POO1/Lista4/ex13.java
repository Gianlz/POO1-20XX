import java.util.Scanner;

public class ex13 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String item[] = new String[10];
		String frutas[] = new String[10];
		
		String vet[] = new String[20];
		int j = 0;
		
		for(int i = 0; i < 10; i++)
		{
			item[i] = entrada.nextLine();
			frutas[i] = entrada.nextLine();
			
		}
		
		for(int i = 0; i < 10; i++)
		{
			vet[j] = item[i];
			j++;
			vet[j] = frutas[i];
			j++;
		}
		
		for(int i = 0; i < 20; i++)
		{
			System.out.print(vet[i] + "| ");
		}
		entrada.close();
	}
}
