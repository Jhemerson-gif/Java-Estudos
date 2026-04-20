package Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas_Exemplo_6 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> minhalista = new ArrayList<>(Arrays.asList(
				0,1,2,3,4,5,6,7,8,9
				
				));
		
		System.out.println("Lista original: "+ minhalista);
		
		
		List<Integer> subcojunto = minhalista.subList(1,4);
		
		System.out.println("\nSubcojunto [1:4]: "+ subcojunto);
		
		List <Integer> primeirosElementos = minhalista.subList(0,2); // do 1 até 3
		
		System.out.println("Primeiros elementos [:2]: "+ primeirosElementos); // : define a quantidade de elementos a ser contados
		
		List<Integer> elementosDepoisde2 = minhalista.subList(2, minhalista.size());
		
		System.out.println("Elementos a partir do indice 2 [2:]: "+ elementosDepoisde2); // iniciando no 2  até o final
		
		
		
		ArrayList<Integer> elementosAlternados = new ArrayList<>();
		
		for(int i = 0; i < minhalista.size(); i+=2) {
			
			elementosAlternados.add(minhalista.get(i));
			
		}
		
		System.out.println("Elementos alternados [::2]: "+ elementosAlternados);
		
		
		ArrayList<Integer> subcojuntoAlternado = new ArrayList<>();
				
		for(int i = 2; i <8; i+=2) {
			
			subcojuntoAlternado.add(minhalista.get(i));
		}
		
		System.out.println("Subcojuntos alternado [2:8:2]: "+subcojuntoAlternado);
		
		
		
		System.out.println("minhalista[2]: "+ minhalista.get(2)); // pega a posição de um unico numero
		System.out.println("minhalista[4]: "+ minhalista.get(4));
		System.out.println("minhalista[6]: "+ minhalista.get(6));
	}

}
