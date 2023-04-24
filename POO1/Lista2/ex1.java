import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		
		if (num1 > num2)
		{
			System.out.println(num1);
		}
		else
			if (num1 == num2)
			{
				System.out.println("Sao iguais.");
			}
			else {
				System.out.println(num2);
			}
		entrada.close();

	}

}
