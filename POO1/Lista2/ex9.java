import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		char sexo = entrada.next().charAt(0);
		double peso = entrada.nextFloat();
		double peso1 = 0;
			
		if (sexo == 'F')
		{
			float alt = entrada.nextFloat();
			System.out.println(alt+ " "+ peso + " " + sexo);
			peso1 = ((62.1*alt)-44.7);
			System.out.println(peso1);
			if (peso > peso1)
			{
				System.out.println("Está acima do peso ideal");
			}
			else
			{
				System.out.println("Está abaixo do peso ideal ou no peso.");
			}
		}
		else
			if (sexo == 'M')
			{
				float alt = entrada.nextFloat();
				peso1 = ((72.7*alt)-58);
				System.out.println(peso1);
				if (peso > peso1)
				{
					System.out.println("Está acima do peso ideal");
				}
				else
				{
					System.out.println("Está abaixo do peso ideal ou no peso.");
				}
				
			}
		
		entrada.close();
	}

}
