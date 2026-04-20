package Alg;

import java.util.Scanner;

public class Aula2 {

	public static void main(String[] args) { //
		
		Scanner entrada = new Scanner(System.in); //
		
		int numero = -1; //
		
		int soma = 0; //
		
		while (numero !=0) { //
			
			System.out.println("Digite um numero (0 para parar)"); // Pede um número ao usuário
			
			numero = entrada.nextInt(); // Lê o número digitado
			
			soma = soma + numero; // Soma o número digitado à variável soma
		}
		
		System.out.println("A soma total é: " + soma); // Mostra o resultado da soma
		
		entrada.close(); // Fecha o Scanner

	}

}
