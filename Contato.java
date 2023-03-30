package tad_primeiraLista;

public class Contato {


	private String nome, email;
	private int telefone, indice;

	public Contato(String nome, String email, int telefone, int indice) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.indice = indice;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getIndice() {
		return indice;
	}
	public void setIndice(int indice) {
		this.indice = indice;
	}


}
