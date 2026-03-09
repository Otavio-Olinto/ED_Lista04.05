package view;

import controller.Ordem;

public class Principal {

	public static void main(String[] args) {
		// Importanto os métodos da Classe Ordem
		Ordem metodo = new Ordem();
		
		int[] vetor1 = {74,20,74,87,81,16,25,99,44,58};
		int[] vetor2 = {44,43,42,41,40,39,38};
		int[] vetor3 = {101,102,103,125,124,123,104,105,106,122};
		
		// Tratando o vetor 1
		System.out.println("Vetor1 antes da ordenação:");
		for(int cont=0; cont<10; cont++) System.out.print(vetor1[cont]+" ");
		
		System.out.println("\nVetor1 após da ordenação:");
		vetor1=metodo.mergeSort(vetor1);
		for(int cont=0; cont<10; cont++) System.out.print(vetor1[cont]+" ");
		
		
		// Tratando o vetor 2
		System.out.println("\n\nVetor2 antes da ordenação:");
		for(int cont=0; cont<7; cont++) System.out.print(vetor2[cont]+" ");
		
		System.out.println("\nVetor2 após da ordenação:");
		metodo.bubbleSort(vetor2);
		for(int cont=0; cont<7; cont++) System.out.print(vetor2[cont]+" ");
		
		
		// Tratando o vetor 3
		System.out.println("\n\nVetor3 antes da ordenação:");
		for(int cont=0; cont<10; cont++) System.out.print(vetor3[cont]+" ");
			
		System.out.println("\nVetor3 após da ordenação:");
		metodo.mergeSort(vetor3);
		for(int cont=0; cont<10; cont++) System.out.print(vetor3[cont]+" ");
	}

}
