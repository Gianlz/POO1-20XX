import java.util.Scanner;
public class ex6 {

	public static void main(String[] args) {
		Scanner entrada =  new Scanner(System.in);
		float vetm[] = new float[10];
		float n1 = 0;
		int alm7 = 0;
		float media = 0;
		
		for(int i = 0; i < 10; i++)
		{
			media = 0;
			for(int j = 0; j < 4; j++)
			{
			n1 = entrada.nextFloat();
			media += n1;
			}
			media = media/4;
			vetm[i] = media;
			
			if(vetm[i] >= 7)
			{
				
				alm7 += 1;
			}
		}
		
		System.out.println("\n");
		System.out.println(alm7);
		

		entrada.close();

	}

}
