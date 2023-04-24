package com.gian.cone;

public class MainCone {

	public static void main(String[] args) {
		Cone cone = new Cone(16.53, 37.78, 3);
		
		cone.setGeratriz();
		System.out.println("Geratriz = " + cone.getGeratriz());
		cone.setAreaFundo();
		System.out.println("Área do Fundo: = " + cone.getAreaFundo());
		cone.setAreaLateral();
		System.out.println("Área Lateral = " + cone.getAreaLateral());
		cone.setAreaTotal();
		System.out.println("Área Total = " + cone.getAreaTotal());
		cone.setLitros();
		System.out.println("Litros = " + cone.getLitros());
		cone.setLatas();
		System.out.println("Latas = " + cone.getLatas());
		System.out.println("Total = " + cone.select());
		
		//System.out.println(cone.toString());
	}

}
