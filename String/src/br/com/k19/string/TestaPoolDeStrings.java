package br.com.k19.string;

public class TestaPoolDeStrings {
	public static void main(String[] args) {
		String nome1 = "Alberto Roberto";
		String nome2 = "Alberto Roberto";

		System.out.println("Exemplo String");
		System.out.println(nome1 == nome2);
		System.out.println(nome1.equals(nome2));
		System.out.println();

		String nome3 = new String("Rafael Cosentino");
		String nome4 = new String("Rafael Cosentino");

		System.out.println("Exemplo new String");
		System.out.println(nome3 == nome4);
		System.out.println(nome3.equals(nome4));

	}
}
