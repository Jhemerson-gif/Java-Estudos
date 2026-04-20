package Do_While;

import java.util.Scanner;

public class Do_While_Exemplo_1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\n Exemplo 1: Contar de 1 até 5 com do-while \n");
		
		int contador = 1;
		
		// DO - FAZER
		do {
			
			System.out.println("Contador: "+contador);
			contador++;
			
		}while (contador <= 5);
		
		System.out.println("\n Exemplo 2: Menu simples  que repete até o usuário digitar  \n");
		
		int opcao;
		
		do {
			
			System.out.println("\n ==== MENU ====");
			System.out.println("1 - Opção 1");
			System.out.println("2 - Opção 2");
			System.out.println("0 - Sair");
			
			System.out.println("Escolha uma opção: ");
			
			opcao = entrada.nextInt();
			
			if (opcao == 1) {
				
				System.out.println("Você escolheo=u a Opção 1.");
			}else if(opcao == 2 ) {
				
				System.out.println("Você escolheu a Opção 2.");
			}else if(opcao == 0) {
				
				System.out.println("Você escolheu a saida!\n Volte sempre ! \n");
				break;
			}else {
				
				System.out.println("Opção invalida. Tente novamente.");
			}
			
		}while(opcao != 0);
		
		System.out.println("\n Exemplo 3: Validar entrada até o usuário digitar numero positivo: \n");
		
		Scanner entrada2 = new Scanner(System.in);
		
		int numero;
		
		do {
			
			System.out.println("Digite um numero positivo: ");
			
			numero = entrada2.nextInt();
			
			if (numero < 0 ) {
				
				System.out.println("Número inválido! Tente novamente.");
				
			}
		}while( numero < 0);
		
		System.out.println("Número aceito: "+ numero);
		

	}

}
