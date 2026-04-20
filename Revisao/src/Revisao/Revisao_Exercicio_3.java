package Revisao;

import java.util.Scanner;

public class Revisao_Exercicio_3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		while(true) {
			
			System.out.print("Digite o numero (-1 para sair): ");
			
			numero = entrada.nextInt();
			
			if (numero == -1) {
				
				System.out.println("Encerrando...");
				
				break;
			}
			
			System.out.println("Você digitou "+numero);
		
		}
		entrada.close();
	}

}
