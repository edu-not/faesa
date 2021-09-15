package a1c2;

import java.util.LinkedList;

/*
1. Implemente uma classe PilhaInteiro que vai armazenar uma pilha de inteiros com as operações:

1. Verificar se a pilha está vazia
2. Push (Inserir um elemento no topo da pilha)
3. Pop (Remover o elemento do topo da pilha)
4. Retornar o tamanho da pilha
5. Retorna o último

*/

public class PilhaInteiro {
	
	LinkedList <Integer> pilhaInteiro = new LinkedList<Integer>();
	
	//public PilhaInteiro() {
	//	this.pilhaInteiro.removeAll(pilhaInteiro);
	//}
	
	/*
	 * 1 - Verificar se a pilha está vazia 
	 */
	public boolean eVazia() {
		return (this.pilhaInteiro.isEmpty());
	}

	/*
	 * 2 - Empilhar (Inserir um elemento no topo da pilha)
	 */
	public void push (int numero) {
		pilhaInteiro.addLast(numero);
	}
	
	/* 
	 * 3 - Desempilhar (Remover o elemento do topo da pilha)
	 */
	public void pop () {
		
		if (!eVazia()) {
			pilhaInteiro.removeLast();
		}
	}
	
	/*
	 * 4 - Retornar o tamanho da pilha
	 */
	public int tamanho () {
		return this.pilhaInteiro.size();
	}

	/* 
	 * 5- Retorna o elemento do topo da pilha
	 */
	public int topo () {
		return this.pilhaInteiro.getLast();
	}
}
