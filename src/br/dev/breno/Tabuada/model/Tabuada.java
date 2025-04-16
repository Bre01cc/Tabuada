package br.dev.breno.Tabuada.model;

public class Tabuada {
	private double multiplicando;
	private double minimoMultiplicador;
	private double maximoMultiplicador;
	// Atributos privados(não aparece para outras classes)

	public double getMultiplicando() {
		return multiplicando;
		// get(retira algo da classe)
	}

	public void setMultiplicando(double multiplicando) {
		this.multiplicando = multiplicando;
		// this é quando estamos se referiando a propria classe(quando estamos dentro
		// dela)
		// recebe multiplicando(set é de inserir algo)
	}

	public double getMinimoMultiplicador() {
		return minimoMultiplicador;
	}

	public void setMinimoMultiplicador(double minimoMultiplicador) {
		this.minimoMultiplicador = minimoMultiplicador;
	}

	public double getMaximoMultiplicador() {
		return maximoMultiplicador;
	}

	public void setMaximoMultiplicador(double maximoMultiplicando) {
		this.maximoMultiplicador = maximoMultiplicando;
	}

	public String[] mostrarTabuada() {
		System.out.println("Tabuada do" + multiplicando);

		if (minimoMultiplicador > maximoMultiplicador) {
			double troca = minimoMultiplicador;
			minimoMultiplicador = maximoMultiplicador;
			maximoMultiplicador = troca;
		}
		System.out.println("Tabuada Do"+ multiplicando);
		//Criar vetor que vai guardar a tabuada
		//Cada elemento do será uma linha da tabuada
		
	    int tamanhoTabuada = (int) (maximoMultiplicador - minimoMultiplicador +1);
		String[]tabuada = new String[tamanhoTabuada];
		int i = 0;

		while (minimoMultiplicador <= maximoMultiplicador) {
			double produto = multiplicando * minimoMultiplicador;
			tabuada[i]= multiplicando + "X" + minimoMultiplicador +  "=" + produto;
			
			minimoMultiplicador++;

		}
		
		return tabuada;
		
	}
}

	


