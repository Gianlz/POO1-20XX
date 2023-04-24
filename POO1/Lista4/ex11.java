import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String palavra = entrada.nextLine();
		
		String[] vet = palavra.split(";");
		
		int tam = vet.length;
		
		for(int i =0; i < tam; i++ )
		{
			System.out.print(vet[i] + "| ");
		}
		
		
		entrada.close();

	}

}
