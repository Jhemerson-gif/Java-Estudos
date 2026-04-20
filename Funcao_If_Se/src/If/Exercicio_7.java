package If;

import java.util.Scanner;

public class Exercicio_7 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o ano: ");
		
		int ano = entrada.nextInt();
		
		if ((ano % 100 != 0 && ano %4 == 0 )|| ano % 400 == 00) {
			
			System.out.print("O ano é bissesto !");
			
		}else{
			
			System.out.print("O ano não é bissesto");
		}
		
		entrada.close();
	}

}
