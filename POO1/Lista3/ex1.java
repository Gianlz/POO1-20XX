import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite um número de 0 - 10");
		
		int num = entrada.nextInt();
		
		while (num > 10 || num < 1)
		{
			num = entrada.nextInt();
		}
	
		entrada.close();

	}

}
