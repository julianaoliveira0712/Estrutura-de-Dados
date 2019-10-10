package ListaEstatica;

public class ListaEstatica {
	
	// Atributos
	private int[] vetor;	// vetor de inteiros
	private int nroElem;	// nroElem representa o �ndice onde ser� colocado
							// o prox elem na lista e tb representa
							// a quantidade de elementos inseridos na lista
	
	// Construtor - recebe o tamanho da lista sendo criada
	public ListaEstatica(int tam) {
		vetor = new int[tam]; 	// cria o vetor com o tamanho recebido
		nroElem = 0;			// zero nroElem
	}
	
	// M�todos
	
	/* M�todo adiciona - recebe o elem que deve ser colocado na lista
	 * Retorna true se conseguiu adicionar o elem na lista
	 * Retorna false se n�o conseguiu adicionar (lista cheia)
	 */
	public boolean adiciona(int elem) {
		if (nroElem == vetor.length) {			// se a lista est� cheia
			System.out.println("Lista cheia");	// exibe msg de lista cheia	
			return false;						// e retorna false
		}
		else {
			vetor[nroElem++] = elem;	// atribui elem para vetor[nroElem]
										// e j� incrementa o nroElem
			return true;				// retorna true
		}
	}
	
	
	/* M�todo exibe - Exibe os elementos da lista */
	public void exibe() {
		if (nroElem == 0) {							// se lista vazia
			System.out.println("\nLista vazia");	// exibe msg de lista vazia	
		}
		else {
			System.out.println("\nLista:");			// sen�o exibe elementos da lista
			/* importante: n�o percorrer o vetor inteiro
			 * e sim somente enquanto o i for menor do que nroElem
			 */
			for (int i=0; i < nroElem; i++) {
				System.out.print(vetor[i] + "\t");	
			}
			System.out.println();
		}
	}
	
	/* M�todo busca - recebe o elem a ser procurado na lista
	 * Retorna o �ndice onde o elem est� na lista
	 * Ou retorna -1 se o elem n�o est� na lista
	 */
	public int busca (int elem) {
		for (int i=0; i < nroElem; i++) {   // percorre a lista
			if (vetor[i] == elem) {			// se encontrou o elem
				return i;					// ent�o retorna o �ndice 
			}
		}
		return -1;		// retorna -1 se n�o encontrou o elem na lista
	}
	
	
	/* Metodo removePeloIndice - recebe o indice do elemento a ser removido
	 * Retorna true se conseguiu remover
	 * Retorna false se �ndice for inv�lido
	 */
	public boolean removePeloIndice (int indice) {
		if (indice < 0 || indice >= nroElem) { // ind�ce inv�lido
			return false;
		}
		else {
			// Descola os elementos da lista para n�o ficar "buraco"
			for (int i=indice; i < nroElem-1; i++) {
				vetor[i] = vetor[i+1];
			}
			nroElem--;	// Decrementa quantidade de elementos na lista
			return true; // Retorna true
		}
	}
	
	/* M�todo removeElemento - Recebe elem a ser removido
	 * Chama o m�todo busca para obter o �ndice do elem a ser removido
	 * Passa o �ndice obtido ao m�todo removePeloIndice
	 * Retorna true se removeu e false se o elemento n�o foi encontrado
	 */
	public boolean removeElemento(int elem) {
		return removePeloIndice(busca(elem));
	}
	
	
	
	
	
}
