package Alg;

import java.util.Scanner;

public class Aula4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double nota;
		double soma = 0;
		
		for (int i =1; i<= 4; i++) {
			
			System.out.println("Digite a nota" + i + ":");
			
			nota = entrada.nextDouble();
			
			soma = soma+ nota;
			
		}
		
		double media = soma / 4;
		
		System.out.println("A média das notas é: "+media);
		
		entrada.close();

	}

}
