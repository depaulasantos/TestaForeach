package br.com.k19.banco.sistema;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		try {
			f.aumentaSalario(-1000);
		} catch (IllegalArgumentException e) {
			System.out.println("Houve erro");
		}
	}
}
