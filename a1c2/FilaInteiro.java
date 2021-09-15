package a1c2;

import java.util.LinkedList;

public class FilaInteiro {

	/*
	 * 1 - Verificar se a fila está vazia
	 * 2 - enqueue (Inserir um elemento no final da fila)
	 * 3 - dequeue (Remover o elemento do início da fila)
	 * 4 - Retornar o tamanho da fila
	 * 5 - Retornar o elemento do início da fila
	 */

		
		LinkedList <Integer> filaInteiro = new LinkedList<Integer>();
		
		public FilaInteiro() {
			this.filaInteiro.removeAll(filaInteiro);
		}
		
		/*
		 * 1 - Verificar se a fila está vazia 
		 */
		public boolean eVazia() {
			return (this.filaInteiro.isEmpty());
		}

		/*
		 * 2 - Enfileirar (Inserir um elemento no fim da fila)
		 */
		public void enqueue (int numero) {
			filaInteiro.addLast(numero);
		}
		
		/* 
		 * 3 - Desenfileirar (Remover o elemento do inicio da fila)
		 */
		public void dequeue () {
			
			if (!eVazia()) {
				filaInteiro.removeLast();
			}
		}
		
		/*
		 * 4 - Retornar o tamanho da pilha
		 */
		public int tamanho () {
			return this.filaInteiro.size();
		}

		/* 
		 * 5- Retorna o elemento do inicio da fila
		 */
		public int inicio () {
			return this.filaInteiro.getFirst();
		}
		
	}
