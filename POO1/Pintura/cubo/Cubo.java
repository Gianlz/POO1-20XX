package com.gian.cubo;


public class Cubo {
	private final int lata = 18;
	private final double T1 = 101.90; 
	private final double T2 = 212.45; 
	private final double T3 = 345.56; 
	private double areaL;
	private double rend;
	private double areaT;
	private double vol;
	private double a;
	private double diag;
	private double litros;
	private double latas;
	private double total;
	private int TipoT;
	
	// Constructor
	public Cubo(double Area, double rend, int Tipo){
		this.a = Area;
		this.rend = rend;
		this.TipoT = Tipo;
	}
	
	// Litros
	public double getLitros() {
		return litros;
	}

	public void setLitros() {
		this.litros = total / rend;
	}

	// Area lado
	public double getA() {
		return a;
	}


	public void setA(double a) {
		this.a = a;
	}


	// Area Quadrado
	public double getAreaL() {
		return areaL;
	}

	public void setAreaL() {
		this.areaL = a*a;
	}

	// Latas
	public double getLatas() {
		return latas;
	}

	public void setLatas() {
		this.latas = (int)Math.ceil(litros/lata);
		}
	// Area Total
	public double getAreaT() {
		return areaT;
	}

	public void setAreaT(double areaT) {
		this.areaT = areaT;
	}

	

	// Volume
	public double getVol() {
		return vol;
	}



	public void setVol() {
		this.vol = (a*a*a);
	}

	
	// Diagonal
	public double getDiag() {
		return diag;
	}



	public void setDiag() {
		this.diag = a * (Math.sqrt(3));
		
	}

	// Rendimento
	public double getRend() {
		return rend;
	}


	public void setRend(double rend) {
		this.rend = rend;
	}

	
	// Total
	public double getTotal() {
		return total;
	}


	public void setTotal() {
		this.total = (a*a) * 6;
	}

	// Tipo
	public int getTipoT() {
		return TipoT;
	}
	

	
	public double select() {

		if (TipoT == 1) 
			return T1 * latas;
		else if (TipoT == 2)
			return T2 * latas;
		else if(TipoT == 3)
			return T3 * latas;
		else
			System.out.println("Tipo escolhido fora de limite");
		
		return T1;
	}
	
	// Preço
	public double preco() {
		return total * rend;
	}
	

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n Area da Base = ");
		builder.append(areaL);
		builder.append("\n Area Total = ");
		builder.append(areaT);
		builder.append("\n Volume = ");
		builder.append(vol);
		builder.append("\n Diagonal do Cubo = ");
		builder.append(diag);
		builder.append("\n Litros de Tinta = ");
		builder.append(litros);
		builder.append("\n Latas de Tinta = ");
		builder.append(latas);
		builder.append("\n Total = ");
		builder.append(select());
		return builder.toString();
	}






	
	
}
