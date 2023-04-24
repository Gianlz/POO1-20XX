import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float nota1 = entrada.nextFloat();
		float nota2 = entrada.nextFloat();
		
		nota2 = (nota1 + nota2 /2);
		
		if (nota2 > 7)
		{
			System.out.println("Aprovado");
		}
		else
		{
			System.out.println("Reprovado");
		}
		
		
		entrada.close();

	}

}
