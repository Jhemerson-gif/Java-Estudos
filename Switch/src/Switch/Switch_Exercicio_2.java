package Switch;

import java.util.Scanner;

public class Switch_Exercicio_2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		
		double numero1 = entrada.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		
		double numero2 = entrada.nextInt();
		
		System.out.println("+ - Adição");
		
		System.out.println("- - Subtração");
		
		System.out.println("* - Multiplicação");
		
		System.out.println("/ - Divisão");
		
		System.out.print("Escolha um numero para a operação: ( +, -, *, /) ");
		
		char operador = entrada.next().charAt(0);
		
		
		
		switch (operador) {
		
		case '+':
			double total = (numero1 + numero2);
			System.out.println("A adição do primeiro e segundo é igual a "+total);
			break;
			
		case '-':
			double total1 = (numero1 - numero2);
			System.out.println("A subtração do primeiro e segundo é igual a "+total1);
			break;
			
		case '*':
			double total2 = (numero1 * numero2);
			System.out.println("A multiplicação do primeiro e segundo é igual a "+total2);
			break;
			
		case '/':
			if(numero2 != 0)
				
				System.out.println("A divisão do primeiro e segundo é igual a "+ (numero1 / numero2));
			
			else
				System.out.println("Erro: Divisão por zero.");
				
			break;
		default:
			
			System.out.println("Operador invalido !");
			break;
		}
		
		entrada.close();

	}

}
