package Aula04;

public class Bolha {

	public static void main(String[] args) {
		int[] v = {3, 1, 7, 5, 8, 6, 2, 4};
		metodoBolha(v);   
	    imprimeVetor(v);
	}
	
	public static void metodoBolha(int[] v) {
		int interacoes = 0;
		for (int i = 1; i < v.length; i++) {
			for (int j = 0; j < v.length - 1; j++) {
				if(v[j] > v[j+1]) { // troca
					int tmp = v[j];
					v[j] = v[j+1];
					v[j+1] = tmp;
					interacoes++;
				}
			}
		}
		System.out.println(interacoes);
	}
	
	public static void imprimeVetor(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println("v[" + i + "]: " + v[i]);
		}
	}
}