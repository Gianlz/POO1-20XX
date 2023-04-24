import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		char letra = entrada.next().charAt(0);
		
		if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') 
		{
			System.out.println("É vogal");
		}
		else
		{
			System.out.println("Não é vogal");
		}
		
		entrada.close();

	}

}
