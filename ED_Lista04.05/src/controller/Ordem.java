package controller;

import otavio.ordenar.bubblesort.BubbleSort;
import otavio.ordenar.mergesort.MergeSort;


public class Ordem {

	public Ordem() {
		super();
	}
	
	public int[] bubbleSort(int[] vetor) {
		
		// Importanto os métodos da Classe BubbleSort
		BubbleSort metodo = new BubbleSort();
		
		metodo.ordenar(vetor);
		
		return vetor;
	}
	
	public int[] mergeSort(int[] vetor) {
		
		// Importanto os métodos da Classe MergeSort
		MergeSort metodo = new MergeSort();
		
		int tamanho = vetor.length;
		
		metodo.ordenar(vetor, 0, tamanho-1);
		
		return vetor;
	}

}
