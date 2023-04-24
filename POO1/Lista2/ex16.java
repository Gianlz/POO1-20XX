import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float nota1 = entrada.nextFloat();
		float nota2 = entrada.nextFloat();
		
		nota2 = (nota1 + nota2 /2);
		
		if (nota2 >= 0 && nota2 <= 3)
		{
			System.out.println("Reprovado");
		}
		else if(nota2 > 3 && nota2 < 6.9)
		{
			System.out.println("Em exame");
		}
		else if(nota2 >=7)
		{
			System.out.println("Aprovado");
		}
		
		
		entrada.close();

	}

}
