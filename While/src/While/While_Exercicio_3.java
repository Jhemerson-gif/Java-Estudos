package While;

import java.util.Scanner;

public class While_Exercicio_3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = -1;
		
		
		
		
		while (numero != 0) {
			
			System.out.println("Digite um numero (0 para sair)");
			
			numero = entrada.nextInt();
			
		}
		
		System.out.print("Progrma Encerrado!");
		
	}

}
