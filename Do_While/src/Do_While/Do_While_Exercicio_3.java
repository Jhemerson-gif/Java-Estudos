package Do_While;

import java.util.Scanner;

public class Do_While_Exercicio_3 {
	

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Exercicio 3 - Ler números até digitar zero.");
		
		int numero;
		
		do {
			
			System.out.print("Digite um numero: " );
			
			numero = entrada.nextInt();
			
			
		}while(numero != 0);
		
		System.out.println("Fim do programa!");
		entrada.close();

	}

}
