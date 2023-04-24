package com.gian.piramide;

public class Piramide {
	private final int lata = 18;
	private final double T1 = 127.90; 
	private final double T2 = 258.98; 
	private final double T3 = 344.34; 
	private final double lpm = 4.76;
	private double ab;
	private double h;
	private double hipotenusa;
	private double areaTriangulo;
	private double areaBase;
	private double areaTotal;
	private double Tipo;
	private int Tsave;
	private double litros;
	private double latas;
	private double preco;
	private double volume;
	
	// h = altura e ab = baseT
	public Piramide(double altura, double base, int tipo) {
		this.h = altura;
		this.ab = base;
		this.Tipo = tipo;
		this.Tsave = tipo;
	}
	
	// Base
		public double getAb() {
			return ab;
		}

		

		public void setAb(double ab) {
			this.ab = ab;
		}
		
	// Área Triangulo
	public double getAreaTriangulo() {
		return areaTriangulo;
	}


	public void setAreaTriangulo() {
		this.areaTriangulo = ((ab * 2) * hipotenusa)/2 ;
	}

	

	
	
	// altura
	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}


	
	// Hipotenusa
	public double getHipotenusa() {
		return hipotenusa;
	}

	public void setHipotenusa() {
		this.hipotenusa = Math.sqrt((h*h) + (ab*ab));
	}
	// Área

	public double getAreaBase() {
		return areaBase;
	}

	public void setAreaBase() {
		double lado = ab * 2;
		this.areaBase = lado * lado;
	}

	
	// Área Total
	
	public double getAreaTotal() {
		return areaTotal;
	}

	public void setAreaTotal() {
		this.areaTotal = areaTriangulo + areaTriangulo + areaTriangulo + areaTriangulo + areaBase;
	}
	
	
	// selection
	public int select() {
		if (Tipo == 1) {
			this.Tipo = T1;
			return 1;
		}
		else if (Tipo == 2) {
			this.Tipo = T2;
			return 2;
		}
			
		else if (Tipo == 3) {
			this.Tipo = T3;
			return 3;
		}
		else
			System.out.println("Tipo escolhido fora de limite");
			return 0;
	
	}

	// Litros
	
	public double getLitros() {
		return litros;
	}

	public void setLitros() {
		this.litros = areaTotal / lpm;
	}

	
	// Latas
	
	public double getLatas() {
		return latas;
	}

	public void setLatas() {
		this.latas = (int)Math.ceil(litros / lata);
	}



	
	// Preço
	
	public double getPreco() {
		return preco;
	}

	public void setPreco() {
		this.preco = latas * Tipo;
	}
	
	//Volume
	
	public double getVolume() {
		return volume;
	}

	public void setVolume() {
		this.volume = (areaBase/3) * h;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n ab = ");
		builder.append(ab);
		builder.append("\n h = ");
		builder.append(h);
		builder.append("\n a1 = ");
		builder.append(hipotenusa);
		builder.append("\n Área Triangulo = ");
		builder.append(areaTriangulo);
		builder.append("\n ÁreaBase = ");
		builder.append(areaBase);
		builder.append("\n ÁreaTotal = ");
		builder.append(areaTotal);
		builder.append("\n Tipo = ");
		builder.append(Tsave);
		builder.append("\n Litros = ");
		builder.append(litros);
		builder.append("\n Latas = ");
		builder.append(latas);
		builder.append("\n Preco = ");
		builder.append(preco);
		builder.append("\n Volume = ");
		builder.append(volume);
		return builder.toString();
	}
	
	
}

