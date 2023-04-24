import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		int num3 = entrada.nextInt();
		
		if (num1 > num2 && num2 > num3)
		{
			System.out.println(num1 + " ," + num2 + " ," + num3);
		}
		else
			if(num3 > num2 && num2 > num1)
			{
				System.out.println(num3 + " ," + num2 + " ," + num1);
			}
			
		
		
		

		entrada.close();

	}

}
