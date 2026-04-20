package Array;

import java.util.Scanner;

public class Array_Exercicio_4 {

	public static void main(String[] args) {
		
		System.out.println("Somando a média dos Vetores");

		Scanner entrada = new Scanner(System.in);
		
		double[] numeros= new double[5];
		double soma = 0;
		
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.print("Digite o número: ");
			
			numeros[i] = entrada.nextInt();
			
			soma += numeros[i];
			
			
		}
	
		double media = soma / numeros.length;
		
		System.out.println("A média dos elementos: "+ media);
		
		
	}

}
