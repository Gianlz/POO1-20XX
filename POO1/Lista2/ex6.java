import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		
		if (num % 2 == 0)
		{
			num = num + 1;
		}
		
		
		System.out.println(num);
		
		entrada.close();

	}

}
