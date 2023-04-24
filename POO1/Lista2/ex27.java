import java.util.Scanner;

public class ex27 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número: ");
		float num = entrada.nextFloat();
		
		if(Math.round(num) < num || Math.round(num) > num)
		{
			System.out.println("Decimal");
		}
		else
		{
			System.out.println("Inteiro");
		}
		
		
		entrada.close();
	}

}
