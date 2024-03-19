package Visão;


import javax.swing.JOptionPane;

import Modelagem.Aluno;
import Negócio.Vetor;

public class SistemaDeControleDeAlunos {

	private static final String JOptionPane = null;

	public static void main(String[] args) {
		Aluno paulo = new Aluno();
		paulo.setAltura(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a sua altura:")));
		
		
		Aluno pedro = new Aluno();
		pedro.setAltura(1.59);
	
		Aluno joao = new Aluno();
		joao.setAltura(1.65);
		
		Vetor alunos = new Vetor();
		alunos.adicionarAltura(0, paulo);
		alunos.adicionarAltura(1, pedro);
		alunos.adicionarAltura(2, joao);
		
		
		
		
	}
	
	

}
