package While;

import java.util.Scanner;

public class While_Exercicio_4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Looping in while (Digite numero negativo para sair)");
		
		int numero = 0;
		
		while(numero >= 0) {
			
			System.out.print("Digite o numero: ");
			
			numero = entrada.nextInt();
			
			
			
			
		}
		System.out.println("Fim do programa, numero negativo digitado!");
		entrada.close();

	}

}
