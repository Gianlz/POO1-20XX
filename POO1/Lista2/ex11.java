import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char periodo = entrada.next().charAt(0);
		
		if (periodo == 'M')
		{
			System.out.println("Bom dia!");
		}
		else
			if (periodo == 'V')
			{
				System.out.println("Boa Tarde!");
			}
			else
				if (periodo == 'N')
				{
					System.out.println("Boa Noite!");
				}
		
		
		entrada.close();
	}

}
