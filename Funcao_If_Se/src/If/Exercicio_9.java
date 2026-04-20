package If;

import java.util.Scanner;

public class Exercicio_9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite uma letra para descorbri se é (Vogal / Consoante)");
		
		char texto = entrada.next().toLowerCase().charAt(0);
		
		
		if (texto == 'a' || texto == 'e' || texto == 'i' || texto == 'o' || texto == 'u') {
			
			System.out.print("O texto é uma Vogal!");
		}else {
			
			System.out.print("O texto é uma consoante");
		}

	}

}
