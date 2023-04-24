import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char letraselect = entrada.next().charAt(0);
		// to Upper for char??
		
		if (letraselect == 'F')
		{
			System.out.println("Feminino");
		}
		else
			if (letraselect == 'M')
			{
				System.out.println("Masculino");
			}
			else 
			{
				System.out.println("QQ TU TA FAZENDO MALUCO??");
			}
		
		entrada.close();

	}

}
