package Do_While;

import java.util.Scanner;

public class Do_While_Exercicio_8 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Exercício 8 - Exibir a tabuada de um número com do-while");
		
		
		int contagem = 0;
		
		System.out.print("Digite o numero: ");
		
		int numero = entrada.nextInt();
		
		
		do {
			
			contagem++;
			int taboada = numero * contagem;
			
			System.out.println(numero + " x " + contagem + " = " + taboada);
			
			
			
			
			
		}while(contagem != 10);
		
		entrada.close();
	}
	

}
