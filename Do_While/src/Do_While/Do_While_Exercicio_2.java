package Do_While;

import java.util.Scanner;

public class Do_While_Exercicio_2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Exercicio 2 - Imprimir os numeros pares de 0 a 50 com do-while.");
		
		int numero = 0;
		
		do {
			
			System.out.print(numero + ", ");
			numero+=2;
			
			if (numero == 50) {
				System.out.print(50 + " Fim da Contagem!");
			}
			
		}while(numero < 50);

	}

}
