package Aula02;

public class Exe2 {

	public static void main(String[] args) {
		int[][] m = {
				{0, 6},
				{-1, 2},
				{5, 0},
		};
		int maior = maior(m);
		System.out.println(maior);
	}
	
	public static int maior(int[][] m) {
		int maior = 0;
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				if(maior < m[i][j]) {
					maior = m[i][j];
				}
			}
		}
		return maior;
	}
}