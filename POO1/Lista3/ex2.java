import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String login = entrada.nextLine();
		String senha = entrada.nextLine();
		int k = 1;
		
		while (k == 1) {
			
			if(login.equals(senha))
			{
				System.out.println("Errado");
				login = entrada.nextLine();
				senha = entrada.nextLine();
			}
			else
			{
				k = 0;
				
			}
			
		}
	
		entrada.close();


	}

}
