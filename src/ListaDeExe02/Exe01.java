package ListaDeExe02;

public class Exe01{
    // 1. Dadas duas matrizes A e B descritas abaixo:
    //
    //    A             B
    // 7 8 4 9      6 9 11 15
    // 2 1 7 3      32 19 3 4
    //
    // Calcular C = A + B

    public static void main (String[] args){
        int[][] matrizA = {
                            {7, 8, 4, 9},
                            {2, 1, 7, 3},
                          };
        int[][] matrizB = {
                            {6, 9, 11, 15},
                            {32, 19, 3, 4},
                           };
        int[][] matrizC = soma(matrizA, matrizB);
        imprimir(matrizC);
    }
    public static int[][] soma(int mA[][], int mB[][]){
        int[][] mC = new int[mA.length][mA[0].length];
        for(int i = 0; i < mA.length; i++){
            for (int j = 0; j < mA[0].length; j++) {
                mC[i][j] = mA[i][j] + mB[i][j];
            }
        }
        
        return mC;
    }
    public static void imprimir(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.printf("%3d", m[i][j]);
			}
			System.out.println();
		}
	}
}