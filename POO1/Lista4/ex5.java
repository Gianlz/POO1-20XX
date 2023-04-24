// da pra melhorar
import java.util.Scanner;
public class ex5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int vetg[] = new int[20];
		int vetp[] = new int[20];
		int veti[] = new int[20];
		
		for(int i = 0; i < 20; i++)
		{
			vetg[i] = entrada.nextInt();
			if(vetg[i] % 2 == 0)
			{ 
				vetp[i] = vetg[i];
			}
			else
			{
				veti[i]= vetg[i];
			}
		}
		
		System.out.println("\n");
		for (int i = 0; i < 20; i++)
		{
			System.out.print(vetg[i] + "| ");
		}
		
		System.out.println("\n");
		for(int i = 0; i < 20; i++)
		{
			System.out.print(vetp[i] + "| ");
		}
		
		System.out.println("\n");
		for(int i = 0; i < 20; i++)
		{
			System.out.print(veti[i] + "| ");
		}
		
		
		
		
		entrada.close();

	}

}
