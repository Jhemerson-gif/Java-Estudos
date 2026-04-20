package Revisao;

import java.util.Scanner;

public class Revisao_Exercicio_6 {
	
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String senha = "4339";
		int tentativa = 3;
		
		while(true) {
			
			System.out.print("Digite sua senha: ");
			
			String senhainput = entrada.nextLine();
			
			if (senhainput.equals(senha)) {
				
				System.out.println("Senha foi um sucesso!");
				break;
			}else {
				
				System.out.println("A senha inserida está incorreta, você tem mais "+ (tentativa -1)+ " tentativa.");
				
				tentativa --;
				
				if(tentativa == 0) {
					System.out.println("Senha bloqueada, você passou do limite de tentativas !");
					break;
				}
				
			}
		}
		entrada.close();
		
	}

}
