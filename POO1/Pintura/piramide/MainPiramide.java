package com.gian.piramide;

public class MainPiramide {

	public static void main(String[] args) {
	Piramide pir = new Piramide(41.87, 13.89, 3);
	
	System.out.println("ab = " + pir.getAb());
	System.out.println("h = " + pir.getH());
	pir.setHipotenusa();
	System.out.println("a1 = " + pir.getHipotenusa());
	pir.setAreaTriangulo();
	System.out.println("Área Triângulo = " + pir.getAreaTriangulo());
	pir.setAreaBase();
	System.out.println("Área Base = " + pir.getAreaBase());
	pir.setAreaTotal();
	System.out.println("Área Total = " + pir.getAreaTotal());
	System.out.println("Tipo = " + pir.select());
	pir.setLitros();
	System.out.println("Litros = " + pir.getLitros());
	pir.setLatas();
	System.out.println("Latas = " + pir.getLatas());
	pir.setPreco();
	System.out.println("Preço = " + pir.getPreco());
	pir.setVolume();
	System.out.println("Volume = " + pir.getVolume());
	
	// System.out.println(pir.toString());


	}
}