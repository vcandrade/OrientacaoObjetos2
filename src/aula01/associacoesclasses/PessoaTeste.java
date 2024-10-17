package aula01.associacoesclasses;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Endereco end = new Endereco("Vicente Machado", 1024, "Centro", "Ponta Grossa", "PR");
		Pessoa pessoa = new Pessoa("João da Silva", "10/10/2000", "Masculino", "joao@email.com", "Solteiro", end);
		
		pessoa.imprimirDados();
	}
}
