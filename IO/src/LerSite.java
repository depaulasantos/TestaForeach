import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class LeituraDeArquivo {
	public static void main(String[] args) throws IOException {

		InputStream site = new URL("http://www.k19.com.br").openStream();

		Scanner scanner = new Scanner(site);

		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			System.out.println(linha);
		}
		scanner.close();
		site.close();
	}
}
