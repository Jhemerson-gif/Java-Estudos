package For;

import java.util.Scanner;

public class For_Exemplo_1 {

	public static void main(String[] args) {
		

		System.out.println("\n Exemplo 1: Contar de 1 até 10 \n");
		
		for (int inicio = 1; inicio <= 10; inicio++) {
			
			System.out.println("Valor de i: "+ inicio);
		}
		
		System.out.println("\n Exemplo 2: Contar de 10 até 1 (Ordem decrescente) \n");
		
		for (int i = 10; i >= 1; i --) {
			
			System.out.println("Valor ao contrario de i: "+ i);
		}
		
		System.out.println("\n Exemplo 3: Mostra numeros de 2 a 20 \n");

		for(int i = 2; i<= 20; i+=2) {
			
			System.out.println("Número par: "+ i);
		}
		
		System.out.println("\n Exemplo 4: Somar todos os números de 1 a 100 \n");
		int soma = 0;
		
		for (int i = 1; i<=100; i++) {
			
			soma += i;
			
		}
		System.out.println("A soma de todos os numeros é de "+ soma);
		
	}
	
		
		

}
