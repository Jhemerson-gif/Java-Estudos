package Switch;

import java.util.Scanner;

public class Switch_Exercicio_1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o numero para o dia da semana: ");
		
		System.out.println("1 - Domingo");
		
		System.out.println("2 - Segunda-Feira");
		
		System.out.println("3 - Terça-Feira");
		
		System.out.println("4 - Quarta-Feira");
		
		System.out.println("5 - Quinta-Feira");
		
		System.out.println("6 - Sexta-Feira");
		
		System.out.println("7 - Sabado");
		
		System.out.print("Escolha um numero: ");
		
		int semana = entrada.nextInt();
		
		switch (semana) {
		
		case 1:
			
			System.out.println("Você Escolheu : Domingo");
			break;
			
		case 2:
			
			System.out.println("Você Escolheu : Segunda-Feira");
			break;

		case 3:
			
			System.out.println("Você Escolheu : Terça-Feira");
			break;
			
		case 4:
			
			System.out.println("Você Escolheu : Quarta-Feira");
			break;
			
		case 5:
			
			System.out.println("Você Escolheu : Quinta-Feira");
			break;
			
		case 6:
			
			System.out.println("Você Escolheu : Sexta-Feira");
			break;
			
		case 7:
			
			System.out.println("Você Escolheu : Sabado");
			break;
		
		
		default:	
			
			System.out.print("Você escolheu uma opção invalida!");
		}
		
		entrada.close();

	}

}
