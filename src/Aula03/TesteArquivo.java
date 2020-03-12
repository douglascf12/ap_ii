package Aula03;

import java.io.BufferedReader;
import java.io.FileReader;

public class TesteArquivo {

	public static void main(String[] args) throws Exception {
		
		FileReader arquivo = new FileReader("entrada.txt");
		
		BufferedReader leitor = new BufferedReader(arquivo);
		String linha;
		
		while ((linha = leitor.readLine()) != null) {
			System.out.println(linha);
		}
		
		leitor.close();

	}
}