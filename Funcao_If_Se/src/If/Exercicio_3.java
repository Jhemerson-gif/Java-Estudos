package If;

import java.util.Scanner;
public class Exercicio_3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		
		int num1 = entrada.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		
		int num2 = entrada.nextInt();
		

		if(num1 == num2){
			
			System.out.print("O numero " + num1 + " e o " + num2 + " são iguais.");
		
		}else if (num1 > num2) {
			
			System.out.print("O numero "+num1+" é maior que o numero "+num2+".");
		}else {
			System.out.print("O numero "+num2+" é maior queo  numero " +num1+".");
		
		}
		
		

	}

}
