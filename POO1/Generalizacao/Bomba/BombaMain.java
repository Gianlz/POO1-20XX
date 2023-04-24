
public class BombaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bomba bomba = new Bomba();
		bomba.setTotalLitros(6000.57f);
		bomba.setValorLitro(4.79f);
		System.out.println(bomba);
		
		BombaGasolina bombaG = new BombaGasolina();
		bombaG.setTotalLitros(7500.50f);
		bombaG.setValorLitro(5.21f);
		System.out.println(bombaG);
		
		BombaEtanol bombaE = new BombaEtanol();
		bombaE.setTotalLitros(4000.00f);
		bombaE.setValorLitro(6.84f);
		System.out.println(bombaE);
		
		BombaDisel bombaD = new BombaDisel();
		bombaD.setTotalLitros(9099.99f);
		bombaD.setValorLitro(2.33f);
		System.out.println(bombaD);

	}

}
