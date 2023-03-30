package tad_primeiraLista;

public class TadLivros implements Livros {
	
	
	private String titulo, nomeEditora; 
	private int anoPubli;
	
	public TadLivros() {
		
	}
	
	public TadLivros(String titulo, String nomeEditora, int anoPubli) {
		super();
		this.titulo = titulo;
		this.nomeEditora = nomeEditora;
		this.anoPubli = anoPubli;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNomeEditora() {
		return nomeEditora;
	}

	public void setNomeEditora(String nomeEditora) {
		this.nomeEditora = nomeEditora;
	}

	public int getAnoPubli() {
		return anoPubli;
	}

	public void setAnoPubli(int anoPubli) {
		this.anoPubli = anoPubli;
	}

	public String titulo(String _titulo) {
		titulo = _titulo;
		return titulo;
	}

	
	public String editora(String _nomeEditora) {
		nomeEditora = _nomeEditora;
		return nomeEditora;
	}


	public int anoPublicacap(int _anoPubli) { 
		anoPubli = _anoPubli; 
		return anoPubli;
	}
}


	