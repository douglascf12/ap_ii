package Aula02;

public class Exe1 {
	
	// Dado a matriz Anxm, faça uma função que recebe a matriz Anxm por
	// parâmetro, em seguida a função aloca e devolve sua transposta At
	// , onde A[i][j] = At[j][i] para qualquer i e j.

	public static void main(String[] args) {
		int[][] m = {
				{0, 6},
				{-1, 2},
				{5, 0},
		};
		int[][] mT = transposta(m);
		imprimir(m);
		System.out.println();
		imprimir(mT);
	}
	
	public static void imprimir(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.printf("%3d", m[i][j]);
			}
			System.out.println();
		}
	}
	
	public static int[][] transposta(int[][]m){
		int[][] mT = new int[m[0].length][m.length];
		
		for (int i = 0; i < mT.length; i++) {
			for (int j = 0; j < mT[0].length; j++) {
				mT[i][j] = m[j][i];
			}
		}
		return mT;
	}
}