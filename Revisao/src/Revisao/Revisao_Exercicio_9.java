package Revisao;

import java.util.Scanner;

public class Revisao_Exercicio_9 {

	public static void main(String[] args) {


		Scanner entrada = new Scanner(System.in);
		
		String palavra ;
		
		System.out.println("Digite uma palavra: ");
		
		palavra = entrada.nextLine().toLowerCase();
		
		for (int i = 0; i < palavra.length(); i++) {
			
			char letra = palavra.charAt(i);
					
			if (! (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o'|| letra == 'u')){
				
				continue;
				
			}
			
			System.out.println("Vorgal: " + letra);
		}

	}

}
