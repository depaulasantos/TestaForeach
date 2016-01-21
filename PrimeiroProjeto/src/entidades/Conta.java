package entidades;

abstract class Conta {
	private int numero;
	private double saldo;

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public abstract void imprimeExtratoDetalhado();
}
