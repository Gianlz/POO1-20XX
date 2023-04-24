
public class XadrezMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XadrezPeca xadrez = new XadrezPeca(false);
		xadrez.setColuna(0);
		xadrez.setLinha(0);
		xadrez.setMovimentos(0);
		System.out.println(xadrez);
		
		XadrezPeao peao = new XadrezPeao(false);
		peao.setColuna(0);
		peao.setLinha(1);
		System.out.println(peao);
		
		XadrezTorre torre = new XadrezTorre(false);
		torre.setColuna(4);
		torre.setLinha(6);
		System.out.println(torre);
		
		XadrezRei rei = new XadrezRei(false);
		rei.setColuna(1);
		rei.setLinha(1);
		System.out.println(rei);
		
		XadrezRainha rainha = new XadrezRainha(false);
		rainha.setColuna(2);
		rainha.setLinha(7);
		System.out.println(rainha);
		
		XadrezCavalo cavalo = new XadrezCavalo(false);
		cavalo.setColuna(3);
		cavalo.setLinha(3);
		System.out.println(cavalo);
		
		XadrezBispo bispo = new XadrezBispo(false);
		bispo.setColuna(6);
		bispo.setLinha(5);
		System.out.println(bispo);
	}

}
