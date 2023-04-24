import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		
		int diff = num2 - num1 - 1;
		
		num1 = 0;
		
		
		while(num1 < diff)
		{
			System.out.println(num2 - diff);
			diff -= 1;
		}
		
		
		entrada.close();

	}

}
