import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double prec = entrada.nextDouble();
		int cod_orig = entrada.nextInt();
		
		if (cod_orig == 1)
		{
			System.out.println(prec + " Sul");
		}
		else if (cod_orig == 2)
		{
			System.out.println(prec + " Norte");
		}
		else if (cod_orig == 3)
		{
			System.out.println(prec + " Leste");
		}
		else if (cod_orig == 4)
		{
			System.out.println(prec + " Oeste");
		}
		else if (cod_orig == 5 || cod_orig == 6)
		{
			System.out.println(prec + " Nordeste");
		}
		else if (cod_orig == 7 || cod_orig == 8)
		{
			System.out.println(prec + " Centro-Oeste");
		}

		
		entrada.close();

	}

}
