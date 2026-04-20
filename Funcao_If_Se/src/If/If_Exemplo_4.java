package If;

import java.util.Scanner;

public class If_Exemplo_4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a sua idade: ");
		
		int idade = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.print("Você é brasileiro ou naturalizado? (sim / não)");
		
		String nacionalidade = entrada.nextLine().toLowerCase();
		
		if (idade >= 16 && nacionalidade.equals ("sim")) {
			System.out.println("Você pode votar!");
			
		}else {
			System.out.println("Você não pode votar!");
		}
		
		entrada.close();
			
	}

}
