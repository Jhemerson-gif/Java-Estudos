package Switch;

import java.util.Scanner;

public class Switch_Exercicio_3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite  uma letra: ");
		
		char letra = entrada.next().charAt(0);
		
		
		switch(letra) {
		
		case 'a','e','i','o','u':
			
			System.out.println("A letra digitada é uma Vorgal !");
			break;
			
			
		default:
			if (Character.isLetter(letra)) {
			
				System.out.println("A letra digitada é uma Consoante !");
				break;
			
			}else {
				
				System.out.println("Cacactere invalido. Digite uma letra");
			}
			
		}
		
		entrada.close();

	}

}
