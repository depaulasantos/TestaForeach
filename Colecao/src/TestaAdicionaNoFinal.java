import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaAdicionaNoFinal {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		LinkedList linkedList = new LinkedList();

		long tempo = TestaAdicionaNoFinal.adicionaNoFinal(arrayList);
		System.out.println("Final ArrayList : " + tempo + "ms");

		tempo = TestaAdicionaNoFinal.adicionaNoFinal(linkedList);
		System.out.println("Final LinkedList : " + tempo + "ms");
	}

	public static long adicionaNoFinal(List lista) {
		long inicio = System.currentTimeMillis();
		int size = 100000;
		for (int i = 0; i < size; i++) {
			lista.add(0, i);
		}
		long fim = System.currentTimeMillis();
		return fim - inicio;
	}
}
