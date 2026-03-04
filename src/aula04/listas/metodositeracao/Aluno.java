package aula04.listas.metodositeracao;

public class Aluno {

	private int ra;
    private String nome;
    private String curso;

    public Aluno(int ra, String nome, String curso) {
    
    	this.ra = ra;
        this.nome = nome;
        this.curso = curso;
    }

    public int getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }
}
