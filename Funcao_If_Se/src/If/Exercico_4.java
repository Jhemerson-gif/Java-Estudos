package If;

import java.util.Scanner;

public class Exercico_4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite  um numero: ");
		
		int numero = entrada.nextInt();
		
		if (numero >= 10 && numero <= 100) {
			
			System.out.print("O numero "+ numero +" está no intervalo  de 10 a 100");
		}else {
			
			System.out.print("O numero "+ numero + " não está no intervalo de 10 a 100");
		}
		entrada.close();

	}

}
