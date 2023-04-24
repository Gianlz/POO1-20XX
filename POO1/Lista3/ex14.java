import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int tamanho = entrada.nextInt();
		int a  = 1;
		int b = 1;
		for(int i = 0; i <tamanho; i++)
		{
			System.out.println(a + "/" + b);
			a += 1;
			b += 2;
		}
		entrada.close();

	}

}
