import java.util.Scanner;

public class ex24 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n1 = entrada.nextInt();
		int n2 = entrada.nextInt();
		int n3 = entrada.nextInt();
		
		float media = (n1+n2+n3)/3;
		if(media == 10)
		{
			System.out.println("Aprovado com Distinção");
		}
		if(media>= 7)
		{
			System.out.println(media + "Aprovado");
		}
		else if (media < 7)
		{
			System.out.println(media + "Reprovado");
		}
		entrada.close();

	}

}
