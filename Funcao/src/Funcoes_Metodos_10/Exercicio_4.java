package Funcoes_Metodos_10;

import java.util.Scanner;

public class Exercicio_4 {
	
	public static boolean checkIdade(int idade) {
		
		return idade >= 18;
		
	}

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
		
		boolean idade = checkIdade(sc.nextInt());
		
		System.out.println("Você é maior de idade? "+ idade);

	}

}
