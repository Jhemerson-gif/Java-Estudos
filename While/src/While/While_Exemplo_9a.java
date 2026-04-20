package While;

import java.util.Scanner;

public class While_Exemplo_9a {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		
		int numero = entrada.nextInt();
		
		int fatorial = 1;
		
		int i = 1;
		
		while(i <= numero) {
			
			fatorial *= i;
			
			i ++;
			
		}
		
		System.out.print("Fatorial de " + numero + " é " + fatorial);
		entrada.close();

	}

}
