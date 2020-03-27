package Aula04;

public class Exe01_SelectionSort {
	
	// 1. Pesquise como funciona o método de ordenação por seleção, ele é
	// melhor que o bolha ou o inserção? Implemente o método em Java.

	public static void main(String[] args) {
		int[] v = {3, 1, 7, 5, 8, 6, 2, 4};
		selectionSort(v);   
	    imprimeVetor(v);

	}
	
	public static void selectionSort(int[] v) {
		int interacoes = 0;
		for (int i = 0; i < v.length; i++) {
			int menor = i;
			for (int j = i + 1; j < v.length; j++) {
				if(v[j] < v[menor]) {
					menor = j;
				}
				trocar(v, i, menor);
				interacoes++;
			}
		}
		System.out.println(interacoes);
	}
	
	public static void trocar(int[] v, int i, int menor) {
		int aux = v[i];
		v[i] = v[menor];
		v[menor] = aux;
	}
	
	public static void imprimeVetor(int[] v) {
		for( int i=0; i < v.length; i++)
			System.out.println("v[" + i + "]: " + v[i]);
		}
}