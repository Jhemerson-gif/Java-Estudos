package Revisao;

import java.util.Scanner;

public class Revisao_Exemplo_1 {

	public static void main(String[] args) {
		
		System.out.println("\n1. Laço for com break e conitnue \n");
		
		for (int i = 1; i <= 10; i++) {
			
			if (i ==5){
				
				System.out.println("Número 5 pulando com 'continue'");
				
				continue;
			}
			
			if (i == 8) {
				
				System.out.println("Número 8 encontrado. Parando com 'break'");
				
				break;
			}
			
			System.out.println("Número: "+ i);
		}
		
		System.out.println("\n2. Laço while com break e continue \n");
		
		int contador = 0;
		
		while(contador < 10) {
			
			contador ++;
			
			if (contador %2 == 0){
				
				continue;
				
			}
			if (contador == 7) {
				
				System.out.println("Número 7 encontrado. Encerrrando com 'break'.");
				break;
				
			}
			
			System.out.println("Número impar: "+ contador);
		}
		
		System.out.println("\n3. Laço do-while com break e continue \n");
		
		int numero = 0;
		
		do {
			
			numero ++;
			
			if (numero == 3) {
				
				System.out.println("Número 3 ignorando com 'continue'");
				continue;
			}
			if ( numero == 6) {
				
				System.out.println("Número 6 encontrado. Saindo do laço com 'break'.");
				break;
				
			}
			
			System.out.println("Numero: "+ numero);
		}while (numero < 10);

	}

}
