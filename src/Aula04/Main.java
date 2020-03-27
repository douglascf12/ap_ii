package Aula04;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

	public static int[] leVetor(String nomeArquivo) throws Exception {
	    FileReader arquivo = new FileReader("vetor.txt");
	    BufferedReader leitor = new BufferedReader(arquivo);
	    // le as duas linhas do arquivo
	    String linha1 = leitor.readLine();
	    String linha2 = leitor.readLine();
	    // fecha o arquivo
	    leitor.close();
	    // transformar o dado da linha 1 em um inteiro
	    int tam = Integer.parseInt(linha1);
	    // criar o vetor
	    int[] vetor = new int[tam];
	    // separar os dados da linha
	    String[] dados = linha2.split(" ");
	    // armazena os dados no vetor de resultado
	    for (int i = 0; i < vetor.length; i++) {
	      vetor[i] = Integer.parseInt(dados[i]);
	    }
	    return vetor;
	  }
	  
	  public static void main(String[] args) throws Exception {
	    int[] v = leVetor("vetor.txt");
	    for (int i = 0; i < v.length; i++) {
	      System.out.print(v[i] + " ");
	    }
	    System.out.println();
	  }
	}