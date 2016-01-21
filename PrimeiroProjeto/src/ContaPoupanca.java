import java.text.SimpleDateFormat;

public class ContaPoupanca extends Conta {
	private int diaDoAniversario;
	
	public void imprimeExtratoDetalhado {
		System.out.println("EXTRATO DETALHADO DA CONTA POUPANCA");
		
		SimpleDateFormat sdf = SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date agora = new Date();
		
		System.out.println("Data:"+sdf.format(agora));
		System.out.println("Saldo:"+this.Saldo);
		
	}

}
