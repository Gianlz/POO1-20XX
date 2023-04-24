import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int k = entrada.nextInt();
		
		for(int i= 0; i <= 10; i++)
		{
			System.out.println("5 x "+ i + " = " + k * i);
		}
		
		
		
		entrada.close();

	}

}
