package br.dev.breno.Tabuada.gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.dev.breno.Tabuada.model.Tabuada;

public class TelaTabuada {

	private JLabel labelMultiplicando;
	private JLabel labelMinMultiplicador;
	private JLabel labelMaxMultiplicador;
	private JTextField textMultiplicando;
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
		tela.setSize(265, 600);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setResizable(false);
		tela.setLayout(null);// podemos selecionar onde o objeta vai estar

		// Obtendo a refêrencia do painel de conteúdo da tela
		Container container = tela.getContentPane();

		// Criar Label multiplicando
		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando: ");
		labelMultiplicando.setBounds(20, 20, 150, 30);

		// Criar o label MinMultiplicador
		labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Mínimo multiplicador: ");
		labelMinMultiplicador.setBounds(20, 60, 150, 30);

		// Criar o label MinMultiplicador
		labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Máximo multiplicador: ");
		labelMaxMultiplicador.setBounds(20, 100, 150, 30);

		// Criar o TextField multiplicando
		textMultiplicando = new JTextField();
		textMultiplicando.setBounds(180, 20, 50, 30);

		// Criar o TextField MinMultiplicando
		textMinMultiplicador = new JTextField();
		textMinMultiplicador.setBounds(180, 60, 50, 30);

		// Criar o TextField MaxMultiplicando
		textMaxMultiplicador = new JTextField();
		textMaxMultiplicador.setBounds(180, 100, 50, 30);

		buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(20, 140, 100, 30);

		buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(130, 140, 100, 30);

		// Adicionar o Jlist na tela

		listTabuada = new JList();

		// Criar o ScroollPane
		scrollTabuada = new JScrollPane(listTabuada);
		scrollTabuada.setBounds(20, 190, 210, 350);

		// Adicionando os componentes no Painel de conteúdo do JFrame
		container.add(labelMultiplicando);
		container.add(textMultiplicando);
		container.add(labelMinMultiplicador);
		container.add(textMinMultiplicador);
		container.add(labelMaxMultiplicador);
		container.add(textMaxMultiplicador);
		container.add(buttonCalcular);
		container.add(buttonLimpar);
		container.add(scrollTabuada);

		// Adcionar ouvintes de ação aos botões
		buttonCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String multiplicando = textMultiplicando.getText();
				String min = textMinMultiplicador.getText();
				String max = textMaxMultiplicador.getText();
				
				// Convertendo valores de string para double
				double multiplicandoDouble = Double.parseDouble(multiplicando);
				double minDouble = Double.parseDouble(min);
				double maxDouble = Double.parseDouble(max);
				
				
				Tabuada tabuada = new Tabuada();
				tabuada.setMultiplicando(multiplicandoDouble);
				tabuada.setMinimoMultiplicador(minDouble);
				tabuada.setMaximoMultiplicador(maxDouble);
				
				String[]tabuadaResult = tabuada.mostrarTabuada();
				listTabuada.setListData(tabuadaResult);

//				System.out.println("Multiplicando:"+ multiplicando);
//				System.out.println("Mín.Multiplicador:"+ MinMultiplicador);
//				System.out.println("Max.tiplicador:"+ MaxMultiplicador);

			}
	

		});
		buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textMultiplicando.setText(null);//retorna nulo
				textMaxMultiplicador.setText(null);//retorna nulo
				textMinMultiplicador.setText(null);//retorna nulo
				listTabuada.setListData(new String[0]);// apagamos a tabuada usando um vetor que retornar nada
				textMultiplicando.requestFocus();
				
			}
		});
		 
		

		// tornar a tela visivel "DEVE!!!" ser a ultima instrução
		tela.setVisible(true);

	}
	
	

	private void exibirTabuada() {

	}

	private void limparTabuada() {

	}

}
