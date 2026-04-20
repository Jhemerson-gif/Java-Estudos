package Do_While;

import java.util.Scanner;

public class Do_While_Exercicio_4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Exercício 4 - Ler números até digitar um número negativo");
		
		int numero;
		
		do {
			
			System.out.print("Digite numero: ");
			
			numero = entrada.nextInt();
			
		}while(numero >= 0 );
		
		System.out.println("Você digitou " + numero + " e encerrou o programa !");
	}

}
