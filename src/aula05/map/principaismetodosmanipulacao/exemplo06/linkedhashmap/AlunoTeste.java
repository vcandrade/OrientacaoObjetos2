package aula05.map.principaismetodosmanipulacao.exemplo06.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class AlunoTeste {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno(111111, "João da Silva", "Tecnologia em Análise e Desenvolvimento de Sistemas");
		Aluno aluno2 = new Aluno(222222, "Maria de Oliveira", "Bacharelado em Ciência da Computação");
		Aluno aluno3 = new Aluno(333333, "Ricardo Carvalho", "Bacharelado em Ciências Biológicas");
		Aluno aluno4 = new Aluno(444444, "Ana Souza", "Tecnologia em Análise e Desenvolvimento de Sistemas");

		Map<Integer, Aluno> alunos = new LinkedHashMap<>();

		alunos.put(333333, aluno3);
		alunos.put(111111, aluno1);
		alunos.put(444444, aluno4);
		alunos.put(222222, aluno2);

		alunos.forEach((chave, aluno) -> {

			System.out.println("Chave: " + chave + " - " + aluno);
		});
	}
}
