package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta {
	public int diaDoAniversario;

	public void imprimeExtratoDetalhado() {
		System.out.println("EXTRATO DETALHADO DA CONTA POUPANCA");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date agora = new Date();

		System.out.println("Data ............: " + sdf.format(agora));
		System.out.println("Saldo ...........: " + this.getSaldo());
		System.out.println("Dia Aniversario .: " + this.diaDoAniversario);

	};

}
