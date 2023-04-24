package com.gian.cone;

public class Cone {
	private final double T1 = 238.90; 
	private final double T2 = 467.98; 
	private final double T3 = 758.34; 
	private final double PI = 3.14;
	private final int lata = 18;
	private final float lpm = 3.45f;
	private double altura;
	private double raio;
	private int select;
	private double geratriz;
	private double areaFundo;
	private double areaLateral;
	private double areaTotal;
	private double litros;
	private double latas;
	
	// z = altura e r = raio
	public Cone(double z, double r, int select) {
		this.altura = z;
		this.raio = r;
		this.select = select;
	}
	
	// Raio


	// Altura

	// Geratriz
	public double getGeratriz() {
		return geratriz;
	}

	public void setGeratriz() {
		this.geratriz = Math.sqrt((raio * raio) + (altura * altura));
	}
	
	// Área do fundo
	
	public double getAreaFundo() {
		return areaFundo;
	}

	public void setAreaFundo() {
		this.areaFundo = PI * (raio*raio);
	}
	
	// Área Lateral
	
	public double getAreaLateral() {
		return areaLateral;
	}

	public void setAreaLateral() {
		this.areaLateral = PI * raio * geratriz;
	}
	
	// Área Total
	public double getAreaTotal() {
		return areaTotal;
	}

	public void setAreaTotal() {
		this.areaTotal = PI * raio * (raio + geratriz);
	}
	
	// Litros
	
	public double getLitros() {
		return litros;
	}

	public void setLitros() {
		this.litros = areaTotal * lpm;
	}

	// Latas
	
	public double getLatas() {
		return latas;
	}

	public void setLatas() {
		this.latas = (int)Math.ceil(litros / lata);
	}
	
	//select e total
	public double select() {
		if (select == 1)
			return T1  * latas;
		else if (select == 2)
			return T2 * latas;
		else if (select == 3)
			return T3 * latas;
		else
			System.out.println("Tipo escolhido fora de limite");
			return 0;
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n Geratriz= ");
		builder.append(geratriz);
		builder.append("\n Área do Fundo = ");
		builder.append(areaFundo);
		builder.append("\n Área Lateral Cone = ");
		builder.append(areaLateral);
		builder.append("\n Área Total = ");
		builder.append(areaTotal);
		builder.append("\n Litros = ");
		builder.append(litros);
		builder.append("\n Latas: = ");
		builder.append(latas);
		builder.append("\n Preço Total = ");
		builder.append(select());
		return builder.toString();
	}


}
