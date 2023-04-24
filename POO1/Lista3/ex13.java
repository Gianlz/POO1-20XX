import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int a = entrada.nextInt();
		int b = a;
		int k = 0;
		
		for(int i = 0; i < b; i++)
		{
			k = a * (a - 1);
			a -= 1;
		}
		System.out.println(k);
		
		
		entrada.close();
	}

}
