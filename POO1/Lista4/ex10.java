import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String data = entrada.nextLine();
		String[] vet = data.split("/");
		
		for(int i = 0; i < 3; i++)
		{
			System.out.print(vet[i] + "| ");
		}
		
		
		
		entrada.close();

	}

}
