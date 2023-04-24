import java.util.Scanner;

public class ex23 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		int n2 = entrada.nextInt();
		int k = 0;
		
		if (n2 > 40)
		{
			System.out.println("Quantidade de alunos invalida.");
		}
		else
		{
			for (int i = 0; i < n; i++)
			{
				k++;
			}
	
			System.out.println("Média de alunos por turma: " + n2 / k );
		}
		
		entrada.close();
	}	
}