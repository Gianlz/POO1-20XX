package com.gian.cubo;


public class MainCubo {

	public static void main(String[] args) {
		double lado = 4;
		double rendimento = 2;
		int tipo = 1;
		Cubo cubo = new Cubo(lado, rendimento, tipo);
		
		cubo.setAreaL();
		System.out.println("Area da Base = " + cubo.getAreaL());
		cubo.setTotal();
		System.out.println("Area Total = " + cubo.getTotal());
		cubo.setVol();
		System.out.println("Volume = " + cubo.getVol());
		cubo.setDiag();
		System.out.println("Diagonal do Cubo = " + cubo.getDiag());
		cubo.setLitros();
		System.out.println("Litros de Tinta =  " + cubo.getLitros());
		cubo.setLatas();
		System.out.println("Latas de Tinta = " + cubo.getLatas());
		System.out.println("Total = " + cubo.select());
		
		
		//System.out.println(cubo.toString());
	}

}
