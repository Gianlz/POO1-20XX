package Item;

public class itemMain {

	public static void main(String[] args) {
		
		Item i = new Item(32423434, "Maneiro");
		System.out.println(i.toString());
		
		Livro l = new Livro(234, "grande", "eu");
		System.out.println(l.toString());
		
		Midia m = new Midia(2342, "top", "Rio sul record", 54);
		System.out.println(m.toString());
		
		CD cd = new CD(234324, "redondo", "Rio sul record", 54, 3, "eu", "ifc is good");
		
		System.out.println(cd.toString());
		
		VHS vhs = new VHS(3434, "velho", "rio do sul record", 34, "Old but gold");
		System.out.println(vhs.toString());
		

	}

}
