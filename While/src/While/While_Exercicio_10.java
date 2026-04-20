package While;

import java.util.Scanner;

public class While_Exercicio_10 {
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
	
	
		int num1 = 0;
		int num2 = 0;
	
		System.out.print("Digite um numero: ");
	
		num1 = entrada.nextInt();
		
		System.out.print("Digite outro numero: ");
		
		num2 = entrada.nextInt();
		
		if (num1 == num2) {
			
			System.out.println("Os números são iguais. Não há numeros entre eles.");
		}else {
			
			System.out.println("Numeros entre "+ num1 + " e "+ num2 +":");
		}
						

		

		while (true) {
					
			num1++;
			System.out.print(num1);
					
			if ((num1+1) == num2) {
						
				break;
			}else if(num1 < num2){
						
				System.out.print(", ");
						
			}
		
			
	
		}
		entrada.close();	
	}
}
