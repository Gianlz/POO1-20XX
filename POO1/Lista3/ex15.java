import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a =38;
		int b = 37;
		int k = 0;
		int s = 0;
		for(int i = 1; i <= 36; i++)
		{
			k = (b*a)/i;
			b -= 1;
			a -= 1;
			s = s + k;
			
		}
		
		System.out.println(s);
		
		entrada.close();
	}

}
