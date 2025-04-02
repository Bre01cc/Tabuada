package br.dev.breno.Tabuada;

import br.dev.breno.Tabuada.model.Tabuada;

public class Main {

	public static void main(String[] args) {
		Tabuada tabuada = new Tabuada();
		tabuada.setMultiplicando(8);
		tabuada.setMinimoMultiplicador(14);
		tabuada.setMaximoMultiplicador(20);
		tabuada.mostrarTabuada();
		// new(para criação de um novo objeto)Tabuada é o chamado da classe

		Tabuada tabuada2 = new Tabuada();
		tabuada2.setMultiplicando(45);
		tabuada2.setMinimoMultiplicador(14);
		tabuada2.setMaximoMultiplicador(50);
		tabuada2.mostrarTabuada();
		
		System.out.println(tabuada.getMultiplicando());
		double mult1 = tabuada2.getMultiplicando();
		
		if(mult1 % 2 == 0) {
			System.out.println(" O multipicando"+ mult1 +"é PAR!!");
		}
		else {
			System.out.println(" O multipicando"+ mult1 +"é ÍMPAR!!");
		}
	}

}
