package tad_primeiraLista;

public class TadContaBancaria implements ContaBanco {

	private double saldo;


	public TadContaBancaria() {

	}
	
	public TadContaBancaria(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void visualizarSalgo() {
		System.out.println(saldo);
	}

	public void deposita(double _deposita) {
		saldo += _deposita; 
	}

	public void saca_atualiza(double _saca) {
		if(saldo >= _saca) {
			saldo -= _saca; 
			System.out.println("Saldo atualizado: " + saldo);
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
}
