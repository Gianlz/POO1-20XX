import java.util.Scanner;

public class ex31 {

	public static void main(String[] args) {
	
			
			Scanner entrada = new Scanner(System.in);
			System.out.print("Informe os kg das frutas: ");
			int morango = entrada.nextInt();
			int maca = entrada.nextInt();
			double valor = 2.50;
			double valor2 = 1.80;
			
			if(morango > 5)
			{
				valor = 2.20;
			}
			
			if(maca > 5)
			{
				valor2 = 1.50;
			}
			
			valor = morango * valor;
			valor2 = maca * valor2;
			
			if(morango + maca > 8 || valor + valor2 > 25)
			{
				valor = valor + valor2;
				System.out.println("Preço a ser pago: " + (valor - ((valor * 10) / 100)));
				
			}
			else
			{
				valor = valor + valor2;
				System.out.println("Preço a ser pago: " + valor);
			}
			
			entrada.close();
	}
}
