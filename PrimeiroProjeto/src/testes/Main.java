package testes;

import entidades.ContaCorrente;
import entidades.ContaPoupanca;

public class Main {
	public static void main(String[] args) {
		// System.out.println("Teste");
		// System.out.println();
		ContaPoupanca cp = new ContaPoupanca();

		cp.setNumero(1);
		cp.setSaldo(1000);
		cp.diaDoAniversario = 23;

		cp.imprimeExtratoDetalhado();

		ContaCorrente cc = new ContaCorrente();

	}
}
