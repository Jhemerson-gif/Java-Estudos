package Exercicios;

import java.util.ArrayList;
import java.util.Scanner;


public class Lista_Exercicio_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add("Lucas");
		nomes.add("Marcos");
		nomes.add("Carlos");
		nomes.add("Douglas");
		nomes.add("Jhemerson");
		
		
		String verificarnome;

		System.out.println("\nExercicio - 3 Procurar um Nome");
		
		System.out.print("Digite o nome: ");
		verificarnome = sc.nextLine();
		
		if(nomes.contains(verificarnome)) {
				
			System.out.println("O nome "+ verificarnome +" está dentro da lista de nomes !");
				
		}else {
				
			System.out.println("O nome digitado não se encontra dentro da lista !");
				
				
		}
	
	sc.close();
	}
}
