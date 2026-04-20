package Revisao;

import java.util.Scanner;

public class Revisao_Exercicio_4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		int soma = 0;
		
		while(true) {
			
			System.out.print("Digite um numero (negativo para sair): ");
			
			numero = entrada.nextInt();
			
			if(numero < 0) {
				
				break;
			}
			
			soma+=numero;
		}
		System.out.println("A soma dos numeros digitados: "+ soma);
		entrada.close();
		
	}

}
