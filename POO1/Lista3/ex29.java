import java.util.Scanner;

public class ex29 {

	public static void main(String[] args) {
		
		Scanner tabu = new Scanner(System.in);
		
		int x = tabu.nextInt();
		int c = tabu.nextInt();
		int f = tabu.nextInt();
		
		while(c > f)
		{
			System.out.println("Começo maior que fim !");
			c = tabu.nextInt();
		}
		
		for (int i = c; i <= f; i++)
		{
			System.out.println(x + " x " + i + " = " + x * i);
		}
		
		tabu.close();
		
	}

}