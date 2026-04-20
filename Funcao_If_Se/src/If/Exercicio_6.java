package If;

import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		
		int numero = entrada.nextInt();
		
		if(numero > 0){
			System.out.print("Numero é Positivo !");
			
		}else if (numero < 0) {
			
			System.out.print("O numero é Negativo !");
			
		}else {
			
			System.out.print("O numero é igual a 0 !");
		}
	}

}
