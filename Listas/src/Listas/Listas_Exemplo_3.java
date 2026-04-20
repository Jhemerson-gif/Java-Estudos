package Listas;

import java.util.Arrays;
import java.util.ArrayList;


public class Listas_Exemplo_3 {

	public static void main(String[] args) {
		
		System.out.println("=== Criando e Acessando Listas em Java ====\n");
		
		ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(10,20,30,40,50));
		
		System.out.println("Lista de números: "+ numeros);
		
		
		
		ArrayList<String> frutas = new ArrayList<>(Arrays.asList("Maça", "Banana", "Cereja"));
		
		System.out.println("Lista de frutas: "+ frutas);
		
		
		ArrayList<Object> mista = new ArrayList<>();
		
		mista.add(10); // int
		mista.add("Ola"); // String
		mista.add(2.5); // Double
		mista.add(new ArrayList<>(Arrays.asList("a","b"))); //Lista
		mista.add(true); // Booleano
		
		System.out.println("Lista mista: "+ mista);
		
		
		ArrayList<String> frutas2 = new ArrayList<>(Arrays.asList("maça", "banana", "cereja", "damasco"));
		
		System.out.println("\n Primeira fruta: " + frutas2.get(0));
		System.out.println("\n Segunda fruta: " + frutas2.get(1));
		System.out.println("\n Terceira fruta: " + frutas2.get(2));
		System.out.println("\n Quarta fruta: " + frutas2.get(3));
		
		int tamanho = frutas2.size();// metodo para medi o tamanho da lista
		
		System.out.println("\nÚltima fruta (tamanho -1): "+ frutas2.get(tamanho -1)); // motodo para buscar o ultimo na lista
		
		
		
	}

}
