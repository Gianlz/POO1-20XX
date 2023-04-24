import java.util.Scanner;

public class ex29 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Responda as perguntas (S - sim , N - não)");
		System.out.println("  ");
		int i = 0;
		int n = 0;
		char resp;
		
		
		do
		{
			System.out.println("Telefonou para a vítima?");
			resp = entrada.next().charAt(0);
			if(resp == 'S')
			{
				i++;
				n++;
			}
			else
			{
				n++;
			}
			
			System.out.println("Esteve no local do crime?");
			resp = entrada.next().charAt(0);
			if(resp == 'S')
			{
				i++;
				n++;
			}
			else
			{
				n++;
			}
			
			System.out.println("Mora perto da vítima?");
			resp = entrada.next().charAt(0);
			if(resp == 'S')
			{
				i++;
				n++;
			}
			else
			{
				n++;
			}
			
			System.out.println("Devia para a vítima?");
			resp = entrada.next().charAt(0);
			if(resp == 'S')
			{
				i++;
				n++;
			}
			else
			{
				n++;
			}
				
			System.out.println("Já trabalhou com a vítima?");
			resp = entrada.next().charAt(0);
			if(resp == 'S')
			{
				i++;
				n++;
			}
			else
			{
				n++;
			}
		}
		while(n < 5);
		
		if(i < 2)
		{
			System.out.println("Inocente");
		}
		else
		{
			if(i == 2)
			{
				System.out.println("Suspeito");
			}
			else
			{
				if(i < 5)
				{
					System.out.println("Cúmplice");
				}
				else
				{
					System.out.println("Assassino !");
				}
			}
		}
		
		
		entrada.close();
	}

}
