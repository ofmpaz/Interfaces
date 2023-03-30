package tad_primeiraLista;


import java.util.Scanner;

public class TadProfessor<T> implements Professor<T> {

	Scanner sc = new Scanner(System.in);

	private String nome[], codigo[][];

	public TadProfessor() {

	}
	
	public TadProfessor(String[] nome, String[][] codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}
	
	public String[] getNome() {
		return nome;
	}

	public void setNome(String[] nome) {
		this.nome = nome;
	}

	public String[][] getCodigo() {
		return codigo;
	}

	public void setCodigo(String[][] codigo) {
		this.codigo = codigo;
	}


	public void nome(int _qtdNome) {
		nome = new String[_qtdNome];
		for (int i = 0; i < _qtdNome; i++) {
			nome[i] = sc.nextLine();

		}
	}

	public void codigo_discplina( int _qtdCodigo) {
		codigo = new String[_qtdCodigo][_qtdCodigo];
		for (int i = 0; i < _qtdCodigo; i++) {
			for (int j = 0; j < _qtdCodigo; j++) {
				codigo[i][j] = sc.nextLine(); 
			}
		}
	}

}
