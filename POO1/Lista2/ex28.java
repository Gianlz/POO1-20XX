import java.util.Scanner;

public class ex28 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int k = entrada.nextInt();
		
		
		System.out.println("Telefonou para a vítima?");
		char l = entrada.next().charAt(0);
		
		System.out.println("Esteve no local do crime?");
		char p = entrada.next().charAt(0);
		
		System.out.println("Mora perto da vítima?");
		char n = entrada.next().charAt(0);
		
		System.out.println("Devia para a vítima?");
		char m = entrada.next().charAt(0);
		
		System.out.println("Já trabalhou com a vítima?");
		char q = entrada.next().charAt(0);
		
		if (l == 'l') {
			k = k +1;
		}
		if (p == 'l') {
			k = k +1;
		}
		if (n == 'l') {
			k = k +1;
		}
		if (m == 'l') {
			k = k +1;
		}
		if (q == 'l') {
			k = k +1;
		}
		
		if (k == 2)
		{
			System.out.println("Suspeita");
		}
		else if(k >=3 && k <= 4)
		{
			System.out.println("Cúmplice");
		}
		else if(k==5)
		{
			System.out.println("Assassino");
		}
		else
		{
			System.out.println("Inocente");
		}
		
		entrada.close();

	}

}
