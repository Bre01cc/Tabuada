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

	public void mostrarTabuada() {
		System.out.println("Tabuada do" + multiplicando);

		if (minimoMultiplicador > maximoMultiplicador) {
			double troca = minimoMultiplicador;
			minimoMultiplicador = maximoMultiplicador;
			maximoMultiplicador = troca;
		}

		while (minimoMultiplicador <= maximoMultiplicador) {
			double produto = multiplicando * minimoMultiplicador;
			System.out.println("multiplicando" + "X" + minimoMultiplicador + " =" + produto);
			minimoMultiplicador++;

		}
		System.out.println();
		System.out.println("Fim daTabuada do: " + multiplicando);
		System.out.println("---------------------------------");
		System.out.println();

	}

	 
	}


