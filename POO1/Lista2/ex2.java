import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double num = entrada.nextDouble();
		
		if (num > 0)
		{
			System.out.println("Positivo");
		}
		else
			if (num == 0)
			{
				System.out.println("Zero");
			}
			else 
			{
				System.out.println("Negativo");
			}
		
		
		entrada.close();

	}

}
