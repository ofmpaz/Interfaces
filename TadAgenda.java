package tad_primeiraLista;
import java.util.ArrayList;

public class TadAgenda implements Agenda {
	
	private ArrayList<Contato> contatos;
	

	public TadAgenda() {

	}

	public TadAgenda(ArrayList<Contato> contatos) {
		this.contatos = contatos;
	}

	public void agenda() {
		this.contatos = new ArrayList<>();
	}

	public void adicionarContato(Contato contato) {
		this.contatos.add(contato);
	}

	public void excluirContato(Contato contato) {
		this.contatos.remove(contato);
	}

	public void removerContato(int indice) {
		this.contatos.remove(indice);
	}

	public void atualizarContato(int indice, Contato novoContato) {
		this.contatos.set(indice, novoContato);
	}
}
