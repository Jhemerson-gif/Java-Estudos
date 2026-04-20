package Revisao;

import java.util.Scanner;

public class Revisao_Exercicio_5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num;
		while (true) {
			System.out.print("Digite um numero entre 1 a 10: ");
			
			num = entrada.nextInt();			
			if (num >= 1 && num <= 10 ) {
				
				break;
				
			}else {
				
				
				System.out.println("Valor incorreto. Digite novamente!");
			}
		
		}
		System.out.print("Numeros : ");
		for (int numero = 1; numero <= 10; numero++) {
			
			if ( num == numero) {
				
				continue;
			}
			
			System.out.print(numero +" ");
			
		}
		entrada.close();
	}

}
