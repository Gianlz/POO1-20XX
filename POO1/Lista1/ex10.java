import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int int1 = entrada.nextInt();
		int int2 = entrada.nextInt();
		
		float flt = entrada.nextFloat();
		
		System.out.println((2*int1)*(int2/2));
		System.out.println(3*int1+flt);
		System.out.println(flt*flt*flt);
		
		entrada.close();

	}

}
