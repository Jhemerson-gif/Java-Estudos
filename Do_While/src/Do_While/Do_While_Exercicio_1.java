package Do_While;

import java.util.Scanner;

public class Do_While_Exercicio_1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Exercicio 1 - Imprimir os números de 1 a 100 com do-while.");
		
		int contagem = 1;
		System.out.print("Contagem:" );
		
		do {
			
			System.out.print(contagem + " ");
			contagem++;
			
		}while( contagem < 101);

	}

}
