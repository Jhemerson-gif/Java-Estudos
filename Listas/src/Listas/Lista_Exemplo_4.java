package Listas;

import java.util.ArrayList;
import java.util.Arrays;

public class Lista_Exemplo_4 {

	public static void main(String[] args) {
		
		System.out.println("=== 1. ADICIONAR ELEMENTOS ===");
		
		ArrayList<String> frutas = new ArrayList<>(Arrays.asList("Maça","banana")); 
		
		frutas.add("cereja"); // adicionado a lista frutas
		
		System.out.println("add (apprend): " + frutas);
		
		frutas = new ArrayList<>(Arrays.asList("maça", "banana", "cereja")); // não precisa adicionar o comando "ArrayList<String> pois já foi deficinido no começo
		
		frutas.add(1,"abacate"); // o numero 1 define a posição que o item vai entrar dentro da lista
		
		System.out.println("add(index, valor)(insert): " + frutas);
		
		

		System.out.println("=== 2. REMOVER ELEMENTOS ===");
		
		
		frutas = new ArrayList<>(Arrays.asList("Maça","banana","cereja")); 
		
		frutas.remove("banana"); // remove pelo  valor definido
		
		System.out.println("remove(valor):" + frutas);
		
		
		
		frutas = new ArrayList<>(Arrays.asList("Maça","banana","cereja")); 
		
		frutas.remove(1); // remove pelo index
		
		System.out.println("remove(index):" + frutas);
		
		frutas = new ArrayList<>(Arrays.asList("Maça","banana","cereja")); 
		
		frutas.remove(frutas.size() -1); // remove o ultimo valor
		
		System.out.println("remove(ultimo item):" + frutas); 
		
		
		System.out.println("=== 3. CONCATERNAS LISTAS ===");
		
		
		ArrayList<Integer> lista1 = new ArrayList<>(Arrays.asList(1,2,3));
		ArrayList<Integer> lista2 = new ArrayList<>(Arrays.asList(4,5,6));
		
		ArrayList<Integer> uniao = new ArrayList<>(lista1); // copia os valores da lista 1
		
		uniao.addAll(lista2); // adicionando a lista um dentro da lista 2
		
		System.out.println("Concatenação (+ / extend): "+ uniao);
		
		lista1 = new ArrayList<>(Arrays.asList(1,2,3));
		
		lista2 = new ArrayList<>(Arrays.asList(4,5,6));
		
		lista1.addAll(lista2);
		
		System.out.println("addAll (extend: "+ lista1); // adicionando de maneira direta na em uma lista
		
		
		System.out.println("=== 4. REPERTIR LISTAS ===");
		
		ArrayList<String> repeticao = new ArrayList<>();
		
		for (int i = 0; i < 3; i++){
			repeticao.add("a");
			repeticao.add("b");
		}
		
		System.out.println("Repetição manual (*): "+ repeticao); // repertição  com valor  delimitado em 3
		
		
		System.out.println("=== 5. VERIFICAR SE UM ITEM ESTÁ NA LISTAS ===");
		
		frutas = new ArrayList<>(Arrays.asList("maça","banana","cereja"));
		
		System.out.println("Coném 'banana'? "+ frutas.contains("banana"));  // contains checka se o  valor está na lista e retorna em booleano
		
		System.out.println("Coném 'uva'? "+ frutas.contains("uva"));
		
		
		
		
		
	}

}
