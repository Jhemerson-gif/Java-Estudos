package For;

import java.util.Scanner;

public class For_Exercicio_4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double soma = 0;

		
		for (int numeros = 1; numeros <= 10; numeros++) {
			
			System.out.print("Digite o "+ numeros +" numero: ");
			
			numeros = entrada.nextInt();
			
			soma += numeros;
			
			
		}
		
		double media = soma / 10 ;
				
		
		System.out.println("\nA média dos 10 numeros digitados é de: "+ media);
		
		entrada.close();
		

	}

}
