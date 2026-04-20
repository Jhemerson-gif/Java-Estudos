package If;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um numero para descobri ser é PAR OU IMPAR: ");
		
		int numero = entrada.nextInt();
		
		if (numero % 2 == 0 ) {
			
			System.out.print("O numero é PAR!");
		}else {
			
			System.out.print("O numero é IMPAR!");
		}
		
		entrada.close();

	}

}
