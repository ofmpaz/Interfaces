package tad_primeiraLista;

public class TadAlunos<T> implements Alunos<T>{

	private String nome;
	private int semestre;


	public TadAlunos() {

	}

	public TadAlunos(String nome, int semestre) {
		super();
		this.nome = nome;
		this.semestre = semestre;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSemestre() {
		return semestre;
	}


	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public void nome(String _nome) {
		setNome(_nome);

	}

	public void semestre(int _semestre) {
		setSemestre(_semestre);

	}
}
