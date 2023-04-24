import java.util.Scanner;

public class ex30 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int codigo;
		int codAltM = 0;
		int codAltm = 0;
		int codPM = 0;
		int codPm = 0;
		float alt;
		float altM = 0;
		float altm = 1000;
		int peso;
		int pesoM = 0;
		int pesom = 1000;
		int mediaP = 0;
		float mediaA = 0;
		int k = 0;
		boolean fin = false;
		
		while(fin == false)
		{
			codigo = entrada.nextInt();
			
			if(codigo == 0)
			{
				fin = true;
			}
			else
			{
				alt = entrada.nextFloat();
				peso = entrada.nextInt();
				mediaP = mediaP + peso;
				mediaA = mediaA + alt;
				k++;
				
				if(alt > altM)
				{
					altM = alt;
					codAltM = codigo;
				}
				
				if(alt < altm)
				{
					altm = alt;
					codAltm = codigo;		
				}
				
				if(peso > pesoM)
				{
					pesoM = peso;
					codPM = codigo;
				}
				
				if(peso < pesom)
				{
					pesom = peso;
					codPm = codigo;
				}
			}
		}
		
		System.out.println("O mais alto: " + codAltM + " Altura: " + altM);
		System.out.println("O menor: " + codAltm + " Altura: " + altm);
		System.out.println("O mais Pesado: " + codPM + " Peso: " + pesoM);
		System.out.println("O mais leve: " + codPm + " Peso: " + pesom);
		System.out.println("Media das alturas: " + mediaA / k);
		System.out.println("Media dos Pesos: " + mediaP / k);
		
		entrada.close();
	}

}