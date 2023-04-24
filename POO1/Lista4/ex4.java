import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
		char vet[] = new char[10];
		char cons[] = new char[10];
		int cont = 0;
		
		for(int i = 0; i < 10; i++)
		{
			vet[i] = entrada.next().charAt(0);
			if (vet[i] == 'a' || vet[i] == 'e' || vet[i] == 'i' || vet[i] == 'o' || vet[i] == 'u')
			{
				

			}
			else
			{
				// pode salvar em variavel concatenando as letras
				cont += 1;
				// definir o tamanho de cons usando valor de cont
				cons[i] += vet[i];
			}
			
		}
		System.out.println("\n");
		System.out.println(cont + " consoantes \n");
		
		for(int i = 0; i < 10; i++)
		{
			System.out.print(cons[i] + "| ");
		}
		
		entrada.close();
	}

}
