package If;

import java.util.Scanner;

public class If_Exemplo_5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a sua idade: ");
		
		int idade = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.print("Você é estudante? (Sim / Não)");
		
		String estudante = entrada.nextLine().toLowerCase();
		
		if (idade < 18 || estudante.equals("sim")){
			System.out.println("Você tem direito a meia entrada no cinema.");
		
		
		
		}else {
			System.out.println("Você não tem direito à meia entrada");
			
		}

		entrada.close();
	}

}
