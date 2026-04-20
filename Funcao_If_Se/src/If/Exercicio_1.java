package If;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in); // Leitura do numeor digitado
	
	System.out.print("Digite um numero: "); 
	
	int numero = entrada.nextInt(); // entrada  recebe a variavel numero em int
	
	
	
	if(numero < 0) { // Comparativo se o numero é menor que 0
		
		System.out.print("O numero não é positivo!");
	}else {
		
		System.out.print("O numero é positivo!");
	}
	entrada.close();

	}

}
