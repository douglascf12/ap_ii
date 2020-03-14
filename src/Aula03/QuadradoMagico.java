package Aula03;

public class QuadradoMagico {

	public static void main(String[] args) {
            int[][] M = {
                        {8, 0, 7},
                        {4, 5, 6},
                        {3, 10, 2}
                    };
            System.out.println(ehQuadradoMagico(M));
	}
	
	public static boolean ehQuadradoMagico(int[][] M) {
		int somaGeral = 0;
		int somaDiagPrin = 0;
		int somaDiagSegun = 0;
		for (int i = 0; i < M.length; i++) {
                    int somaLinha = 0;
                    int somaColuna = 0;
                    for (int j = 0; j < M[0].length; j++) {
                        somaLinha += M[i][j];
                        somaColuna += M[j][i];
                        if (i == j){
                            somaDiagPrin += M[i][j];
                        }
                        if (i + j == M.length - 1){
                            somaDiagSegun += M[i][j];
                        }
                    }
                    if (somaGeral == 0){
                        somaGeral = somaLinha;
                    }
                    if (somaGeral != somaLinha || somaGeral != somaColuna){
                        return false;
                    }
		}
                if (somaGeral != somaDiagPrin || somaGeral != somaDiagSegun){
                    return false;
                }
                return true;
	}
}