package Animal;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal = new Animal();
		animal.setAltura(1.7);
		animal.setPeso(12);
		System.out.println(animal);
		
		AnimalMamifero mamifero = new AnimalMamifero();
		mamifero.setAltura(1.6);
		mamifero.setPeso(7);
		mamifero.setDentes(14);
		mamifero.setCorPelo("Preto");
		System.out.println(mamifero);
		
		AnimalGato gato = new AnimalGato();
		gato.setAltura(1.6);
		gato.setPeso(7);
		gato.setDentes(14);
		gato.setCorPelo("Preto");
		gato.setAlimento("Ração");
		System.out.println(gato);
		
		AnimalCao cao = new AnimalCao();
		cao.setAltura(1.6);
		cao.setPeso(7);
		cao.setDentes(14);
		cao.setCorPelo("Preto");
		cao.setRaca("Pastor Alemão");
		System.out.println(cao);
		
		AnimalReptil reptil = new AnimalReptil();
		reptil.setAltura(0.9);
		reptil.setPeso(5);
		reptil.setTipoPele("escamas");
		System.out.println(reptil);
		
		AnimalTartaruga tartaruga = new AnimalTartaruga();
		tartaruga.setAltura(0.9);
		tartaruga.setPeso(5);
		tartaruga.setTipoPele("Cascas");
		tartaruga.setTamanhoCasco(15);
		System.out.println(tartaruga);
		
		AnimalLagarto lagarto = new AnimalLagarto();
		lagarto.setAltura(0.9);
		lagarto.setPeso(5);
		lagarto.setTipoPele("Cascas");
		lagarto.setComprimento(15);
		System.out.println(lagarto);
		
		
	
		
		
		
		

	}

}
