package Alg;

import java.util.Scanner;

public class Aula5 {
	
	// Função que calcula a área do retângulo
	public static double calcularArea(double base, double altura) {
		double area = base * altura; // Calcula a área
		return area; // Retorna o valor da área
	}

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); // Cria onjeto para ler dados
		
		System.out.println("Digite a base do retângulo: ");
		
		double base = entrada.nextDouble();
		
		System.out.println("Digite a altura do retângulo: "); 
		
		double altura = entrada.nextDouble(); // Lê a altura
		
		double resultado = calcularArea(base, altura); // Chama a função
		
		System.out.println("A área do retângulo é: "+ resultado); // Mostra o resultado
		
		entrada.close(); //Fecha o Scanner

	}

}
