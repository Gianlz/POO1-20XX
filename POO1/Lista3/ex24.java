import java.util.Scanner;

public class ex24 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		int n2 = entrada.nextInt();
		int kn = 0;
		int k = 0;
		
		for (int i = 0; i < n; i++)
		{
			kn = kn + n2;
			k++;
		}
		
		System.out.println("Valor total: " + kn);
		System.out.println("Valor Medio: " + kn/k);
		
		entrada.close();
		
		
	}

}