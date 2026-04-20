package Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Listas_Exemplo_5 {

	public static void main(String[] args) {
		
		
		ArrayList <Integer> numeros = new ArrayList<>(Arrays.asList(23,1,45,6,12));
		
		ArrayList<String> frutas = new ArrayList<>(Arrays.asList(
				
				"banana",
				"maça",
				"banana",
				"cereja",
				"maça",
				"damasco"
				));
				
			System.out.println("=== LISTA ORIGINAL DE NUMEROS");
				
			System.out.println(numeros);
				
			Collections.sort(numeros); // ordena em ordem de menor ao maior
			
			System.out.println("\n=== Números ordenados (crescente)" + numeros);
			
			System.out.println("\n=== Lista original de frutas ===");
			
			System.out.println(frutas);
			
			Collections.sort(frutas); // ordem alfabetica
			
			System.out.println("Frutas ordenadas (ordem alfabética): "+ frutas);
			
			
			//
			System.out.println("\nNúmeros ordenados(ordemdescrecente): ");
			
			Collections.sort(numeros, Collections.reverseOrder()); // ordena a lista e reversa para os numeros

			System.out.println("\nFrutas ordenados (descrecente)"+ numeros); 
			
			//
			System.out.println("\n=== Ivertendo a ordem ===");
			
			Collections.reverse(numeros); // pega a lista pelo contrario
			
			System.out.println("Números após reverse(): "+ numeros);
			
			
			Collections.reverse(frutas); 
			
			System.out.println("Frutas após reverse(): "+ frutas);
			
			
			System.out.println("\n=== Contando ocorrências ===");
			
			int ocorrenciasbanana = 0;
			
			for (String fruta : frutas) {
				
				if(fruta.equals("banana")) {
					
					ocorrenciasbanana++;
				}
				
			}
			System.out.println("Ocorrências de 'banana': "+ ocorrenciasbanana);
			
			int ocorrenciasnumero6 = 0;
			
			for (int num: numeros) {
				
				if(num == 6) {
					
					ocorrenciasnumero6++;
				}
			}
			System.out.println("Ocorrências do número 6: "+ ocorrenciasnumero6);
			
			
			System.out.println("\n=== Buscando indices ===");
			
			int indiceBanana = frutas.indexOf("banana");
			
			if (indiceBanana != -1) {
				
				System.out.println("índice da primeira 'banana': "+ indiceBanana);
				
			}else {
				
				System.out.println("'banana' não está na lista.");
			}
			
			
			int indice23 = numeros.indexOf(23);
			
			if (indice23 != -1) {
				
				System.out.println("índice do número 23: "+ indice23);
				
			}else {
				
				System.out.println("Número 23 não está na lista.");
			}

			
	}

}
