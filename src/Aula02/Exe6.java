package Aula02;

public class Exe6 {

	public static void main(String[] args) {
		
		int[][] A = {
						{2, 3, 1},
						{-1, 0, 2},
					};
		int[][] B = {
						{1, -2},
						{0, 5},
						{4, 1},
					};
		int[][] C = multiplicacao(A, B);
		imprimir(C);
	}
	
	public static int[][] multiplicacao(int[][] A, int[][] B){
		int[][] C = new int[A.length][B[0].length];
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B[0].length; j++) {
				for (int k = 0; k < A[0].length; k++) {
					C[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		return C;
	}
	
	public static void imprimir(int[][] M) {
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				System.out.printf("%3d", M[i][j]);
			}
			System.out.println();
		}
	}
}