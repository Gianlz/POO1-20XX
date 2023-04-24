package Veiculo;

public class veiculoMain {

	public static void main(String[] args) {
		Veiculo v = new Veiculo(true);

		System.out.println(v.toString());

		Caminhao c = new Caminhao(true, 4);

		System.out.println(c.toString());
		Carro car = new Carro(true, 4);

		System.out.println(car.toString());

		Moto m = new Moto(true, 250);

		System.out.println(m.toString());

	}

}
