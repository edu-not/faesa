package a1c2;

import java.util.LinkedList;

/*
3 - Faça um aplicativo que vai armazenar vários valores inteiros (o
programa pára de armazenar quando o usuário digitar 0 – zero). Se o valor
digitado for par ele deve ser armazenado em um pilha. Se for ímpar, ele deve
ser armazenado em uma fila.
Imprima o valor que está no topo da pilha e no início da fila
 */

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		PilhaInteiro pilha = new PilhaInteiro();
		FilaInteiro fila = new FilaInteiro();

		preencherlista(pilha, fila);
		imprimirlista(pilha, fila);
		//teste(pilha, fila);
		
	}


	private static void preencherlista(PilhaInteiro pilha, FilaInteiro fila) {		
		int num =-1;
		do {
			  num = InOut.leInt("Entre com um numero inteiro ou ZERO para terminar" );
			if (num%2==0 && num!=0) {
				pilha.push(num);
			}else {
				if(num!=0)
				fila.enqueue(num);
			}
		}while (num!=0);
	}
	
	private static void imprimirlista(PilhaInteiro pilha, FilaInteiro fila) {		
		
		if(pilha.eVazia())
			InOut.MsgDeAviso("esta Pilha nao foi preenchida ", null);
		else
			InOut.MsgDeInformacao("O topo da Pilha e", "" + pilha.topo() );		
		
			
		if(fila.eVazia())
			InOut.MsgDeAviso("esta fila nao foi preenchida ", null);
		else
		InOut.MsgDeInformacao("O inicio da Fila e ", "" + fila.inicio());
		}
	

	private static void teste(PilhaInteiro pilha, FilaInteiro fila) {
		do {
			InOut.MsgDeInformacao(null, ""+pilha.topo());
			pilha.pop();
			
		}while(!pilha.eVazia());
	}
	
}


	
	