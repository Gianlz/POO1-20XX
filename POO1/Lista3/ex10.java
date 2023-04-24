import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int base = entrada.nextInt();
		int exp = entrada.nextInt();
		int a = base;
		
		for(int i = 1; i < exp; i++)
		{
			base = base * a;
		}
		System.out.println(base);
		
		entrada.close();
	}

}
