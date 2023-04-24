import java.util.Scanner;

public class ex30 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe os litros de gasolino e o tipo (A - Álcool , G - Gasolina): ");
		int gasol = entrada.nextInt();
		char tipo = entrada.next().charAt(0);
		double valor = 2.50;
		double valor2 = 1.90;
		
		if(tipo == 'A')
		{
			if(gasol <= 20)
			{
				valor = (valor * gasol);
				double desconto = ((valor * 3) / 100);
				System.out.println("Preço a ser pago: " + (valor - desconto));
			}
			else
			{
				if(gasol > 20)
				{
					valor = (valor * gasol);
					double desconto = ((valor * 5) / 100);
					System.out.println("Preço a ser pago: " + (valor - desconto));
				}
			}
		}
		else
		{
			if(tipo == 'G')
			{
				if(gasol <= 20)
				{
					valor2 = (valor2 * gasol);
					double desconto2 = ((valor2 * 4) / 100);
					System.out.println("Preço a ser pago: " + (valor2 - desconto2));
				}
				else
				{
					if(gasol > 20)
					{
						valor2 = (valor * gasol);
						double desconto2 = ((valor * 5) / 100);
						System.out.println("Preço a ser pago: " + (valor2 - desconto2));
					}
				}
			}
		}
		
		entrada.close();
	}
}