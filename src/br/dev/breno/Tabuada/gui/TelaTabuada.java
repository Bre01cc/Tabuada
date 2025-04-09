package br.dev.breno.Tabuada.gui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class TelaTabuada {

	private JLabel labelMultiplicando;
	private JLabel labelMinMultiplicador;
	private JLabel labelMaxMultiplicador;
	private JTextField textMultiplicandol;
	private JTextField textMaxMultiplicador;
	private JTextField textMinMultiplicador;
	private JButton buttonLimpar;
	private JButton buttonCalcular;
	private JList listTabuada;
	private JScrollPane scrollTabuada;
	private String tituloDaTela;
	

	public void criarTela(String tituloDaTela) {
		this.tituloDaTela = tituloDaTela;
		JFrame tela = new JFrame();
		tela.setTitle(this.tituloDaTela);
		tela.setSize(265,600);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setResizable(false);
		tela.setLayout(null);//podemos selecionar onde o objeta vai estar
		
		//Obtendo a refêrencia do painel de conteúdo da tela
		Container container = tela.getContentPane();
		
		//Criar Label  multiplicando
		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando: ");
		labelMultiplicando.setBounds(20, 20, 150, 30);
		
		//Criar o label MinMultiplicador
		labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Mínimo multiplicador: ");
		labelMinMultiplicador.setBounds(20, 60, 150, 30);
		
		//Criar o label MinMultiplicador
				labelMaxMultiplicador = new JLabel();
				labelMaxMultiplicador.setText("Máximo multiplicador: ");
				labelMaxMultiplicador.setBounds(20, 100, 150, 30);
				
		//Criar o TextField  multiplicando
				textMultiplicandol = new JTextField();
				textMultiplicandol.setBounds(180, 20, 50, 30);	
				
				
			//Criar o TextField  MinMultiplicando
				textMinMultiplicador = new JTextField();
				textMinMultiplicador.setBounds(180, 60, 50, 30);	
				
			//Criar o TextField  MaxMultiplicando
				textMaxMultiplicador = new JTextField();
				textMaxMultiplicador.setBounds( , 60, 50, 30);
		
		buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(20, 140, 100, 30);
		
		buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(130, 140, 100, 30);
		
		
			
				
		//Adicionando os componentes no Painel de conteúdo do JFrame
		container.add(labelMultiplicando);
		container.add(textMultiplicandol);
		container.add(labelMinMultiplicador);
		container.add(textMinMultiplicador);
		container.add(labelMaxMultiplicador);
		container.add(textMaxMultiplicador);
		container.add(buttonCalcular);
		container.add(buttonLimpar);
		
		
		//tornar a tela visivel "DEVE!!!" ser a ultima instrução
		tela.setVisible(true);

	}

	private void exibirTabuada() {

	}

	private void limparTabuada() {

	}
	

}
