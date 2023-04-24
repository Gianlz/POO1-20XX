import java.util.Scanner;

public class ex31 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int num = 0;
		int alt = 0;
		int altA = 0;
		int alta = 1000;
		int numA = 0;
		int numa = 0;
		
		for(int i = 1; i <= 10;i++)
		{
			num = entrada.nextInt();
			alt = entrada.nextInt();
			
			if(alt > altA)
			{
				altA = alt;
				numA = num;
			}
			
			if(alt < alta)
			{
				alta = alt;
				numa = num;
			}
		}
		
		System.out.println("Aluno mais alto: " + numA + " Altura: " + altA);
		System.out.println("Menor aluno: " + numa + " Altura: " + alta);
		
		entrada.close();
	}

}