package tad_primeiraLista;

public interface Agenda {
	
	
	public void agenda(); 
	public void adicionarContato(Contato contato);
	public void excluirContato(Contato contato);
	public void removerContato(int indice);
	public void atualizarContato(int indice, Contato novoContato);

}
