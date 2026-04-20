package Alg;

import java.util.Scanner;

public class Aula8 {
	
	public static double calcularMedia (double n1, double n2) {
		
		double media = (n1+n2)/2;
		return media;
	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		
		double nota1 = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		
		double nota2 = entrada.nextDouble();
		
		double resultado = calcularMedia(nota1, nota2);
		
		System.out.println(resultado);
	}

}
