package While;

import java.util.Scanner;

public class While_Exercicio_7 {

	public static void main(String[] args) {


		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ler senha até que seja correta.");
		
		
		
		
		String senha = "";
		
		while (!senha.equals("1234")) {
			
			System.out.print("Digite a senha: ");
				
			senha = entrada.nextLine();
				
			if (!senha.equals("1234")) {
				
				
			
				System.out.println("Senha Incorreta. Tente novamente.");
			
			}else {
				
				System.out.println("Senha Correta, Acesso liberado!");
				
				
			}
			
		}
		entrada.close();

	}

}
