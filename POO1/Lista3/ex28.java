import java.util.Scanner;

public class ex28 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n1 = entrada.nextInt();
		int n2;
		int n3 = 0;
		int m1 = 0;
		int m2 = 1000;
		int k = 0;
		
		for(int i = 0; i < n1; i++)
		{
			n2 = entrada.nextInt();
			n3 = n3 + n2;
			k++;
			
			if (n2 < m2)
			{
				m2 = n2;
			}
			else if(n2 > m1)
			{
				m1 = n2;
			}
		}
		
		System.out.println("Menor Temperatura: " + m2);
		System.out.println("Maior Temperatura: " + m1);
		System.out.println("Media de Temperatura: " + (n3 / k));
		
		
		entrada.close();
		
		
	}

}