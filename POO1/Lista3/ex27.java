import java.util.Scanner;

public class ex27 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		float n1;
		float n2;
		float tr;
		boolean fin;
		boolean com = false;
		int saida;

		while (com == false)
		{
			fin = false;
			n1 = 0;
			n2 = 0;
			System.out.println("Lojas Tabajara");
			while (fin == false)
			{
				n1 = entrada.nextFloat();
				System.out.println("Produto: " + " R$ " + n1);
				n2 = n2 + n1;
			
				if(n1 == 0)
				{
					fin = true;
				}
			}
			System.out.println("Total: " + n2);
		
			tr = entrada.nextFloat();
		
			while(tr < n2)
			{
				System.out.println("Troco Invalido");
				tr = entrada.nextFloat();
			}
		
			System.out.println("Troco: " + Math.round(tr - n2));
		
			System.out.println("Encerrar Programa ? (0 - para encerrar, Qualquer outro número - para continuar.)");
			saida = entrada.nextInt();
			
			if (saida == 0)
			{
				com = true;
			}
		}
		
		entrada.close();
	}
}