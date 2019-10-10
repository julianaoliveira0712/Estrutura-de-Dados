package ListaEstatica;

public class Teste {

	public static void main(String[] args) {
		
		ListaEstatica lista = new ListaEstatica(5);
		if (lista.adiciona(10)) {
			System.out.println("Elemento 10 inserido com sucesso");
		}
		if (lista.adiciona(20)) {
			System.out.println("Elemento 20 inserido com sucesso");
		}
		if (lista.adiciona(30)) {
			System.out.println("Elemento 30 inserido com sucesso");
		}
		
		lista.exibe();
		
		if (lista.removePeloIndice(1)) {
			System.out.println("Elemento do �ndice 1 removido com sucesso");
		}
		lista.exibe();
		
		if (lista.adiciona(40)) {
			System.out.println("Elemento 40 inserido com sucesso");
		}
		if (lista.adiciona(50)) {
			System.out.println("Elemento 50 inserido com sucesso");
		}
		if (lista.adiciona(60)) {
			System.out.println("Elemento 60 inserido com sucesso");
		}
		
		lista.exibe();
		
		int ind = lista.busca(40);
		if (ind == -1) {
			System.out.println("Elemento 40 n�o encontrado");
		}
		else {
			System.out.println("Elemento 40 encontrado no �ndice " +
		                        ind);
		}
		
		ind = lista.busca(25);
		if (ind == -1) {
			System.out.println("Elemento 25 n�o encontrado");
		}
		else {
			System.out.println("Elemento 25 encontrado no �ndice " +
		                        ind);
		}
		
		if (lista.removeElemento(40)) {
			System.out.println("Elemento 40 removido com sucesso");
		}
		else {
			System.out.println("Elemento 40 n�o encontrado");
		}
		
		lista.exibe();
		
		if (lista.removeElemento(35)) {
			System.out.println("Elemento 35 removido com sucesso");
		}
		else {
			System.out.println("Elemento 35 n�o encontrado");
		}
		

	}

}
