package Negócio;

import java.util.Arrays;

import Modelagem.Aluno;

public class Vetor {
	public Aluno[] alunos = new Aluno[3];
	
	public void adicionarAltura(int posicao,Aluno aluno) {
		alunos[posicao] = aluno;
		
	}
	@Override
	public String toString() {
		return Arrays.toString(alunos);
		
	}
}
