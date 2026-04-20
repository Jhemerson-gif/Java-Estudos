package Do_While;

import java.util.Scanner;
public class Do_While_Exercicio_7 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String senha;
		
		do {
			System.out.print("Digite a senha: ");
			
			senha = entrada.nextLine();
			
			if (!senha.equals("1234")) {
				
				System.out.println("Senha invalida. Tente novamente!");
			}
			
		}while(!senha.equals("1234"));
		
		System.out.println("Seu login foi um sucesso!");
		
		entrada.close();
	}

}
