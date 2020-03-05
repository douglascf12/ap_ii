package Aula02;

public class Exe3 {
	
	// 3. O traço de uma matriz é a soma dos elementos de sua diagonal
	// principal. Implemente uma função que receba uma matriz quadrada
	// (número de linhas = número de colunas) e devolva o seu traço.
	
	public static void main(String[] args) {
		int[][] m = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 8, 7, 6},
				{5, 4, 3, 2}
		};
		
		int soma = calcularTraco(m);
		System.out.println(soma);
	}
	
	public static int calcularTraco(int[][] m) {
		int soma = 0;
	
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				if(i == j) {
					soma += m[i][j];
				}
			}
		}
		return soma;
	}
	
}