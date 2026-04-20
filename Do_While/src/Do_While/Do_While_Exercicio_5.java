package Do_While;

import java.util.Scanner;

public class Do_While_Exercicio_5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Exercício 5 - Calcular a média de números até digitar -1.");
		
		int numero;
		int contagem = 0;
		int soma = 0;
		double media;
		
		do {
			
			System.out.print("Digite numero: ");
			
			numero = entrada.nextInt();
			
			
			
			if (numero != -1) {
				
				soma += numero;
				contagem++;
			
			}
			
			
			
			
		}while (numero >= 0);
		
		media = (soma / contagem );
		
		if(contagem > 0) {
			System.out.println("A média do numero é de " + media);
		
		}else {
			System.out.println("Nenhum numero digitado !");
		}
		entrada.close();

	}

}
