package Listas;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Arrays;

public class Lista_Exemplo_8 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(6,3,8,15,2,7,14));
		
		System.out.println("Lista de números: "+ numeros);
		
		int tamanho = numeros.size(); // tamanho do numero na lista
		
		System.out.println("O número de elementos na lista: "+ tamanho);
		
		int maior = Collections.max(numeros); // maior numero na lista
		System.out.println("O maior numero na lista é: "+ maior);
		
		int menor = Collections.min(numeros);
		System.out.println("O menor numero na lista é: "+ menor); // menor numero na lista
		
		int somatotal = 0;
		
		for (int num : numeros) { // soma dos numeros na lista
			
			somatotal +=num;
		}
		
		System.out.println("A soma dos elementos na lista é: "+ somatotal); 
		
	}

}
