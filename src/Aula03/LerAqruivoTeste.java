package Aula03;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LerAqruivoTeste {

	public static void main(String[] args) throws IOException {
		Scanner nomeArquivo = new Scanner(System.in);
		
		System.out.print("Informe o nome do arquivo: ");
		String nome = nomeArquivo.nextLine();
		
		FileReader arquivo = new FileReader(nome);
		BufferedReader lerArquivo = new BufferedReader(arquivo);
		 
	    String linha = lerArquivo.readLine();
	    
	    System.out.println();
		
		while (linha != null) {
			System.out.printf("%s\n", linha);
			linha = lerArquivo.readLine();
		}
		arquivo.close();
		nomeArquivo.close();
	}
}