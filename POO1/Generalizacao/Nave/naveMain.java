package Nave;

public class naveMain {

	public static void main(String[] args) {
		NaveEspacial ne = new NaveEspacial(450);
		
		System.out.println(ne.toString());
		
		Apollo11 a11 = new Apollo11(460, "Podium");
		
		System.out.println(a11.toString());
		
		MilleniumFalcon mf = new MilleniumFalcon(340, "Querosene", 32);
		
		System.out.println(mf.toString());

	}

}
