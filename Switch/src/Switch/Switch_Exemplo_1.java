package Switch;

import java.util.Scanner;

public class Switch_Exemplo_1 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Esolha a sua cor favorita: ");
		
		System.out.println("1 - Azul");
		
		System.out.println("2 - Verde");
		
		System.out.println("3 - Vermelho");
		
		System.out.print("Digite o número da opção: ");

		int opcao = entrada.nextInt();
		
		switch(opcao) {
		
		case 1:
			
			System.out.println("Você escolheu a cor Azul.");
			
			break;
		
		case 2:
			System.out.println("Você escolheu a cor Verde.");
			
			break;
			
		case 3:
			
			System.out.println("Você escolheu a cor Vermelha");
			
			break;
			
		default:
			
			System.out.println("Opção invalida!");
		}
		
		entrada.close();
	}

}
