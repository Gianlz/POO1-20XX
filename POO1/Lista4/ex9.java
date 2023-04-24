import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String texto = entrada.nextLine();
		int tam = texto.length();
		char vet[] = new char[tam];
		vet = texto.toCharArray();
		
		for(int i = 0; i < tam; i++)
		{System.out.print(vet[i] + "| ");
		
		}
		
		
		
		entrada.close();

	}

}
