package AtividadeExtra;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
	
	// Considerando um vetor com números pares e ímpares, reescrever o método bolha para colocar todos os números
	// pares à frente no mesmo vetor e os ímpares ao final no mesmo vetor. Você não pode usar outro vetor como área
	// auxiliar. É desejável que os dados do vetor sejam lidos de um arquivo texto.

	public static void main(String[] args) throws Exception {
		int[] v = leVetor("vetor.txt");
		metodoBolha(v);
	    imprimeVetor(v);
	}
	
	public static int[] leVetor(String nomeArquivo) throws Exception {
	    FileReader arquivo = new FileReader("vetor.txt");
	    BufferedReader leitor = new BufferedReader(arquivo);
	    String linha1 = leitor.readLine();
	    String linha2 = leitor.readLine();
	    leitor.close();
	    int tam = Integer.parseInt(linha1);
	    int[] vetor = new int[tam];
	    String[] dados = linha2.split(" ");
	    for (int i = 0; i < vetor.length; i++) {
	      vetor[i] = Integer.parseInt(dados[i]);
	    }
	    return vetor;
	  }
	
	public static void metodoBolha(int[] v) {
		for (int i = 0; i < v.length; i++) {
	        for (int j = 0; j < v.length; j++) {
	        	if (v[i] % 2 == 0) {
	        		int aux = v[i];
	                v[i] = v[j];
	                v[j] = aux;            		
	        	}
	        }
	    }
	}
	
	public static void imprimeVetor(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println("v[" + i + "]: " + v[i]);
		}
	}
}