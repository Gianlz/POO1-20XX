
public class ex4 {

	public static void main(String[] args) {
		double A = 80000;
		double B = 200000;
		
		
		while(A <= B)
		{
			A = A + (A * 0.03);
			B = B + (B * 0.015);
		}
		A = Math.round(A);
		B = Math.round(B);
		System.out.println(A + " " + B);


	}

}
