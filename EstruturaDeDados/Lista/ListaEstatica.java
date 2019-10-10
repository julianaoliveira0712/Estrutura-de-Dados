package ListaEstatica;

public class ListaEstatica {
	
	// Atributos
	private int[] vetor;	// vetor de inteiros
	private int nroElem;	// nroElem representa o índice onde será colocado
							// o prox elem na lista e tb representa
							// a quantidade de elementos inseridos na lista
	
	// Construtor - recebe o tamanho da lista sendo criada
	public ListaEstatica(int tam) {
		vetor = new int[tam]; 	// cria o vetor com o tamanho recebido
		nroElem = 0;			// zero nroElem
	}
	
	// Métodos
	
	/* Método adiciona - recebe o elem que deve ser colocado na lista
	 * Retorna true se conseguiu adicionar o elem na lista
	 * Retorna false se não conseguiu adicionar (lista cheia)
	 */
	public boolean adiciona(int elem) {
		if (nroElem == vetor.length) {			// se a lista está cheia
			System.out.println("Lista cheia");	// exibe msg de lista cheia	
			return false;						// e retorna false
		}
		else {
			vetor[nroElem++] = elem;	// atribui elem para vetor[nroElem]
										// e já incrementa o nroElem
			return true;				// retorna true
		}
	}
	
	
	/* Método exibe - Exibe os elementos da lista */
	public void exibe() {
		if (nroElem == 0) {							// se lista vazia
			System.out.println("\nLista vazia");	// exibe msg de lista vazia	
		}
		else {
			System.out.println("\nLista:");			// senão exibe elementos da lista
			/* importante: não percorrer o vetor inteiro
			 * e sim somente enquanto o i for menor do que nroElem
			 */
			for (int i=0; i < nroElem; i++) {
				System.out.print(vetor[i] + "\t");	
			}
			System.out.println();
		}
	}
	
	/* Método busca - recebe o elem a ser procurado na lista
	 * Retorna o índice onde o elem está na lista
	 * Ou retorna -1 se o elem não está na lista
	 */
	public int busca (int elem) {
		for (int i=0; i < nroElem; i++) {   // percorre a lista
			if (vetor[i] == elem) {			// se encontrou o elem
				return i;					// então retorna o índice 
			}
		}
		return -1;		// retorna -1 se não encontrou o elem na lista
	}
	
	
	/* Metodo removePeloIndice - recebe o indice do elemento a ser removido
	 * Retorna true se conseguiu remover
	 * Retorna false se índice for inválido
	 */
	public boolean removePeloIndice (int indice) {
		if (indice < 0 || indice >= nroElem) { // indíce inválido
			return false;
		}
		else {
			// Descola os elementos da lista para não ficar "buraco"
			for (int i=indice; i < nroElem-1; i++) {
				vetor[i] = vetor[i+1];
			}
			nroElem--;	// Decrementa quantidade de elementos na lista
			return true; // Retorna true
		}
	}
	
	/* Método removeElemento - Recebe elem a ser removido
	 * Chama o método busca para obter o índice do elem a ser removido
	 * Passa o índice obtido ao método removePeloIndice
	 * Retorna true se removeu e false se o elemento não foi encontrado
	 */
	public boolean removeElemento(int elem) {
		return removePeloIndice(busca(elem));
	}
	
	
	
	
	
}
