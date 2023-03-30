package tad_primeiraLista;

import javax.swing.JOptionPane;

public class TadNumerosRacionais implements NumerosRacionais {

	private int num1, num2; 

	public TadNumerosRacionais() {

	}
	
	public TadNumerosRacionais(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public void criarRacional(int x, int y) {
		if(y == 0) {
			num1 = x; 
			JOptionPane.showMessageDialog(null, num1);
		}

		else {
			num1 = x;
			num2 = y;
			JOptionPane.showMessageDialog(null, num1 + "/" + num2);
		}
	}

	public void multiplica (int x, int y) {
		num1 *= x;
		num2 *= y;
		JOptionPane.showMessageDialog(null, num1 + "/" + num2);
	}

	public void divisao (int x, int y) {
		num1 *= y;
		num2 *= x;
		JOptionPane.showMessageDialog(null, num1 + "/" + num2);
	}

	public void soma(int x, int y) {
		num1 = x;
		num2 = y;
		double soma = num1 + num2; 
		System.out.println(soma);
	}


	public boolean testaIgualdade(int x, int y) {
		num1 = x;
		num2 = y; 
		if(num1 == num2) {
			return true;
		}
		else {
			return false;
		}

	}

}






