import java.util.Scanner;

public class ex23 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int idade = entrada.nextInt();
		if (idade <= 25)
		{
			System.out.println("Turma Jovem");
		}
		else if (idade > 25 && idade <= 40)
		{
			System.out.println("Turma Adulta");
		}
		else
		{
			System.out.println("Turma Idosa");
		}
		
		
		
		entrada.close();

	}

}
